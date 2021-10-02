package com.lihang.nbadapter.adapter;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.lihang.nbadapter.BaseAdapter;
import com.lihang.nbadapter.R;
import com.lihang.nbadapter.viewholder.SimpleHolder;

/**
 * edit 2021.09.30
 */
public class RecoverAdapter extends BaseAdapter<String> {
    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup viewGroup, int viewType) {
        return new SimpleHolder(getResId(viewGroup, R.layout.item_recover));
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
    }

}
