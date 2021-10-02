package com.lihang.nbadapter.viewholder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import com.lihang.nbadapter.R;

/**
 * edit 2021.09.30
 */
public class PagerUseHolder extends RecyclerView.ViewHolder {
    public ImageView image;

    public PagerUseHolder(@NonNull View itemView) {
        super(itemView);
        image = itemView.findViewById(R.id.image);
    }
}
