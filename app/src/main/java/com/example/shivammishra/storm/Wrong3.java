package com.example.shivammishra.storm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Wrong3 extends AppCompatActivity {
    private Button b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong3);
        OnClickButton9();
    }
    public void OnClickButton9(){
        b9=(Button)findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent12= new Intent("com.example.shivammishra.storm.q4");
                startActivity(intent12);
            }
        });

    }
}
