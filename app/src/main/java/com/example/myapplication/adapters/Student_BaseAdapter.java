package com.example.myapplication.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.myapplication.models.Student;

import java.util.ArrayList;

/**
 * Created by develop on 2017-02-07.
 */

public class Student_BaseAdapter extends BaseAdapter {
    Context mContext = null;
    ArrayList<Student> mData = null;
    LayoutInflater mLAYOUTiNFLATER = null;

    public Student_BaseAdapter(Context mContext, ArrayList<Student> mData, LayoutInflater mLAYOUTiNFLATER) {
        this.mContext = mContext;
        this.mData = mData;
        this.mLAYOUTiNFLATER = mLAYOUTiNFLATER;
    }

    @Override
    //
    public int getCount() {
        return mData.size();
    }

    @Override
    //
    public Object getItem(int position) {
        return position;
    }

    @Override
    //
    public long getItemId(int position) {
        return mData.get(position);
    }

    @Override
    //
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
