package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText mail;
    EditText pass;
    Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "OnCreate", Toast.LENGTH_LONG).show();
        mail=findViewById(R.id.mail);
        pass=findViewById(R.id.pass);
        login=findViewById(R.id.button);
    }
    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "OnStart", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this, "OnResume", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onPause(){
        super.onPause();
        Toast.makeText(this, "OnPause", Toast.LENGTH_LONG).show();

    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "onRestart", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "onDestroy", Toast.LENGTH_LONG).show();
    }
    @Override
    protected void onStop(){
        super.onStop();
        Toast.makeText(this, "onStop", Toast.LENGTH_LONG).show();
    }

    public void click(View view) {
         String s1=mail.getText().toString();
         String s2=pass.getText().toString();

         if (s1.equals("ananthu") && s2.equals("123"))
         {
             Toast.makeText(this, "Login Successfull",Toast.LENGTH_SHORT).show();
         }
         else
         {
             Toast.makeText(this,"Wrong Email or Password",Toast.LENGTH_SHORT).show();
         }
    }
}