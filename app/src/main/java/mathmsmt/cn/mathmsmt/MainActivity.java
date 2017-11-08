package mathmsmt.cn.mathmsmt;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView wView = (WebView)findViewById(R.id.wv1);
        WebSettings wSet = wView.getSettings();
        wSet.setJavaScriptEnabled(true);

        wView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                if(url!=""){
                    view.loadUrl(url);
                }
                return true;
            }
        });

        wView.loadUrl("http://123.57.219.210/MathMSMT/main.html?id=0");
    }
}
