package com.example.shivammishra.storm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.shivammishra.storm.Variable.c;
import static com.example.shivammishra.storm.Variable.per;

public class end extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        set();
      //  button17();
    }
  /* public void button17()
   {
       Button b17;
       b17=(Button)findViewById(R.id.button17);
       b17.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               System.exit(0);



           }
       });

   }
   */
    public void set()
    {

        TextView t1;
        TextView t2;
        TextView t3;
        t1=(TextView)findViewById(R.id.textView29);
        t1.setText(c+"");
        t2=(TextView)findViewById(R.id.textView32);
        if(c==0)
        t2.setText("0%");
        if(c==1)
        t2.setText("20%");
        if(c==2)
        t2.setText("40%");
        if(c==3)
        t2.setText("60%");
        if(c==4)
        t2.setText("80%");
        if(c==5)
        t2.setText("100%");
        t3=(TextView)findViewById(R.id.textView33);

        if(per>=60)
        {

            t3.setText("YOU ARE GREAT !!!");
        }
        else
        {
            t3.setText("Good You played well");

        }


    }
}
