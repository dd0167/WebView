package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    String url="https://www.google.com/";
    EditText et1;
    EditText et2;
    EditText et3;
    Button sp;
    String a;
    String b;
    String c;
    String url2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wv=(WebView) findViewById(R.id.wv);
        wv.getSettings().setJavaScriptEnabled(true);
        wv.loadUrl(url);
        wv.setWebViewClient(new MyWebViewClient());

        sp=(Button) findViewById(R.id.sp);

        et1=(EditText) findViewById(R.id.et1);
        et2=(EditText) findViewById(R.id.et2);
        et3=(EditText) findViewById(R.id.et3);
    }

    private class MyWebViewClient extends WebViewClient {
        public boolean shouldOverideUrlLoading(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    public void click(View view) {
        a=et1.getText().toString();
        b=et2.getText().toString();
        c=et3.getText().toString();
        url2="https://www.google.com/search?q="+a+"x%5E2%2B"+b+"x%2B"+c+"&oq=2x%5E2%2B4x%2B3&aqs=chrome..69i57j0l7.7867j0j9&sourceid=chrome&ie=UTF-8";
        if (a.equals("") || b.equals("") || c.equals(""))
        {
            Toast.makeText(this, "Enter The Number!", Toast.LENGTH_SHORT).show();
        }
        else if (a.equals("-") || b.equals("-") || c.equals("-")) {
            Toast.makeText(this, "Eror!", Toast.LENGTH_SHORT).show();
        }
        else if (a.equals(".") || b.equals(".") || c.equals(".")) {
            Toast.makeText(this, "Eror!", Toast.LENGTH_SHORT).show();
        }
        else
        {
            if (!a.equals("0") && !b.equals("0") && !c.equals("0")) {
                url2="https://www.google.com/search?q=" + a + "x%5E2%2B" + b + "x%2B" + c + "&oq=5x%5E2%2B4x%2B2&aqs=chrome..69i57j0l7.18581j0j7&sourceid=chrome&ie=UTF-8";
            }
            if (a.equals("0") && b.equals("0") && c.equals("0")) {
                url2= "https://www.google.com/search?q=y%3D0&oq=y%3D2&aqs=chrome..69i59j69i57j0l6.6921j0j7&sourceid=chrome&ie=UTF-8";
            }
            if (!a.equals("0") && b.equals("0") && c.equals("0")) {
                url2= "https://www.google.com/search?q=" + a + "x%5E2&oq=2x%5E2&aqs=chrome.0.69i59l6j0l2.2330j0j7&sourceid=chrome&ie=UTF-8";
            }
            if (a.equals("0") && !b.equals("0") && c.equals("0")) {
                url2= "https://www.google.com/search?q=y%3D" + b + "x&oq=y%3D&aqs=chrome.0.69i59l3j69i57j69i59j0l3.2874j0j7&sourceid=chrome&ie=UTF-8";
            }
            if (a.equals("0") && b.equals("0") && !c.equals("0")) {
                url2= "https://www.google.com/search?q=y%3D" + c + "&oq=y%3D2&aqs=chrome..69i59j69i57j0l6.6921j0j7&sourceid=chrome&ie=UTF-8";
            }
            if (a.equals("0") && !b.equals("0") && !c.equals("0")) {
                url2="https://www.google.com/search?q=" + b + "x%2B" + c + "&oq=4x%2B6&aqs=chrome..69i57j0l7.4441j0j7&sourceid=chrome&ie=UTF-8";
            }
            if (!a.equals("0") && b.equals("0") && !c.equals("0")) {
                url2="https://www.google.com/search?q=" + a + "x%5E2%2B" + c + "&oq=6x%5E2%2B4&aqs=chrome..69i57j69i59l3j0l4.4952j0j7&sourceid=chrome&ie=UTF-8";
            }
            if (!a.equals("0") && !b.equals("0") && c.equals("0")) {
                url2="https://www.google.com/search?q=" + a + "x%5E2%2B" + b + "x&oq=6x%5E2%2B4x&aqs=chrome..69i57j69i59l2j0l5.3302j0j7&sourceid=chrome&ie=UTF-8";
            }
            wv.loadUrl(url2);
        }
    }
}
