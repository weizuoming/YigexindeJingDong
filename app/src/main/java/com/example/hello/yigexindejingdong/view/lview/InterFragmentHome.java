package com.example.hello.yigexindejingdong.view.lview;

import com.example.hello.yigexindejingdong.model.bean.FenLeiBean;
import com.example.hello.yigexindejingdong.model.bean.HomeBean;

/**
 * Created by 韦作铭 on 2018/2/24.
 */

public interface InterFragmentHome {
    void onSuccess(HomeBean homeBean);

    void onFenLeiDataSuccess(FenLeiBean fenLeiBean);
}
