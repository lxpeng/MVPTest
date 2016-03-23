package com.yonyou.lxp.mvptest.news.view.iml;

import com.yonyou.lxp.mvptest.entity.NewsInfo;

import java.util.List;

/**
 * 作者： liuxiaopeng on 16/3/23.
 * 描述：
 */
public interface INewView {
//    void getData();
    void rs(List<NewsInfo> data);
    void lm(List<NewsInfo> data);
}
