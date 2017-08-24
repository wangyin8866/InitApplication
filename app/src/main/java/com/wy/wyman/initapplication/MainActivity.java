package com.wy.wyman.initapplication;

import android.util.Log;

import com.wy.wyman.initapplication.base.BaseActivity;
import com.wy.wyman.initapplication.contract.HomeContract;
import com.wy.wyman.initapplication.model.HomeModel;
import com.wy.wyman.initapplication.presenter.HomePresenter;

public class MainActivity extends BaseActivity<HomePresenter,HomeModel>implements HomeContract.View {


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initPresenter() {
        mPresenter.setVM(this,mModel);
    }

    @Override
    public void initView() {
        mPresenter.fetch("YXJH","1");
    }

    @Override
    public void showData(String str) {
        Log.e("showData", str);
    }
}
