package com.techpenta.retrievefirebase;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ViewHolder extends RecyclerView.ViewHolder {

    public  TextView txtview;
    public ImageView imgview;


    public ViewHolder(View itemView) {
        super(itemView);

        txtview = (TextView) itemView.findViewById(R.id.title);
        imgview = (ImageView) itemView.findViewById(R.id.thumbnail);
        //Loading image from url into imageView

        // Log.i("imageurl",image);


    }   //Loading image from url into imageView

    }

