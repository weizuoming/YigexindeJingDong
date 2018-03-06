package com.example.hello.yigexindejingdong.presenter;


import com.example.hello.yigexindejingdong.model.FragmentFenLeiRightModel;
import com.example.hello.yigexindejingdong.model.bean.ChildFenLeiBean;
import com.example.hello.yigexindejingdong.presenter.inter.FenLeiRightPresenterInter;
import com.example.hello.yigexindejingdong.view.lview.FenLeiRightInter;

/**
 * Created by 韦作铭 on 2018/2/23.
 */
public class FragmentFenLeiRightPresenter implements FenLeiRightPresenterInter {

    private FenLeiRightInter fenLeiRightInter;
    private FragmentFenLeiRightModel fragmentFenLeiRightModel;

    public FragmentFenLeiRightPresenter(FenLeiRightInter fenLeiRightInter) {
        this.fenLeiRightInter = fenLeiRightInter;

        fragmentFenLeiRightModel = new FragmentFenLeiRightModel(this);
    }

    public void getChildData(String childFenLeiUrl, int cid) {

        fragmentFenLeiRightModel.getChildData(childFenLeiUrl,cid);
    }

    @Override
    public void onSuncess(ChildFenLeiBean childFenLeiBean) {

        fenLeiRightInter.getSuccessChildData(childFenLeiBean);

    }
}
