package com.lihang.nbadapter.viewholder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lihang.nbadapter.R;

/**
 * edit 2021.09.30
 */
public class ExpandFarterHolder extends RecyclerView.ViewHolder {
    public TextView txt_title;
    public ImageView image_gou;

    public ExpandFarterHolder(@NonNull View itemView) {
        super(itemView);
        txt_title = itemView.findViewById(R.id.txt_title);
        image_gou = itemView.findViewById(R.id.image_gou);
    }
}
