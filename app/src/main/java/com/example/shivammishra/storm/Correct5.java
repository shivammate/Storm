package com.example.shivammishra.storm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Correct5 extends AppCompatActivity {
    private Button b15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct5);
        OnClickButton15();
    }
    public void OnClickButton15(){
        b15=(Button)findViewById(R.id.button15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent22= new Intent("com.example.shivammishra.storm.end");
                startActivity(intent22);
            }
        });

    }
}
