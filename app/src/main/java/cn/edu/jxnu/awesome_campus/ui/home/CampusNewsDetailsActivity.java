package cn.edu.jxnu.awesome_campus.ui.home;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

import cn.edu.jxnu.awesome_campus.R;
import cn.edu.jxnu.awesome_campus.ui.base.SwipeBackActivity;
import cn.edu.jxnu.awesome_campus.view.base.BaseView;


/**
 * Created by MummyDing on 16-2-10.
 * GitHub: https://github.com/MummyDing
 * Blog: http://blog.csdn.net/mummyding
 */

public class CampusNewsDetailsActivity extends SwipeBackActivity implements BaseView{

    private Toolbar toolbar;
    private TextView contentTitle;
    private WebView contentView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_campus_news_details);
        initView();
    }

    @Override
    public void displayLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void displayNetworkError() {

    }

    @Override
    public void initView() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        contentTitle = (TextView) findViewById(R.id.content_title);
        contentView = (WebView) findViewById(R.id.content_view);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        /**
         * 测试用 非正式代码 ---By MummyDing
         */
        contentTitle.setText("江西师大广东校友会2015年会暨2016“遇见青春”众筹演唱会羊城首演");
        String data = "<h2>Html</h2>"; //这里放html代码
        contentView.loadDataWithBaseURL("file:///android_asset/", "<link rel=\"stylesheet\" type=\"text/css\" href=\"CampusNew.css\" />"+data, "text/html", "utf-8", null);

    }
}