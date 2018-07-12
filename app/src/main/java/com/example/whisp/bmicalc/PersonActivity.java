package com.example.whisp.bmicalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;

public class PersonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person);
    }
    public void caculate(){
        //get the height
        EditText height = (EditText) findViewById(R.id.textHeight);
        EditText weight = (EditText) findViewById(R.id.textWeight);
        String value1 = height.getText().toString(); //height
        String value2 = weight.getText().toString(); //weight
        Double heightVal = Double.parseDouble(value1);
        Double weightVal = Double.parseDouble(value2);
        System.out.println("Here is the height" + value1);
        System.out.println("Here is the height" + value2);

        //Repeat for weight
        Double calc = (weightVal / (heightVal*heightVal));
        TextView result = (TextView) findViewById(R.id.resultText);
        //use DecimalFormat("0.##")to limit to 2 decimal places
        result.setText(calc.toString());
    }
}
