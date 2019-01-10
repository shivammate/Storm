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

public class q2 extends AppCompatActivity {
    private static RadioGroup Rg;
    private static RadioButton s1,ans;
    private static Button sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);
        OnClick2();
    }
    public void OnClick2()
    {
        Rg=(RadioGroup)findViewById(R.id.RadioGroup2);
        ans=(RadioButton)findViewById(R.id.radioButton4);
        sbm=(Button)findViewById(R.id.button5);
        sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int SelectedID=Rg.getCheckedRadioButtonId();
                s1=(RadioButton)findViewById(SelectedID);
                //Toast.makeText(q2.this,s1.getText().toString(),Toast.LENGTH_SHORT).show();
                if(s1==ans)
                {
                    c++;
                    Intent intent6= new Intent("com.example.shivammishra.storm.Correct2");
                    startActivity(intent6);
                }
                else
                {
                    Intent intent7= new Intent("com.example.shivammishra.storm.Wrong2");
                    startActivity(intent7);
                }
            }
        });


    }

}
