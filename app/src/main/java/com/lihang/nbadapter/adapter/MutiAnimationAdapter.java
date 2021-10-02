package com.lihang.nbadapter.adapter;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.lihang.nbadapter.AnimationType;
import com.lihang.nbadapter.BaseAdapter;
import com.lihang.nbadapter.R;
import com.lihang.nbadapter.viewholder.AnimationHolder;

/**
 * edit 2021.09.30
 */
public class MutiAnimationAdapter extends BaseAdapter<String> {
    @Override
    public RecyclerView.ViewHolder getViewHolder(ViewGroup viewGroup, int viewType) {
        return new AnimationHolder(getResId(viewGroup, R.layout.item_animation));
    }

    @Override
    public void onBindMyViewHolder(RecyclerView.ViewHolder viewHolder, int position) {
        AnimationHolder animationHolder = (AnimationHolder) viewHolder;
        String itemBean = dataList.get(position);
        animationHolder.txt.setText(itemBean);
        if (position % 2 == 0) {
            this.showItemAnim(AnimationType.TRANSLATE_FROM_LEFT, true);
        } else {
            this.showItemAnim(AnimationType.TRANSLATE_FROM_RIGHT, true);
        }
    }

}
