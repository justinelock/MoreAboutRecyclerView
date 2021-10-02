package com.lihang.nbadapter.viewholder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lihang.nbadapter.R;

/**
 * edit 2021.09.30
 */
public class ExpandSonHolder extends RecyclerView.ViewHolder {
    public TextView txt_title;

    public ExpandSonHolder(@NonNull View itemView) {
        super(itemView);
        txt_title = itemView.findViewById(R.id.txt_title);
    }
}
