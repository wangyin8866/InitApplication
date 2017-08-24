package com.wy.wyman.initapplication.presenter;

import android.util.Log;

import com.wy.wyman.initapplication.base.baserx.RxSubscriber;
import com.wy.wyman.initapplication.contract.HomeContract;

/**
 * Created by wy on 2017/8/24.
 *
 */

public class HomePresenter extends HomeContract.Presenter {


    @Override
    public void fetch(String product_category_id, String page_index) {
        mRxManage.add(mModel.getData(product_category_id,page_index).subscribe(new RxSubscriber<Object>(mContext,true) {
            @Override
            protected void _onNext(Object s) {
            }

            @Override
            protected void _onError(String message) {
                Log.e("onError", message);
            }
        }));
    }

}
