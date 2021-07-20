package com.example.himclient;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class signActivity extends AppCompatActivity {

    public Button btn_sign;
    boolean sign = true;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign);


        btn_sign=findViewById(R.id.btn_sign);


        btn_sign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sign) {
                    btn_sign.setText("가입취소");
                    btn_sign.setBackgroundColor(Color.parseColor("#A566FF"));
                    sign = false;
                }
                else {
                    btn_sign.setText("가입하기");
                    btn_sign.setBackgroundColor(Color.parseColor("#f1243f"));
                    sign = true;
                }
            }
        });


    }
}