package enquire.ie.voicetalentireland;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;


public class OneFragment extends Fragment{

    SwipeRefreshLayout swipeView;
    ProgressBar progressBar;

    public OneFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment_one, container, false);

        WebView webView=(WebView)view.findViewById(R.id.webView);



        webView.loadUrl("http://contentcreator.ie/rest/api/ccp/retrieveProduct/format/json?sku=ie.contentcreator.eb0542d79034");


        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);


        if (Build.VERSION.SDK_INT >= 19) {
            webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
        }
        else {
            webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
        }





        return view;
    }

    public class TouchyWebView extends WebView {

        public TouchyWebView(Context context) {
            super(context);
        }

        public TouchyWebView(Context context, AttributeSet attrs) {
            super(context, attrs);
        }

        public TouchyWebView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event){
            requestDisallowInterceptTouchEvent(true);
            return super.onTouchEvent(event);
        }
    }


}

