package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public EditText num1,num2;
    public TextView show_output;
    public Button add,sub,mult,div,mod;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = findViewById(R.id.num1Text);
        num2 = findViewById(R.id.num2Text);
        show_output=findViewById(R.id.ViewOutput);


        //now lets declare the button field
        add = findViewById(R.id.button);
        sub = findViewById(R.id.button2);
        mult = findViewById(R.id.button3);
        div = findViewById(R.id.button4);
        mod = findViewById(R.id.button5);

        //work on add button
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 =Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float ans=n1+n2;
                String mytext=Float.toString(ans);
                //TextView.setText(mytext);
                show_output.setText(mytext);
            }
        });

            // get the input numbers
            num1.getText().clear();
            // get the input numbers
            num2.getText().clear();


        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float ans = n1-n2;
                String text = Float.toString(ans);
                show_output.setText(text);

            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float ans = n1*n2;
                String text = Float.toString(ans);
                show_output.setText(text);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float ans = n1/n2;
                String text = Float.toString(ans);
                show_output.setText(text);
            }
        });

        mod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float n1 = Float.parseFloat(num1.getText().toString());
                float n2 = Float.parseFloat(num2.getText().toString());
                float ans = n1%n2;
                String text = Float.toString(ans);
                show_output.setText(text);
            }
        });



    }
}