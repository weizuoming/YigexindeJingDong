package com.dash.a1511n.presenter.inter;

import com.dash.a1511n.model.bean.DefaultAddrBean;

/**
 * Created by Dash on 2018/2/26.
 */
public interface GetDefaultAddrPresenterInter {
    void onGetDefaultAddrSuccess(DefaultAddrBean defaultAddrBean);

    void onGetDefaultAddrEmpty();
}
