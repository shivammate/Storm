package com.example.shivammishra.storm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.shivammishra.storm.Variable.c;

public class q4 extends AppCompatActivity {
    private static RadioGroup Rg;
    private static RadioButton s1,ans;
    private static Button sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);
        OnClick4();
    }
    public void OnClick4()
    {
        Rg=(RadioGroup)findViewById(R.id.RadioGroup4);
        ans=(RadioButton)findViewById(R.id.radioButton11);
        sbm=(Button)findViewById(R.id.button11);
        sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int SelectedID=Rg.getCheckedRadioButtonId();
                s1=(RadioButton)findViewById(SelectedID);
                //Toast.makeText(q2.this,s1.getText().toString(),Toast.LENGTH_SHORT).show();
                if(s1==ans)
                {
                    c++;
                    Intent intent12= new Intent("com.example.shivammishra.storm.Correct4");
                    startActivity(intent12);
                }
                else
                {
                    Intent intent13= new Intent("com.example.shivammishra.storm.Wrong4");
                    startActivity(intent13);
                }
            }
        });


    }

}

