package com.example.week4codechallenges;

import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {

    private List<Student> mStudents;
    private Context mContext;

    public StudentAdapter(List<Student> students, Context context) {
        mStudents = students;
        mContext = context;
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.student_item, viewGroup, false );
        return new StudentViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder studentViewHolder, int i) {
        Student currentStudent = mStudents.get(i);
        studentViewHolder.getTextViewFirstName().setText(currentStudent.getFirstName());
        studentViewHolder.getTextViewLastName().setText(currentStudent.getLastName());
        if (i % 2 == 0) {
            studentViewHolder.itemView.setBackgroundColor(Color.parseColor(mContext.getString(R.string.grey)));        }
    }

    @Override
    public int getItemCount() {
        return mStudents.size();
    }
}
