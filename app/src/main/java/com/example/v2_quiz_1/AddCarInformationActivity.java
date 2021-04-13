package com.example.v2_quiz_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddCarInformationActivity extends AppCompatActivity {

    EditText etCarNumber;
    EditText etCarOnwerName;
    EditText etOwnerAddress;
    EditText etOwnerPhone;
    EditText etLastReading;
    EditText etWorkerName;
    EditText etID;
    EditText etPin;
    Button btnAdd, btnCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_car_information);
        init();

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             String carNum=   etCarNumber.getText().toString().trim();
             String carOwner  = etCarOnwerName.getText().toString().trim();
             String ownerAddress =   etOwnerAddress.getText().toString().trim();
             String ownerPh =   etOwnerPhone.getText().toString().trim();
             String lastReading =  etLastReading.getText().toString().trim();
             String workerName =   etWorkerName.getText().toString().trim();
             String id =   etID.getText().toString().trim();
             String pin =    etPin.getText().toString().trim();

                Intent intent = new Intent();
                intent.putExtra("carNum",carNum);
                intent.putExtra("carOwner",carOwner);
                intent.putExtra("ownerAddress",ownerAddress);
                intent.putExtra("ownerPh",ownerPh);
                intent.putExtra("lastReading",lastReading);
                intent.putExtra("workerName",workerName);
                intent.putExtra("id",id);
                intent.putExtra("pin",pin);

                setResult(RESULT_OK, intent);
                finish();

            }
        });

    }

    private void init() {
        etCarNumber=findViewById(R.id.etCarNumber);
        etCarOnwerName=findViewById(R.id.etCarOwnerName);
        etOwnerAddress=findViewById(R.id.etOwnerAddress);
        etOwnerPhone=findViewById(R.id.etCarOwnerPhone);
        etLastReading=findViewById(R.id.etLastReading);
        etWorkerName=findViewById(R.id.etWorkerName);
        etID=findViewById(R.id.etId);
        etPin=findViewById(R.id.etpin);
        btnAdd=findViewById(R.id.btnAdd);
        btnCancel=findViewById(R.id.btnCancel);
    }
}