package com.lihang.nbadapter.activity;

import androidx.recyclerview.widget.RecyclerView;

import com.lihang.nbadapter.R;
import com.lihang.nbadapter.adapter.HoriAdapter;
import com.lihang.nbadapter.base.BaseActivity;

import java.util.ArrayList;

import butterknife.BindView;

/**
 * Created by leo
 * on 2019/8/27.
 */
public class SmartHoriNormalActivity extends BaseActivity {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private HoriAdapter adapter;
    ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public String getActivityTitle() {
        return "正常横向加载";
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_smart_horinormal;
    }

    @Override
    protected void processLogic() {
        for (int i = 0; i < 5; i++) {
            arrayList.add("1");
        }
        adapter = new HoriAdapter();
        adapter.setDataList(arrayList);
        recyclerView.setAdapter(adapter);
    }
}
