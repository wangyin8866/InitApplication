package com.wy.wyman.initapplication;

import android.content.Intent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wy.wyman.initapplication.base.BaseActivity;
import com.wy.wyman.initapplication.view.HomeView;
import com.wy.wyman.initapplication.model.HomeModel;
import com.wy.wyman.initapplication.presenter.HomePresenter;

public class MainActivity extends BaseActivity<HomePresenter,HomeModel>implements HomeView {
    private TextView mTextView;

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void initView() {
        mTextView = (TextView) findViewById(R.id.tv);


        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, TestActivity.class));
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        mPresenter.fetch("YXJH","1");
    }

    @Override
    public void showData(String str) {
        Toast.makeText(this,"wangyin",Toast.LENGTH_SHORT).show();
    }

}
