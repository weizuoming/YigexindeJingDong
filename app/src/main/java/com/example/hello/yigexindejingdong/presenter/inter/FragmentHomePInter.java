package com.example.hello.yigexindejingdong.presenter.inter;


import com.example.hello.yigexindejingdong.model.bean.FenLeiBean;
import com.example.hello.yigexindejingdong.model.bean.HomeBean;

/**
 * Created by 韦作铭 on 2018/2/23.
 */
public interface FragmentHomePInter {
    //首页的数据
    void onSuccess(HomeBean homeBean);
    //分类
    void onFenLeiDataSuccess(FenLeiBean fenLeiBean);
}
