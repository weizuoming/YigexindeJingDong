package com.example.hello.yigexindejingdong.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.hello.yigexindejingdong.R;
import com.example.hello.yigexindejingdong.model.bean.ChildFenLeiBean;
import com.example.hello.yigexindejingdong.view.hodler.FenRecyclerInnerHolder;
import com.example.hello.yigexindejingdong.view.lview.OnItemListner;

/**
 * Created by 韦作铭 on 2018/2/24.
 */

public class FenRecyclerInnerAdapter extends RecyclerView.Adapter<FenRecyclerInnerHolder>{
    private ChildFenLeiBean.DataBean dataBean;
    private Context context;
    private OnItemListner onItemListner;

    public FenRecyclerInnerAdapter(Context context, ChildFenLeiBean.DataBean dataBean) {
        this.context = context;
        this.dataBean = dataBean;
    }


    @Override
    public FenRecyclerInnerHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = View.inflate(context, R.layout.fen_recycler_innner_layout,null);
        FenRecyclerInnerHolder fenRecyclerInnerHolder = new FenRecyclerInnerHolder(view);

        return fenRecyclerInnerHolder;
    }

    @Override
    public void onBindViewHolder(FenRecyclerInnerHolder holder, final int position) {

        ChildFenLeiBean.DataBean.ListBean listBean = dataBean.getList().get(position);

        //赋值
        holder.recycler_inner_text.setText(listBean.getName());
        Glide.with(context).load(listBean.getIcon()).into(holder.recycler_innner_image);

        //点击事件
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //回到
                onItemListner.onItemClick(position);
            }
        });

    }

    @Override
    public int getItemCount() {
        return dataBean.getList().size();
    }

    public void setOnItemListner(OnItemListner onItemListner) {
        this.onItemListner = onItemListner;
    }
}
