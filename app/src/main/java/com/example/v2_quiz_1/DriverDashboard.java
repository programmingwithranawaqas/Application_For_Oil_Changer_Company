package com.example.v2_quiz_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DriverDashboard extends AppCompatActivity {

    TextView tvWorkerName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_dashboard);
        tvWorkerName = findViewById(R.id.tvDriverName);
        Intent intent = getIntent();
        int index = intent.getIntExtra("index", -2);
        if(index!=-2)
        {
            tvWorkerName.setText(WorkerData.getWorkerName(index));
        }
    }
}