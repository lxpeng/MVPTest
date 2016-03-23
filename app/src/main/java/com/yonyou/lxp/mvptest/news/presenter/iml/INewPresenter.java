package com.yonyou.lxp.mvptest.news.presenter.iml;

/**
 * 作者： liuxiaopeng on 16/3/23.
 * 描述：
 */
public interface INewPresenter {
    void onCreate();
    void onStart();
    void loadMore();
    void refresh();
    void getData();
    void onItemClick(int position);
}
