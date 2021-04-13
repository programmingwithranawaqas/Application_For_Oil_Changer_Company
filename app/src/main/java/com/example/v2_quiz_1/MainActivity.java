package com.example.v2_quiz_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etEmail, etPassword;
    Button btnLogin, btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username, password;
                username = etEmail.getText().toString().trim();
                password = etPassword.getText().toString().trim();
                if(username.isEmpty() || password.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Password or email invalid", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(username.equals("Manager") && password.equals("Manager123"))
                    {
                        Intent intent = new Intent(MainActivity.this, ManagerDashboard.class);
                        startActivity(intent);
                        finish();
                    }
                    else
                    {
                        long id = Long.parseLong(username);
                        long pin = Long.parseLong(password);
                        int index = WorkerData.existDriver(id, pin);
                        if(index != -1)
                        {
                            Intent intent = new Intent(MainActivity.this, DriverDashboard.class);
                            intent.putExtra("index",index);
                            startActivity(intent);
                            finish();
                        }
                        else
                        {
                            Toast.makeText(MainActivity.this, "Wrong Username or password", Toast.LENGTH_SHORT).show();
                        }
                    }
                }

            }
        });

    }

    private void init() {
        etEmail = findViewById(R.id.etEmail);
        etPassword  = findViewById(R.id.etPassword);
        btnLogin  = findViewById(R.id.btnLogin);
        btnCancel = findViewById(R.id.btnCancel);
    }
}