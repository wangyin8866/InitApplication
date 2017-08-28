package com.wy.wyman.initapplication;

import com.wy.wyman.initapplication.base.BaseActivity;
import com.wy.wyman.initapplication.model.HomeModel;
import com.wy.wyman.initapplication.presenter.HomePresenter;

/**
 * Created by wy on 2017/8/25.
 */

public class TestActivity extends BaseActivity<HomePresenter,HomeModel> {
    @Override
    public int getLayoutId() {
        return R.layout.test_main;
    }

    @Override
    public void initView() {

    }
}
