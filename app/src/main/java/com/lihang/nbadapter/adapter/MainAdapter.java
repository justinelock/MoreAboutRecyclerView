package com.lihang.nbadapter.adapter;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.lihang.nbadapter.BaseAdapter;
import com.lihang.nbadapter.R;
import com.lihang.nbadapter.bean.MainBean;
import com.lihang.nbadapter.viewholder.MainHolder;

/**
 * edit 2021.09.30
 */
public class MainAdapter extends BaseAdapter<MainBean> {
    final int TYPE_ONE = 0;
    final int TYPE_TWO = 1;


    @Override
    public int getMyViewType(int position) {
        if (position % 2 == 0) {
            return TYPE_ONE;
        } else {
            return TYPE_TWO;
        }
    }


    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup viewGroup, int viewType) {
        switch (viewType) {
            case TYPE_ONE:
                return new MainHolder(getResId(viewGroup, R.layout.item_main_one));
            default:
                return new MainHolder(getResId(viewGroup, R.layout.item_main_two));
        }
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        MainHolder mainHolder = (MainHolder) viewHolder;
        MainBean itemBean = dataList.get(position);
        mainHolder.txt_index.setText(position + 1 + "");
        mainHolder.txt_title.setText(itemBean.getTitle());
        mainHolder.txt_des.setText(itemBean.getDes());
    }


}
