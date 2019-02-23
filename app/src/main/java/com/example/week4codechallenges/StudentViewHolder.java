package com.example.week4codechallenges;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class StudentViewHolder extends RecyclerView.ViewHolder {
    private TextView mTextViewFirstName;
    private TextView mTextViewLastName;

    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);

        mTextViewFirstName = itemView.findViewById(R.id.text_view_first_name);
        mTextViewLastName = itemView.findViewById(R.id.text_view_last_name);
    }

    public TextView getTextViewFirstName() {
        return mTextViewFirstName;
    }

    public void setTextViewFirstName(TextView textViewFirstName) {
        mTextViewFirstName = textViewFirstName;
    }

    public TextView getTextViewLastName() {
        return mTextViewLastName;
    }

    public void setTextViewLastName(TextView textViewLastName) {
        mTextViewLastName = textViewLastName;
    }
}
