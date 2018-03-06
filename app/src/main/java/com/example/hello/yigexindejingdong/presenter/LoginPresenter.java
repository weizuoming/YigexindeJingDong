package com.example.hello.yigexindejingdong.presenter;

import com.example.hello.yigexindejingdong.model.LoginModel;
import com.example.hello.yigexindejingdong.model.bean.LoginBean;
import com.example.hello.yigexindejingdong.presenter.inter.LoginPresenterInter;
import com.example.hello.yigexindejingdong.view.lview.LoginActivityInter;

/**
 * Created by 韦作铭 on 2018/3/1.
 */

public class LoginPresenter implements LoginPresenterInter {
    private LoginModel loginModel;
    private LoginActivityInter loginActivityInter;
    public LoginPresenter(LoginActivityInter loginActivityInter) {
        this.loginActivityInter = loginActivityInter;

        loginModel = new LoginModel(this);
    }
    //处理逻辑用的...判断
    public void getLogin(String loginUrl, String phone, String pwd) {

        loginModel.getLogin(loginUrl,phone,pwd);

    }
    @Override
    public void onSuccess(LoginBean loginBean) {
        loginActivityInter.getLoginSuccess(loginBean);
    }
}
