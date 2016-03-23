package com.yonyou.lxp.mvptest;

import android.content.Intent;
import android.view.View;

import com.yonyou.lxp.mvptest.base.BaseActivity;
import com.yonyou.lxp.mvptest.news.NewsListActivity;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.Event;

@ContentView(R.layout.activity_main)
public class MainActivity extends BaseActivity {


    @Event(value = R.id.btn_news)
    private void onMyClick(View view) {
        switch (view.getId()) {
            case R.id.btn_news:
                Intent it = new Intent(mContext, NewsListActivity.class);
                startActivity(it);
                break;
        }
    }
}
