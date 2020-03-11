package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    TextView a1;
    TextView a2;
    TextView a3;
    TextView a4;
    double n1;
    double n2;
    double n3;
    double n4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        setTitle("Your Receipt");

        a1= (TextView) findViewById(R.id.a1) ;
        a2= (TextView) findViewById(R.id.a2) ;
        a3= (TextView) findViewById(R.id.a3) ;
        a4= (TextView) findViewById(R.id.a4) ;


        Intent intents = getIntent();
        a1.setText("Amount: "+intents.getSerializableExtra(Keys.AMOUNT).toString());
        a2.setText("Tax: "+intents.getSerializableExtra(Keys.TAX).toString());
        a3.setText("Tip: "+intents.getSerializableExtra(Keys.TIP).toString());
        a4.setText("Total: "+intents.getSerializableExtra(Keys.TOTAL).toString());


    }
}
