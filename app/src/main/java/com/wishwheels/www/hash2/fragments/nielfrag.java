package com.wishwheels.www.hash2.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.wishwheels.www.hash2.R;

public class nielfrag extends Fragment {
/*WebView h;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_nielfrag, container, false);
        h = v.findViewById(R.id.niela);
        h.setWebViewClient(new WebViewClient());
        h.loadUrl("file///android_asset/alon.html");
return v;
    }*/}
   /* private WebView eb;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragmentfour, container, false);
        eb = v.findViewById(R.id.Esa);
        eb.loadUrl("https://www.esa.int/ESA/Our_Missions");

        // Enable Javascript
        WebSettings webSettings = eb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // code for the fuck
        eb.getSettings().setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        eb.getSettings().setLoadWithOverviewMode(true);
        eb.getSettings().setUseWideViewPort(true);
        eb.setInitialScale(1);
        eb.getSettings().setBuiltInZoomControls(true);
        eb.getSettings().setDisplayZoomControls(false);
        // fuck has ended here
        eb.setOnKeyListener(new View.OnKeyListener() {
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if ((keyCode == KeyEvent.KEYCODE_BACK) && eb.canGoBack()) {
                    eb.goBack();
                    return true;
                }
                return false;
            }
        });
        // Force links and redirects to open in the WebView instead of in a browser\
        eb.setWebViewClient(new WebViewClient());
        return v;
}*/


