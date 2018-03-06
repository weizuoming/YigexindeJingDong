package com.dash.a1511n.presenter;

import com.dash.a1511n.model.GetAllAddrModel;
import com.dash.a1511n.model.bean.GetAllAddrBean;
import com.dash.a1511n.presenter.inter.GetAllAddrPresenterInter;
import com.dash.a1511n.view.Iview.GetAllAddrInter;
import com.dash.a1511n.view.activity.ChooseAddrActivity;

/**
 * Created by Dash on 2018/2/27.
 */
public class GetAllAddrPresenter implements GetAllAddrPresenterInter {

    private GetAllAddrInter getAllAddrInter;
    private GetAllAddrModel getAllAddrModel;

    public GetAllAddrPresenter(GetAllAddrInter getAllAddrInter) {
        this.getAllAddrInter = getAllAddrInter;
        getAllAddrModel = new GetAllAddrModel(this);
    }

    public void getAllAddr(String getAllAddrUrl, String uid) {
        getAllAddrModel.getAllAddr(getAllAddrUrl,uid);
    }

    @Override
    public void onGetAllAddrSuccess(GetAllAddrBean getAllAddrBean) {
        getAllAddrInter.onGetAllAddrSuccess(getAllAddrBean);
    }
}
