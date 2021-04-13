package com.example.v2_quiz_1;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ManagerDashboard extends AppCompatActivity {

    private final int ADD_CAR_INFO_ACTIVITY = 1;
    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager_dashboard);
        btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ManagerDashboard.this, MainActivity.class));
                finish();
            }
        });

    }

    public void addCarInformation(View v)
    {
        Intent intent = new Intent(ManagerDashboard.this, AddCarInformationActivity.class);
        startActivityForResult(intent, ADD_CAR_INFO_ACTIVITY);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == ADD_CAR_INFO_ACTIVITY)
        {
            if(resultCode == RESULT_OK)
            {
                Worker w = new Worker();

              w.setCarNumber(data.getStringExtra("carNum"));
              w.setOwnerName(data.getStringExtra("carOwner"));
              w.setOwnerAddress(data.getStringExtra("ownerAddress"));
              w.setOwnerPhone(data.getStringExtra("ownerPh"));
              w.setLastReading(Integer.parseInt(data.getStringExtra("lastReading")));
              w.setWorkerName(data.getStringExtra("workerName"));
              w.setId(Long.parseLong(data.getStringExtra("id")));
              w.setPin(Long.parseLong(data.getStringExtra("pin")));

              if(WorkerData.addWorker(w))
              {
                  Toast.makeText(this, "Car info has been added successfully into the system.", Toast.LENGTH_SHORT).show();
              }
            }
            else if(resultCode == RESULT_CANCELED)
            {
                Toast.makeText(this, "Car info not added into the system.", Toast.LENGTH_SHORT).show();
            }
        }
    }
}