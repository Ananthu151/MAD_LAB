package com.example.fullcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText number;
    double num1=0;
    double num2=0;
    String op="";
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,b00,bdot,bsum,bsub,bmulti,bdiv,beq,bc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.button18);
        b0=findViewById(R.id.button18);
        bdot=findViewById(R.id.button19);
        b00=findViewById(R.id.button17);
        b1=findViewById(R.id.button13);
        b2=findViewById(R.id.button14);
        b3=findViewById(R.id.button15);
        b4=findViewById(R.id.button9);
        b5=findViewById(R.id.button10);
        b6=findViewById(R.id.button11);
        b7=findViewById(R.id.button5);
        b8=findViewById(R.id.button6);
        b9=findViewById(R.id.button7);
        bsum=findViewById(R.id.button16);
        bsub=findViewById(R.id.button12);
        bmulti=findViewById(R.id.button8);
        bdiv=findViewById(R.id.button4);
        beq=findViewById(R.id.button20);
        bc=findViewById(R.id.button);
        number=findViewById(R.id.editTextTextPersonName);

        b1.setOnClickListener(this);
        bdot.setOnClickListener(this);
        b0.setOnClickListener(this);
        b00.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        bsub.setOnClickListener(this);
        bsum.setOnClickListener(this);
        bc.setOnClickListener(this);
        bmulti.setOnClickListener(this);
        bdiv.setOnClickListener(this);
        beq.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Button b=(Button) view;
        if(view==bc){
            number.setText("");
            op="";
        }
        else if(view==bsum||view==bsub||view==bmulti||view==bdiv){
            num1=Integer.parseInt(number.getText().toString());
            op=b.getText().toString();
            number.setText("");
        }
        else if(view==beq)
        {
            num2=Integer.parseInt(number.getText().toString());
            if(op.equals("+"))
            {
                number.setText(num1+num2+"");
            }
            else if(op.equals("-"))
            {
                number.setText(num1-num2+"");
            }
            else if(op.equals("*"))
            {
                number.setText(num1*num2+"");

            }
            else if(op.equals("/")){
                number.setText(num1/num2+"");
            }

        }
        else {
            String s = number.getText().toString();
            number.setText(s + b.getText().toString());
        }
    }
}