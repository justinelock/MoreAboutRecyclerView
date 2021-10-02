package com.lihang.nbadapter.activity;

import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.lihang.nbadapter.R;
import com.lihang.nbadapter.adapter.GridAdapter;
import com.lihang.nbadapter.base.BaseActivity;

import java.util.ArrayList;
import java.util.Random;

import butterknife.BindView;
import butterknife.OnClick;

/**
 * edit 2021.09.30
 */
public class GridActivity extends BaseActivity {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    private GridAdapter adapter;
    private ArrayList<String> arrayList = new ArrayList<>();

    @Override
    public String getActivityTitle() {
        return getString(R.string.grid_use);
    }

    @Override
    public int getContentViewId() {
        return R.layout.activity_grid;
    }

    @Override
    protected void processLogic() {
        for (int i = 0; i < 8; i++) {
            arrayList.add("position ==> " + i);
        }

        adapter = new GridAdapter();
        //设置网格布局间隔，不用担心会不会不等分，一切已经计算好(由于是在复杂之计算到了5列)
        adapter.setGridDivide(recyclerView, (int) getResources().getDimension(R.dimen.dp_10));
        adapter.setDataList(arrayList);
        recyclerView.setAdapter(adapter);

        addHead();
        addFoot();

    }

    @OnClick(R.id.btn_add)
    public void addHead() {
        View headLayout = LayoutInflater.from(GridActivity.this).inflate(R.layout.layout_head, null);
        TextView head_txt = headLayout.findViewById(R.id.head_txt);
        int red = new Random().nextInt(255);
        int green = new Random().nextInt(255);
        int blue = new Random().nextInt(255);

        head_txt.setBackgroundColor(Color.argb(255, red, green, blue));
        adapter.addHeadView(headLayout);
    }

    @OnClick(R.id.btn_remove)
    public void removeHead() {
        adapter.removeHeadView(0);
    }


    @OnClick(R.id.btn_addfoot)
    public void addFoot() {
        View headLayout = LayoutInflater.from(GridActivity.this).inflate(R.layout.layout_foot, null);
        TextView head_txt = headLayout.findViewById(R.id.head_txt);
        int red = new Random().nextInt(255);
        int green = new Random().nextInt(255);
        int blue = new Random().nextInt(255);

        head_txt.setBackgroundColor(Color.argb(255, red, green, blue));
        adapter.addFootView(headLayout);
    }

    @OnClick(R.id.btn_removefoot)
    public void removeFoot() {
        adapter.removeFootView(0);
    }

}
