package com.example.hello.yigexindejingdong.presenter;


import com.example.hello.yigexindejingdong.model.DeatilModel;
import com.example.hello.yigexindejingdong.model.bean.DeatilBean;
import com.example.hello.yigexindejingdong.presenter.inter.DeatilPresenterInter;
import com.example.hello.yigexindejingdong.view.lview.DetailActivityInter;

/**
 * Created by 韦作铭 on 2018/2/23.
 */
public class DeatailPresenter implements DeatilPresenterInter {

    private DeatilModel deatilModel;
    private DetailActivityInter detailActivityInter;

    public DeatailPresenter(DetailActivityInter detailActivityInter) {
        this.detailActivityInter = detailActivityInter;

        deatilModel = new DeatilModel(this);

    }

    public void getDetailData(String detailUrl, int pid) {

        deatilModel.getDetailData(detailUrl,pid);
    }

    @Override
    public void onSuccess(DeatilBean deatilBean) {
        //回调给view
        detailActivityInter.onSuccess(deatilBean);
    }
}
