package com.example.angel.rah;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class First_Screen extends AppCompatActivity {


    public static double ply=0;

    public static double l,b,h,y,z;
    static double firstAnswer=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first__screen);
    }

    public void sendData(View view){

        Calculation calc = new Calculation();

        try {

            EditText L = (EditText) findViewById(R.id.length);
            l = Double.parseDouble(L.getText().toString());

            EditText B = (EditText) findViewById(R.id.breath);
            b = Double.parseDouble(B.getText().toString());

            EditText H = (EditText) findViewById(R.id.height);
            h = Double.parseDouble(H.getText().toString());

            EditText Y = (EditText) findViewById(R.id.y);
            y = Double.parseDouble(Y.getText().toString());

            EditText Z = (EditText) findViewById(R.id.z);
            z = Double.parseDouble(Z.getText().toString());
        }
        catch(NumberFormatException e){

            Context context = getApplicationContext();
            CharSequence text = "Fill all the feilds";
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, text, duration).show();

        }
        finally {
            calc.getData(l,b,h,y,z);

            firstAnswer = calc.answer(ply);

            Intent intent = new Intent(this,Second_Screen.class);

            intent.putExtra("FirstAns",firstAnswer);

            startActivity(intent);
        }


    }

    public void buttonThree(View view){

        ply =3;

        Button B3 = (Button)findViewById(R.id.b3);
       // B3.setBackgroundColor(Color.parseColor("#FDFED2"));
        //B3.getBackground().setColorFilter(Color.parseColor("#FDFED2"), PorterDuff.Mode.MULTIPLY);
        B3.getBackground().setColorFilter(Color.YELLOW, PorterDuff.Mode.MULTIPLY);

        Button B5 = (Button)findViewById(R.id.b5);
        //B5.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B5.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

        Button B7 = (Button)findViewById(R.id.b7);
        //B7.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B7.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

        Button B9 = (Button)findViewById(R.id.b9);
        //B9.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B9.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);





    }

    public void buttonSeven(View view){

        ply=7;

        Button B3 = (Button)findViewById(R.id.b3);
        //B3.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B3.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

        Button B5 = (Button)findViewById(R.id.b5);
        //B5.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B5.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

        Button B7 = (Button)findViewById(R.id.b7);
        //B7.setBackgroundColor(Color.parseColor("#FDFED2"));
        B7.getBackground().setColorFilter(Color.YELLOW, PorterDuff.Mode.MULTIPLY);

        Button B9 = (Button)findViewById(R.id.b9);
        //B9.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B9.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

    }

    public void buttonFive(View view){

        ply=5;

        Button B3 = (Button)findViewById(R.id.b3);
        //B3.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B3.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

        Button B5 = (Button)findViewById(R.id.b5);
        //B5.setBackgroundColor(Color.parseColor("#FDFED2"));
        B5.getBackground().setColorFilter(Color.YELLOW, PorterDuff.Mode.MULTIPLY);

        Button B7 = (Button)findViewById(R.id.b7);
        //B7.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B7.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

        Button B9 = (Button)findViewById(R.id.b9);
        //B9.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B9.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

    }

    public void buttonNine(View view){

        ply=9;

        Button B3 = (Button)findViewById(R.id.b3);
        //B3.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B3.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

        Button B5 = (Button)findViewById(R.id.b5);
        //B5.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B5.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

        Button B7 = (Button)findViewById(R.id.b7);
        //B7.setBackgroundColor(Color.parseColor("#D9D9D9"));
        B7.getBackground().setColorFilter(Color.parseColor("#D9D9D9"), PorterDuff.Mode.MULTIPLY);

        Button B9 = (Button)findViewById(R.id.b9);
        //B9.setBackgroundColor(Color.parseColor("#FDFED2"));
        B9.getBackground().setColorFilter(Color.YELLOW, PorterDuff.Mode.MULTIPLY);

    }



    public void dtAns(View v){

        Calculation calc2 = new Calculation();

        try {

            EditText L = (EditText) findViewById(R.id.length);
            l = Double.parseDouble(L.getText().toString());

            EditText B = (EditText) findViewById(R.id.breath);
            b = Double.parseDouble(B.getText().toString());

            EditText H = (EditText) findViewById(R.id.height);
            h = Double.parseDouble(H.getText().toString());

            y = z = 0;
        }
        catch(NumberFormatException e){
            Context context = getApplicationContext();
            CharSequence text = "Fill all the feilds";
            int duration = Toast.LENGTH_SHORT;
            Toast.makeText(context, text, duration).show();

        }
        finally {
            calc2.getData(l,b,h,y,z);

            double decal = calc2.decal();
            double tlenght= calc2.tLength();

            TextView tv = (TextView)findViewById(R.id.textView12);
            tv.setText(new DecimalFormat("##.##").format(decal));

            TextView tv2 = (TextView)findViewById(R.id.textView9);
            tv2.setText(new DecimalFormat("##.##").format(tlenght));
        }





    }

}
