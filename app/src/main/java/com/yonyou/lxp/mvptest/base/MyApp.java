package com.yonyou.lxp.mvptest.base;

import android.app.Application;

import org.xutils.x;

/**
 * 作者： liuxiaopeng on 16/3/23.
 * 描述：
 */
public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
        x.Ext.setDebug(true); // 是否输出debug日志
    }
}
