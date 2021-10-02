package com.lihang.nbadapter.viewholder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lihang.nbadapter.R;

/**
 * edit 2021.09.30
 */
public class MainHolder extends RecyclerView.ViewHolder {
    public TextView txt_index;
    public TextView txt_title;
    public TextView txt_des;

    public MainHolder(@NonNull View itemView) {
        super(itemView);
        txt_index = itemView.findViewById(R.id.txt_index);
        txt_title = itemView.findViewById(R.id.txt_title);
        txt_des = itemView.findViewById(R.id.txt_des);
    }
}
