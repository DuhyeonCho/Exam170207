package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.myapplication.adapters.MemoAdapter;
import com.example.myapplication.adapters.WeatherAdapter;
import com.example.myapplication.models.Weather;

import java.util.ArrayList;
import java.util.List;

public class MemoActivity extends AppCompatActivity {

    private ListView mListView;
    private MemoAdapter mAdapter;
    private List<Memo> mMemo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_memo);

        mListView = (ListView) findViewById(R.id.list_view);

        // 날씨 데이터
        mMemo = new ArrayList<>();

        // 어댑터
        mAdapter = new MemoAdapter(this, mMemo);

        // 어댑터를 뷰에 설정
        mListView.setAdapter(mAdapter);

        // 이벤트
        mListView.setOnItemClickListener(this);
        mListView.setOnItemLongClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        mAdapter.setSelect(position);
        // 데이터가 변경됨을 알려줌 = 다시 그려라
        mAdapter.notifyDataSetChanged();
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
        // 롱 클릭시 해당 아이템 삭제
        mWeatherList.remove(position);

        // 어댑터에 변경을 통지 = 다시 그려라
        mAdapter.notifyDataSetChanged();
        return true;
    }
}