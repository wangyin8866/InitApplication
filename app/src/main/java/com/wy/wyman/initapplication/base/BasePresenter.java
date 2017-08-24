package com.wy.wyman.initapplication.base;

import android.content.Context;

import com.wy.wyman.initapplication.base.baserx.RxManager;

/**
 * Created by zj on 2017/8/24.
 */

public class BasePresenter<T, E> {
    public Context mContext;
    public E mModel;
    public T mView;
    public RxManager mRxManage = new RxManager();

    public void setVM(T v, E m) {
        this.mView = v;
        this.mModel = m;
        this.onStart();
    }

    public void onStart() {


    }

    public void onDestroy() {
        mRxManage.clear();
    }

}
