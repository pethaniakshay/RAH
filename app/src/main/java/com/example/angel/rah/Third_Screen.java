package com.example.angel.rah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Third_Screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third__screen);

        Intent intent = getIntent();

        double print = intent.getDoubleExtra("FinalAns",1);

        TextView tv = (TextView)findViewById(R.id.textView8);
        //tv.setText(Double.toString(print));
        tv.setText(new DecimalFormat("##.##").format(print));

    }
}
