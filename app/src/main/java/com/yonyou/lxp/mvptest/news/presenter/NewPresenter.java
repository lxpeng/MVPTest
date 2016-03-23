package com.yonyou.lxp.mvptest.news.presenter;

import com.yonyou.lxp.mvptest.entity.NewsInfo;
import com.yonyou.lxp.mvptest.news.NewsListActivity;
import com.yonyou.lxp.mvptest.news.model.NewsModel;
import com.yonyou.lxp.mvptest.news.model.iml.INewsModel;
import com.yonyou.lxp.mvptest.news.presenter.iml.INewPresenter;

import org.xutils.common.util.LogUtil;

import java.util.List;

/**
 * 作者： liuxiaopeng on 16/3/23.
 * 描述：
 */
public class NewPresenter implements INewPresenter {
    private NewsListActivity iNewView;
    private NewsModel model;

    public NewPresenter(NewsListActivity iNewView) {
        this.iNewView = iNewView;
        model = new NewsModel();
    }

    @Override
    public void onCreate() {

    }

    @Override
    public void onStart() {
        refresh();
    }

    @Override
    public void loadMore() {
        model.getData(1, new INewsModel.ICallBack() {
            @Override
            public void onResult(List<NewsInfo> data) {
                iNewView.lm(data);
            }
        });
    }

    @Override
    public void refresh() {
        model.getData(1, new INewsModel.ICallBack() {
            @Override
            public void onResult(List<NewsInfo> data) {
                iNewView.lm(data);
            }
        });
    }

    @Override
    public void getData() {
        model.getData(1, new INewsModel.ICallBack() {
            @Override
            public void onResult(List<NewsInfo> data) {
                iNewView.lm(data);
            }
        });
    }

    @Override
    public void onItemClick(int position) {
        LogUtil.e(position + "==");
    }


}
