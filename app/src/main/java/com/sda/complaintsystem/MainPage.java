package com.sda.complaintsystem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainPage extends AppCompatActivity {

    AppCompatButton btn_complaint, btn_status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        btn_complaint = findViewById(R.id.btn_complaint);
        btn_status = findViewById(R.id.btn_status);

        btn_complaint.setOnClickListener(v -> {
            Intent intent=new Intent(MainPage.this, ComplaintPage.class);
            startActivity(intent);
        });

        btn_status.setOnClickListener(v -> {
            Intent intent=new Intent(MainPage.this, StatusPage.class);
            startActivity(intent);
        });

    }
}