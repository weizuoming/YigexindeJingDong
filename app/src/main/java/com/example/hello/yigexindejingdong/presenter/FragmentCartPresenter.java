package com.example.hello.yigexindejingdong.presenter;

import com.example.hello.yigexindejingdong.model.CartModel;
import com.example.hello.yigexindejingdong.model.bean.CartBean;
import com.example.hello.yigexindejingdong.presenter.inter.CartPresenterInter;
import com.example.hello.yigexindejingdong.view.lview.FragmentCartInter;

/**
 * Created by 韦作铭 on 2018/3/1.
 */

public class FragmentCartPresenter implements CartPresenterInter {

    private FragmentCartInter fragmentCartInter;
    private CartModel cartModel;

    public FragmentCartPresenter(FragmentCartInter fragmentCartInter) {
        this.fragmentCartInter = fragmentCartInter;

        cartModel = new CartModel(this);
    }

    public void getCartData(String selectCart, String uid) {

        cartModel.getCartData(selectCart,uid);

    }

    @Override
    public void getCartDataNull() {
        fragmentCartInter.getCartDataNull();
    }

    @Override
    public void getCartDataSuccess(CartBean cartBean) {
        fragmentCartInter.getCartDataSuccess(cartBean);
    }
}
