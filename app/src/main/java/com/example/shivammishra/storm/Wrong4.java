package com.example.shivammishra.storm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wrong4 extends AppCompatActivity {
    private Button b13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong4);
        OnClickButton13();
    }
    public void OnClickButton13(){
        b13=(Button)findViewById(R.id.button13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent17= new Intent("com.example.shivammishra.storm.q5");
                startActivity(intent17);
            }
        });

    }
}
