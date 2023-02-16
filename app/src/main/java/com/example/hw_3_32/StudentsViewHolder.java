package com.example.hw_3_32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class StudentsViewHolder extends RecyclerView.ViewHolder {

    private TextView tvStudents;

    public StudentsViewHolder(@NonNull View itemView) {
        super(itemView);
        tvStudents = itemView.findViewById(R.id.tv_students);
    }

    void bind(String student) {
        tvStudents.setText(student);
    }
}
