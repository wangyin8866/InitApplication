package com.wy.wyman.initapplication;

import android.widget.Toast;

import com.wy.wyman.initapplication.base.BaseActivity;
import com.wy.wyman.initapplication.view.HomeView;
import com.wy.wyman.initapplication.model.HomeModel;
import com.wy.wyman.initapplication.presenter.HomePresenter;

public class MainActivity extends BaseActivity<HomePresenter,HomeModel>implements HomeView {


    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mPresenter.fetch("YXJH","1");
    }

    @Override
    public void showData(String str) {
        Toast.makeText(this,"wangyin",Toast.LENGTH_SHORT).show();
    }

}
