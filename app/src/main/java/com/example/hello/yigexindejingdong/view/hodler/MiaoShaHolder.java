package com.example.hello.yigexindejingdong.view.hodler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.example.hello.yigexindejingdong.R;


/**
 * Created by Dash on 2018/1/24.
 */
public class MiaoShaHolder extends RecyclerView.ViewHolder {

    public ImageView imageView;

    public MiaoShaHolder(View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.miao_sha_image);

    }
}
