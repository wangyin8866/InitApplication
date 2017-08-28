package com.wy.wyman.initapplication.api;

import java.util.Map;

import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import rx.Observable;

/**
 * des:ApiService
 * Created by wy
 */
public interface ApiService {
    @FormUrlEncoded
    @POST(NetConstantValues.PRODUCT_LIST)
    Observable<Object> getProductList(@FieldMap Map<String, String> params);

}
