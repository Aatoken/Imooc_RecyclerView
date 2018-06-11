package com.atoken.cn.imooc_recyclerview;

import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static com.atoken.cn.imooc_recyclerview.R.id.recyclerView;

public class MainActivity extends AppCompatActivity {


    RecyclerView mRecyclerView;
    private List<String> mDatas;
    private SimpleAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();

        initData();


        //adapter
        mAdapter = new SimpleAdapter(this, mDatas);
        mRecyclerView.setAdapter(mAdapter);

        //布局管理
        //LinearLayoutManager manager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false);
        GridLayoutManager manager=new GridLayoutManager(this,3);

        mRecyclerView.setLayoutManager(manager);

        //设置分割线
        mRecyclerView.addItemDecoration(BaseDecoration.create(ContextCompat.getColor(this
                , R.color.app_background), 5));

    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(recyclerView);
    }


    private void initData() {
        mDatas = new ArrayList<>();
        for (int i = 'A'; i < 'Z'; i++) {
            mDatas.add("" + (char) i);
        }
    }


}
