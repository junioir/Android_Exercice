package com.example.exercicemap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button BtnPhone;

    private Button BtnSms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BtnPhone=findViewById(R.id.BtnPhone);
        BtnSms=findViewById(R.id.BtnSms);
         call();
         sms();

    }

    private void sms() {
        BtnSms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    private void call() {
       BtnPhone.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               
           }
       });

    }
}