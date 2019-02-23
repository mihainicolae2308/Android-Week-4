package com.example.week4codechallenges;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class StudentsActivity extends AppCompatActivity {

    private static final int STUDENTS_COUNT = 20;
    private RecyclerView mRecyclerViewStudents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_students);
        initView();
    }

    private void initView() {
        mRecyclerViewStudents = findViewById(R.id.recycler_view_students);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        mRecyclerViewStudents.setLayoutManager(layoutManager);

        StudentAdapter studentAdapter = new StudentAdapter(getStudents(), StudentsActivity.this);
        mRecyclerViewStudents.setAdapter(studentAdapter);
    }

    private List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        Student student;
        for (int i = 1; i <= STUDENTS_COUNT; i++) {
            student = new Student();
            student.setFirstName("FirstName " + i);
            student.setLastName("LastName " + i);
            students.add(student);
        }
        return students;
    }
}
