package com.yonyou.lxp.mvptest.news;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.yonyou.lxp.mvptest.R;
import com.yonyou.lxp.mvptest.base.BaseTwoActivity;
import com.yonyou.lxp.mvptest.entity.NewsInfo;
import com.yonyou.lxp.mvptest.news.presenter.NewPresenter;
import com.yonyou.lxp.mvptest.news.view.iml.INewView;

import org.xutils.view.annotation.ContentView;
import org.xutils.view.annotation.ViewInject;

import java.util.ArrayList;
import java.util.List;

@ContentView(R.layout.activity_news_list)
public class NewsListActivity extends BaseTwoActivity implements INewView {
    private NewPresenter newPresenter;
    private ArrayAdapter<NewsInfo> adapter;
    public List<NewsInfo> list = new ArrayList<>();


    @ViewInject(R.id.rv_news)
    private ListView rv_news;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initViews();
        newPresenter = new NewPresenter(this);
    }

    @Override
    protected void onStart() {
        super.onStart();
        newPresenter.onStart();
    }

    private void initViews() {
//        rv_news.setloadmor{
//            newPresenter.loadMore();
//        }
//        rv_news.setRefresh{
//            newPresenter.refresh();
//        }
        adapter=new ArrayAdapter<NewsInfo>(mContext,R.layout.item_news,R.id.tv_item_news_name,list);
        rv_news.setAdapter(adapter);
    }

    @Override
    public void rs(List<NewsInfo> data) {
        list.clear();
        adapter.notifyDataSetChanged();
        list.addAll(data);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void lm(List<NewsInfo> data) {
        list.addAll(data);
        adapter.notifyDataSetChanged();
    }
}
