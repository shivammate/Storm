package com.example.shivammishra.storm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Correct4 extends AppCompatActivity {
    private Button b12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct4);
        OnClickButton12();
    }
    public void OnClickButton12(){
        b12=(Button)findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent15= new Intent("com.example.shivammishra.storm.q5");
                startActivity(intent15);
            }
        });

    }
}