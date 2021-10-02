package com.lihang.nbadapter.adapter;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.lihang.nbadapter.BaseAdapter;
import com.lihang.nbadapter.R;
import com.lihang.nbadapter.viewholder.AddHeadHolder;

/**
 * edit 2021.09.30
 */
public class AddHeadAdapter extends BaseAdapter<String> {
    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup viewGroup, int viewType) {
        return new AddHeadHolder(getResId(viewGroup, R.layout.item_simple));
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        final String itemBean = dataList.get(position);
        AddHeadHolder addHeadHolder = (AddHeadHolder) viewHolder;
        addHeadHolder.txt.setText(itemBean + " ==== " + position);
    }

}
