package com.example.hw_3_32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> studentsList;
    private StudentsAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_students);
        LoadData();
        adapter = new StudentsAdapter(studentsList);
        recyclerView.setAdapter(adapter);
    }

    private void LoadData() {
        studentsList = new ArrayList<>();
        studentsList.add("Aitbaev IVT-1");
        studentsList.add("Isakov IVT-1");
        studentsList.add("Asanov IVT-1");
        studentsList.add("Omorov IVT-1");
        studentsList.add("Aman uulu POSVT-1");
        studentsList.add("Dayirov POSVT-2");
        studentsList.add("Nurlanov POSVT-4");
        studentsList.add("Nurlanov POSVT-4");
        studentsList.add("Nurlanov POSVT-4");
        studentsList.add("Nurlanov POSVT-4");
    }
}