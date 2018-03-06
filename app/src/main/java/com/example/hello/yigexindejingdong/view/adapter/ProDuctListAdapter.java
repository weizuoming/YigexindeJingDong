package com.example.hello.yigexindejingdong.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.hello.yigexindejingdong.R;
import com.example.hello.yigexindejingdong.model.bean.ProductListBean;
import com.example.hello.yigexindejingdong.view.hodler.ProductListHolder;

/**
 * Created by 韦作铭 on 2018/2/24.
 */

public class ProDuctListAdapter extends RecyclerView.Adapter<ProductListHolder>{
    private ProductListBean productListBean;
    private Context context;

    public ProDuctListAdapter(Context context, ProductListBean productListBean) {
        this.context = context;
        this.productListBean = productListBean;
    }

    @Override
    public ProductListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context, R.layout.product_list_item_layout,null);
        ProductListHolder productListHolder = new ProductListHolder(view);

        return productListHolder;
    }

    @Override
    public void onBindViewHolder(ProductListHolder holder, int position) {

        ProductListBean.DataBean dataBean = productListBean.getData().get(position);

        //赋值
        holder.product_list_title.setText(dataBean.getTitle());
        holder.product_list_price.setText("¥"+dataBean.getBargainPrice());

        Glide.with(context).load(dataBean.getImages().split("\\|")[0]).into(holder.product_list_image);

    }

    @Override
    public int getItemCount() {
        return productListBean.getData().size();
    }
}
