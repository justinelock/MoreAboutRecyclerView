package com.lihang.nbadapter.activity;

import androidx.recyclerview.widget.RecyclerView;

import com.lihang.nbadapter.R;
import com.lihang.nbadapter.adapter.MutiAnimationAdapter;
import com.lihang.nbadapter.base.BaseActivity;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * edit 2021.09.30
 */
public class MutifyActivity extends BaseActivity {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private MutiAnimationAdapter adapter;
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public String getActivityTitle() {
        return "多种动画";
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_simple;
    }

    @Override
    protected void processLogic() {
        for (int i = 0; i < 25; i++) {
            arrayList.add("带有动画item" + i);
        }
        adapter = new MutiAnimationAdapter();
        recyclerView.setAdapter(adapter);
        adapter.setDataList(arrayList);
    }
}
