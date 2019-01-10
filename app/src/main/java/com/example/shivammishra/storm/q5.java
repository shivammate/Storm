package com.example.shivammishra.storm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.shivammishra.storm.Variable.c;

public class q5 extends AppCompatActivity {
    private static RadioGroup Rg;
    private static RadioButton s1,ans;
    private static Button sbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);
        OnClick5();
    }
    public void OnClick5()
    {
        Rg=(RadioGroup)findViewById(R.id.RadioGroup5);
        ans=(RadioButton)findViewById(R.id.radioButton15);
        sbm=(Button)findViewById(R.id.button14);
        sbm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int SelectedID=Rg.getCheckedRadioButtonId();
                s1=(RadioButton)findViewById(SelectedID);
                //Toast.makeText(q2.this,s1.getText().toString(),Toast.LENGTH_SHORT).show();
                if(s1==ans)
                {
                    c++;
                    Intent intent20= new Intent("com.example.shivammishra.storm.Correct5");
                    startActivity(intent20);
                }
                else
                {
                    Intent intent21= new Intent("com.example.shivammishra.storm.Wrong5");
                    startActivity(intent21);
                }
            }
        });


    }

}
