package com.example.hello.yigexindejingdong.model;

import com.example.hello.yigexindejingdong.model.bean.CartBean;
import com.example.hello.yigexindejingdong.presenter.inter.CartPresenterInter;
import com.example.hello.yigexindejingdong.util.CommonUtils;
import com.example.hello.yigexindejingdong.util.OkHttp3Util_03;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/**
 * Created by 韦作铭 on 2018/3/1.
 */

public class CartModel {
    private CartPresenterInter cartPresenterInter;

    public CartModel(CartPresenterInter cartPresenterInter) {
        this.cartPresenterInter = cartPresenterInter;
    }

    public void getCartData(String selectCart, String uid) {

        Map<String, String> params = new HashMap<>();
        params.put("uid",uid);

        OkHttp3Util_03.doPost(selectCart, params, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                if (response.isSuccessful()) {
                    final String json = response.body().string();

                    CommonUtils.runOnUIThread(new Runnable() {
                        @Override
                        public void run() {
                            if ("null".equals(json)) {//购物车为空

                                cartPresenterInter.getCartDataNull();
                            }else {
                                //解析
                                CartBean cartBean = new Gson().fromJson(json,CartBean.class);

                                cartPresenterInter.getCartDataSuccess(cartBean);

                            }
                        }
                    });


                }
            }
        });

    }
}
