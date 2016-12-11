package com.talon.baserecyclerviewadapterhelperdemo;

import android.media.DrmInitData;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Student> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerView = (RecyclerView) findViewById(R.id.main_recyclerView);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        initData();
        mRecyclerView.setAdapter(new MyAdapter(data));
    }

    private void initData() {
        data = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setName("Talon" + 1);
            student.setIconUrl("http://qlogo1.store.qq.com/qzone/731838568/731838568/100?1365354959");
            data.add(student);
        }
    }
}
