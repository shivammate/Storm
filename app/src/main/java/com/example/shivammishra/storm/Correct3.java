package com.example.shivammishra.storm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Correct3 extends AppCompatActivity {
    private Button b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_correct3);
        OnClickButton10();
    }
    public void OnClickButton10(){
        b10=(Button)findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent9= new Intent("com.example.shivammishra.storm.q4");
                startActivity(intent9);
            }
        });

    }
}

