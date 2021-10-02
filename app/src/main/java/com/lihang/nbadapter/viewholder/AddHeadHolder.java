package com.lihang.nbadapter.viewholder;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.lihang.nbadapter.R;

/**
 * edit 2021.09.30
 */
public class AddHeadHolder extends RecyclerView.ViewHolder {
    public TextView txt;
    public AddHeadHolder(@NonNull View itemView) {
        super(itemView);
        txt = itemView.findViewById(R.id.txt);
    }
}
