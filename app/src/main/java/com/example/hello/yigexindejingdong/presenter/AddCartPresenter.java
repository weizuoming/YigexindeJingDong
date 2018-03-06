package com.example.hello.yigexindejingdong.presenter;

import com.example.hello.yigexindejingdong.model.AddCartModel;
import com.example.hello.yigexindejingdong.model.bean.AddCartBean;
import com.example.hello.yigexindejingdong.presenter.inter.AddCartPresenterInter;
import com.example.hello.yigexindejingdong.view.lview.ActivityAddCartInter;

/**
 * Created by 韦作铭 on 2018/3/1.
 */

public class AddCartPresenter implements AddCartPresenterInter {

    private ActivityAddCartInter activityAddCartInter;
    private AddCartModel addCartModel;

    public AddCartPresenter(ActivityAddCartInter activityAddCartInter) {
        this.activityAddCartInter = activityAddCartInter;

        addCartModel = new AddCartModel(this);
    }

    public void addToCart(String addCart, String uid, int pid) {

        addCartModel.addToCart(addCart,uid,pid);

    }

    @Override
    public void onCartAddSuccess(AddCartBean addCartBean) {
        activityAddCartInter.onCartAddSuccess(addCartBean);
    }
}
