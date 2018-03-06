package com.example.hello.yigexindejingdong.view.lview;


import com.example.hello.yigexindejingdong.model.bean.CartBean;

/**
 * Created by Dash on 2018/1/30.
 */
public interface FragmentCartInter {
    void getCartDataNull();

    void getCartDataSuccess(CartBean cartBean);
}
