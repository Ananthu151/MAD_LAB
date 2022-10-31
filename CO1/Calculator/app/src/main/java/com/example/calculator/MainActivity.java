package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    EditText num1;
    EditText num2;
    Button b;
    TextView answer;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1=findViewById(R.id.editTextNumber);
        num2=findViewById(R.id.editTextNumber2);
        answer=findViewById(R.id.textView);
        b=findViewById(R.id.button);
    }
    public void sum(View view){
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int ans=n1+n2;
        answer.setText("Answer is: "+ans);

    }
    public void sub(View view){
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int ans=n1-n2;
        answer.setText("Answer is: "+ans);

    }
    public void mult(View view){
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int ans=n1*n2;
        answer.setText("Answer is: "+ans);

    }
    public void div(View view){
        int n1=Integer.parseInt(num1.getText().toString());
        int n2=Integer.parseInt(num2.getText().toString());
        int ans=n1/n2;
        answer.setText("Answer is: "+ans);

    }
}