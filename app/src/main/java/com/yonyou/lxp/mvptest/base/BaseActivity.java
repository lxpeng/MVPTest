package com.yonyou.lxp.mvptest.base;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.xutils.common.util.LogUtil;
import org.xutils.view.annotation.Event;
import org.xutils.x;

/**
 * Created by liuxiaopeng on 16/1/31.
 */
public abstract class BaseActivity extends AppCompatActivity{

    public Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x.view().inject(this);
        mContext = this;
    }
}
