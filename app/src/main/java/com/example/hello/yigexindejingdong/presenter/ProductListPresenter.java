package com.example.hello.yigexindejingdong.presenter;


import com.example.hello.yigexindejingdong.model.ProductListModel;
import com.example.hello.yigexindejingdong.model.bean.ProductListBean;
import com.example.hello.yigexindejingdong.presenter.inter.ProductListPresenterInter;
import com.example.hello.yigexindejingdong.view.lview.ProductListActivityInter;

/**
 * Created by 韦作铭 on 2018/2/23.
 */
public class ProductListPresenter implements ProductListPresenterInter {

    private ProductListModel productListModel;
    private ProductListActivityInter productListActivityInter;

    public ProductListPresenter(ProductListActivityInter productListActivityInter) {
        this.productListActivityInter = productListActivityInter;

        productListModel = new ProductListModel(this);
    }

    public void getProductData(String seartchUrl, String keywords, int page) {

        productListModel.getProductData(seartchUrl,keywords,page);
    }

    @Override
    public void onSuccess(ProductListBean productListBean) {
        productListActivityInter.getProductDataSuccess(productListBean);
    }
}
