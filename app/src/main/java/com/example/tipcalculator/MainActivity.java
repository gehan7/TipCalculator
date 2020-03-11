package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText amount;
    EditText tip;
    EditText tax;
    double tipCount;
    double amountCount;
    double taxCount;
    double total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tip = (EditText) findViewById(R.id.tip);
        tax = (EditText) findViewById(R.id.tax);
        amount = (EditText) findViewById(R.id.amount);

    }

    public void cal (View view){
        tipCount =  Double.parseDouble(tip.getText().toString())*100;
        taxCount =  Double.parseDouble(tax.getText().toString())*100;
        amountCount =  Double.parseDouble(amount.getText().toString());
        total = amountCount*(1+tipCount/100)*(1+taxCount/100);
        Intent intent = new Intent(this,Summary.class);
        intent.putExtra(Keys.AMOUNT,amountCount);
        intent.putExtra(Keys.TIP,tipCount);
        intent.putExtra(Keys.TAX,taxCount);
        intent.putExtra(Keys.TOTAL,total);
        startActivity(intent);

    }


}
