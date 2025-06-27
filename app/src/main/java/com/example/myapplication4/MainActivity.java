package com.example.myapplication4;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    SportAdapter sportAdapter;
    List<Sport> sportList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerViewSports);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        sportList = new ArrayList<>();
        sportList.add(new Sport("Basketball", R.drawable.basketball));
        sportList.add(new Sport("Volleyball", R.drawable.volleyball));
        sportList.add(new Sport("Football", R.drawable.football));
        sportList.add(new Sport("Tennis", R.drawable.tennis));

        sportAdapter = new SportAdapter(sportList);
        recyclerView.setAdapter(sportAdapter);
    }
}
