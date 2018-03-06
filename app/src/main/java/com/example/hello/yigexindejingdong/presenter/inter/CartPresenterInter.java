package com.example.hello.yigexindejingdong.presenter.inter;

import com.example.hello.yigexindejingdong.model.bean.CartBean;

/**
 * Created by 韦作铭 on 2018/3/1.
 */

public interface CartPresenterInter {
    void getCartDataNull();

    void getCartDataSuccess(CartBean cartBean);
}
