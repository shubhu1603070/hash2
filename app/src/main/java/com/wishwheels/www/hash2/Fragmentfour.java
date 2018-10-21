
package com.wishwheels.www.hash2;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Fragmentfour extends Fragment {
    private WebView web;

    public Fragmentfour() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmentfour, container, false);
        web = v.findViewById(R.id.Esa);
        web.loadUrl("https://www.esa.int/ESA/Our_Missions");

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
        // fuck has ended here
        web.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && web.canGoBack()) {
                    web.goBack();
                    return true;
                }
                return false;
            }
        });
        // Force links and redirects to open in the WebView instead of in a browser\
        web.setWebViewClient(new WebViewClient());
        return v;
    }
}