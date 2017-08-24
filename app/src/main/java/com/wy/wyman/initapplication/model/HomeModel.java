package com.wy.wyman.initapplication.model;

import com.wy.wyman.initapplication.api.Api;
import com.wy.wyman.initapplication.api.HostType;
import com.wy.wyman.initapplication.base.baserx.RxSchedulers;
import com.wy.wyman.initapplication.contract.HomeContract;

import rx.Observable;

/**
 * Created by zj on 2017/8/24.
 */

public class HomeModel extends HomeContract.Model {
    @Override
    public Observable<Object> getData(String product_category_id, String page_index) {
        map.clear();
        map.put("productCategoryId", product_category_id);
        map.put("pageIndex", page_index);
        map.put("platform", "HLW");
        map.put("client", "ANDROID");
        return Api.getDefault(HostType.TEST).getProductList(map).compose(RxSchedulers.io_main());
    }
}
