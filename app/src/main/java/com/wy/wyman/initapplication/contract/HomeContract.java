package com.wy.wyman.initapplication.contract;

import com.wy.wyman.initapplication.base.BaseModel;
import com.wy.wyman.initapplication.base.BasePresenter;
import com.wy.wyman.initapplication.base.BaseView;

import rx.Observable;

/**
 * Created by zj on 2017/8/24.
 */

public interface HomeContract {

    abstract class Model extends BaseModel {
       public abstract Observable<Object> getData(String product_category_id, String page_index);
    }

    interface View extends BaseView {
        void showData(String str);
    }

    abstract class Presenter extends BasePresenter<View, Model> {

        public abstract void fetch(String product_category_id, String page_index);

    }

}
