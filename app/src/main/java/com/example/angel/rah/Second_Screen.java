package com.example.angel.rah;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class Second_Screen extends AppCompatActivity {

    public static double price,op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second__screen);

        Intent intent = getIntent();

        op = intent.getDoubleExtra("FirstAns",1);

        TextView tv = (TextView)findViewById(R.id.textView4);
        //tv.setText(Double.toString(op));
        tv.setText(new DecimalFormat("##.##").format(op));
    }

    public void sendAns(View view){

        Calculation calc = new Calculation();

        try {
            EditText P = (EditText) findViewById(R.id.editText7);
            price = Double.parseDouble(P.getText().toString());
        }
        catch(NumberFormatException e){
            Context context = getApplicationContext();
            CharSequence text = "Fill all the feilds";
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, text, duration).show();
        }
        finally {
            double fn= calc.finalAnswer(price,op);

            Intent intent = new Intent(this,Third_Screen.class);

            intent.putExtra("FinalAns",fn);

            startActivity(intent);

        }

    }
}
