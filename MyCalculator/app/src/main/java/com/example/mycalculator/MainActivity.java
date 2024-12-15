package com.example.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    double result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Lifecycle: ","in OnCreate()");
        EditText EDTnumber1 = findViewById(R.id.editTextnumber1);
        EditText EDTnumber2 = findViewById(R.id.editTextnumber2);
        Button Buttonplus = findViewById(R.id.buttonplus);
        Button Buttonminus =findViewById(R.id.buttonminus);
        Button Buttondivided =findViewById(R.id.buttondivided);
        Button Buttontimes =findViewById(R.id.buttontimes);
        TextView Textviewresult = findViewById(R.id.textView_result);
        Buttonplus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO plus
                double number1 = Double.parseDouble(EDTnumber1.getText().toString());
                double number2 = Double.parseDouble(EDTnumber2.getText().toString());
                result = number1 + number2;
                Textviewresult.setText(String.valueOf(result));
            }});
        Buttonminus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO minus
                double number1 = Double.parseDouble(EDTnumber1.getText().toString());
                double number2 = Double.parseDouble(EDTnumber2.getText().toString());
                result = number1-number2;
                Textviewresult.setText(String.valueOf(result));
            }});
        Buttondivided.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO divided
                double number1 = Double.parseDouble(EDTnumber1.getText().toString());
                double number2 = Double.parseDouble(EDTnumber2.getText().toString());
                result = number1/number2;
                Textviewresult.setText(String.valueOf(result));
            }});
        Buttontimes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO times
                double number1 = Double.parseDouble(EDTnumber1.getText().toString());
                double number2 = Double.parseDouble(EDTnumber2.getText().toString());
                result = number1 * number2;
                Textviewresult.setText(String.valueOf(result));
            }});
    }



    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Lifecycle: ","in onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Lifecycle: ","in onResume()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Lifecycle: ","in onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Lifecycle: ","in onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Lifecycle: ","in onStop()");
    }
}