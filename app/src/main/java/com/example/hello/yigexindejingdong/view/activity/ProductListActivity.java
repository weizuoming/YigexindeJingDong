package com.example.hello.yigexindejingdong.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.hello.yigexindejingdong.R;
import com.example.hello.yigexindejingdong.model.bean.ProductListBean;
import com.example.hello.yigexindejingdong.presenter.ProductListPresenter;
import com.example.hello.yigexindejingdong.util.ApiUtil;
import com.example.hello.yigexindejingdong.view.adapter.ProDuctListAdapter;
import com.example.hello.yigexindejingdong.view.lview.ProductListActivityInter;

public class ProductListActivity extends AppCompatActivity implements ProductListActivityInter {

    private String keywords;
    private RecyclerView product_list_recycler;
    private RecyclerView product_grid_recycler;
    private ProductListPresenter productListPresenter;
    private int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_list);

        product_list_recycler = findViewById(R.id.product_list_recycler);
        product_grid_recycler = findViewById(R.id.product_grid_recycler);

        productListPresenter = new ProductListPresenter(this);

        //接收传递的关键词
        keywords = getIntent().getStringExtra("keywords");
        if (keywords != null) {
            //根据关键词和page去请求列表数据

            productListPresenter.getProductData(ApiUtil.SEARTCH_URL,keywords,page);

        }

    }

    @Override
    public void getProductDataSuccess(ProductListBean productListBean) {
        //设置适配器就可以了

        product_list_recycler.setLayoutManager(new LinearLayoutManager(ProductListActivity.this));
        ProDuctListAdapter proDuctListAdapter = new ProDuctListAdapter(ProductListActivity.this, productListBean);
        product_list_recycler.setAdapter(proDuctListAdapter);

    }
}
