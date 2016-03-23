package com.yonyou.lxp.mvptest.news.model.iml;

import com.yonyou.lxp.mvptest.entity.NewsInfo;

import java.util.List;

/**
 * 作者： liuxiaopeng on 16/3/23.
 * 描述：
 */
public interface INewsModel {
    void getData(int pageNow,ICallBack callback);

    public interface ICallBack{
        public void onResult(List<NewsInfo> data);
    }
}
