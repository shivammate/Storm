package com.example.shivammishra.storm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import static com.example.shivammishra.storm.Variable.c;

public class q1 extends AppCompatActivity {
    private static RadioGroup Rg;
    private static RadioButton s1,ans;
    private static Button sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q1);
        OnClick();
    }
    public void OnClick()
    {
       Rg=(RadioGroup)findViewById(R.id.RadioGroup);
        ans=(RadioButton)findViewById(R.id.radioButton);
        sbm=(Button)findViewById(R.id.button2);
        sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int SelectedID=Rg.getCheckedRadioButtonId();
                s1=(RadioButton)findViewById(SelectedID);
               // Toast.makeText(q1.this,s1.getText().toString(),Toast.LENGTH_SHORT).show();
                if(s1==ans)
                {
                    c++;
                    Intent intent2= new Intent("com.example.shivammishra.storm.Correct");
                    startActivity(intent2);
                }
                else
                {
                    Intent intent5= new Intent("com.example.shivammishra.storm.Wrong");
                    startActivity(intent5);
                }
            }
        });


    }

}

