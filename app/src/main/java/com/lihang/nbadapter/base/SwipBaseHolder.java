package com.lihang.nbadapter.base;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.View;

import com.lihang.nbadapter.swiphelper.Extension;

/**
 * Created by leo
 * on 2019/8/27.
 */
public abstract class SwipBaseHolder extends RecyclerView.ViewHolder implements Extension {

    public abstract int getSlidItemWith();

    public SwipBaseHolder(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public float getActionWidth() {
        return getSlidItemWith();
    }
}
