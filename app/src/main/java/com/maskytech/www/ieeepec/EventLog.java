package com.maskytech.www.ieeepec;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;

import android.view.View;

import android.widget.ImageView;
import android.widget.TextView;

class EventHolder extends RecyclerView.ViewHolder {
    ImageView imgIcon;
    TextView txtTitle;
    TextView txtTitle1;

    public EventHolder(@NonNull View itemView) {
        super(itemView);
        txtTitle = itemView.findViewById(R.id.txtv1);
        txtTitle1 = itemView.findViewById(R.id.txtv2);
        imgIcon = itemView.findViewById(R.id.imageView);
    }
}
