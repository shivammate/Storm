package com.example.shivammishra.storm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wrong5 extends AppCompatActivity {
    private Button b16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong5);
        OnClickButton16();
    }
    public void OnClickButton16(){
        b16=(Button)findViewById(R.id.button16);
        b16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent24= new Intent("com.example.shivammishra.storm.end");
                startActivity(intent24);
            }
        });

    }
}