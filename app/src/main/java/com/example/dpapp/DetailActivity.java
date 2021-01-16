package com.example.dpapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {

    ImageView mainImageView;
    TextView planView, descView;

    String plan, desc;
    int myImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        mainImageView = findViewById(R.id.mainImageView);
        planView = findViewById(R.id.planView);
        descView = findViewById(R.id.descView);

        getData();
        setData();
    }

    private void getData() {
        if(getIntent().hasExtra("myImage") &&
                getIntent().hasExtra("plan") && getIntent().hasExtra("desc")){
            plan = getIntent().getStringExtra("plan");
            desc = getIntent().getStringExtra("desc");
            myImage = getIntent().getIntExtra("myImage", 1);

        } else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        planView.setText(plan);
        descView.setText(desc);
        mainImageView.setImageResource(myImage);
    }
}