package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myapplication.models.Student;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {
    ArrayList<Student>
    mData = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);
        // 어댑터에서 사용할 데이터 설정
        //=====================================
        mData = new ArrayList<Student>();
        for(int i = 0; i < 100; i++)
        {
            Student student = new Student();
            Student.mName = "슈퍼성근" + i;
            Student.mNumber = "95000" + i;
            Student.mDepartment = "컴퓨터 공학" + i;

            mData.add(student);
        }
        //======================================
    }
}
