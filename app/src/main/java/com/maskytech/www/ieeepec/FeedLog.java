package com.maskytech.www.ieeepec;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class FeedLog extends RecyclerView.ViewHolder {
    TextView txtview;
    TextView txtview1;
    TextView txtview2;
    ImageView img;
    public FeedLog(@NonNull View itemView) {
        super(itemView);
        txtview=itemView.findViewById(R.id.ieeepec);
        txtview1=itemView.findViewById(R.id.titleBlog);
        txtview2=itemView.findViewById(R.id.txtdescription);
        img=itemView.findViewById(R.id.imageView);
    }
}
