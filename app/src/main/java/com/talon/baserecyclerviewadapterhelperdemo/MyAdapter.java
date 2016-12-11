package com.talon.baserecyclerviewadapterhelperdemo;

import android.net.Uri;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * Created by Talon on 2016/12/11.
 */

public class MyAdapter extends BaseQuickAdapter<Student, BaseViewHolder> {

    public MyAdapter(List<Student> data) {
        super(R.layout.recycleritem, data);
    }

    @Override
    protected void convert(BaseViewHolder viewHolder, Student student) {
        viewHolder.setText(R.id.item_name, student.getName());
        Uri uri = Uri.parse(student.getIconUrl());
        SimpleDraweeView simpleDraweeView = viewHolder.getView(R.id.item_icon);
        simpleDraweeView.setImageURI(uri);
    }
}
