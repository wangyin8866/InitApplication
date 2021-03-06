package com.wy.wyman.initapplication.base;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import com.wy.wyman.initapplication.base.baseapp.AppManager;
import com.wy.wyman.initapplication.base.baseapp.BaseApplication;
import com.wy.wyman.initapplication.base.baserx.RxManager;
import com.wy.wyman.initapplication.utils.TUtil;
import com.wy.wyman.initapplication.utils.immerse.ImmersionBar;

/**
 * Created by wy on 2017/8/24.
 */

public abstract class BaseActivity<T extends BasePresenter, E> extends AppCompatActivity {
    public T mPresenter;
    public E mModel;
    public Context mContext;
    public RxManager mRxManager;
    private boolean isConfigChange;
    private ImmersionBar mImmersionBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mRxManager = new RxManager();
        doBeforeSetContentView();
        setContentView(getLayoutId());
        mContext = BaseApplication.getAppContext();
        mPresenter = TUtil.getT(this, 0);
        mModel = TUtil.getT(this, 1);

        if (mPresenter != null) {
            mPresenter.mContext = mContext;
            mPresenter.attach(this);
            mPresenter.setVM(mModel);
        }
        this.initView();
    }

    /**
     * 设置layout前配置
     */
    private void doBeforeSetContentView() {
        // 把actvity放到application栈中管理
        AppManager.getAppManager().addActivity(this);
        // 无标题
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 设置竖屏
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        // 默认着色状态栏
        SetStatusBarColor();

    }

    /*********************子类实现*****************************/
    //获取布局文件
    public abstract int getLayoutId();


    //初始化view
    public abstract void initView();

    /**
     * 沉浸式状态栏
     */
    protected void SetStatusBarColor() {
        mImmersionBar = ImmersionBar.with(this);
        mImmersionBar.statusBarDarkFont(true).init();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        isConfigChange = true;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (mPresenter != null) {
            mPresenter.onDestroy();
            mPresenter.detach();
        }
        if (mRxManager != null) {
            mRxManager.clear();
        }
        if (!isConfigChange) {
            AppManager.getAppManager().finishActivity(this);
        }
    }
}
