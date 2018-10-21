package com.wishwheels.www.hash2;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;



public class JAXA extends Fragment {

    private WebView web;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_jax, container, false);
        web = v.findViewById(R.id.jaxa);
        web.loadUrl("http://global.jaxa.jp/projects/index.html");

        // Enable Javascript
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // code for the fuck
        web.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        web.getSettings().setLoadWithOverviewMode(true);
        web.getSettings().setUseWideViewPort(true);
        web.setInitialScale(1);
        web.getSettings().setBuiltInZoomControls(true);
        web.getSettings().setDisplayZoomControls(false);
        //code for the fuck ends here
        web.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && web.canGoBack()) {
                    web.goBack();
                    return true;
                }
                return false;
            }
        });

        web.setWebViewClient(new WebViewClient());
        return v;
    }

}