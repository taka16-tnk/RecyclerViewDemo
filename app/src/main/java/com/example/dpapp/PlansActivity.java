package com.example.dpapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


public class PlansActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String plans[], description[];
    int images[] = {
            R.drawable.ic_get_up,
            R.drawable.ic_walk,
            R.drawable.ic_office,
            R.drawable.ic_meal,
            R.drawable.ic_develop,
            R.drawable.ic_break,
            R.drawable.ic_bath,
            R.drawable.ic_sleep};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plans);

        recyclerView = findViewById(R.id.recyclerView);

        plans = getResources().getStringArray(R.array.plans);
        description = getResources().getStringArray(R.array.description);

        PlansAdapter plansAdapter = new PlansAdapter(this, plans, description, images);
        recyclerView.setAdapter(plansAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}