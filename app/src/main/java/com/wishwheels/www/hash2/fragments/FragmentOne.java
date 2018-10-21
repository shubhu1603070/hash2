package com.wishwheels.www.hash2.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;

import com.wishwheels.www.hash2.R;

public class FragmentOne extends Fragment {
    private WebView web ;
    public FragmentOne() {
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
        View v =  inflater.inflate(R.layout.fragment_one, container, false);
        web = v.findViewById(R.id.webview);
        web.loadUrl("https://www.nasa.gov/launchschedule/");

        // Enable Javascript
        WebSettings webSettings = web.getSettings();
        webSettings.setJavaScriptEnabled(true);
        web.setOnKeyListener(new View.OnKeyListener(){
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

