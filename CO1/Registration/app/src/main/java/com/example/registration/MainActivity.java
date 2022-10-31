package com.example.registration;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText fname,lname,email,dob,pass;
    RadioGroup sex;
    Button bt;
    CheckBox ch;
    RadioButton b1,b2,b3;
    boolean isAll=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fname=findViewById(R.id.editTextTextPersonName);
        lname=findViewById(R.id.editTextTextPersonName4);
        email=findViewById(R.id.editTextTextPersonName2);
        sex=findViewById(R.id.grp);
        b1=findViewById(R.id.radioButton2);
        b2=findViewById(R.id.radioButton3);
        b3=findViewById(R.id.radioButton4);
        dob=findViewById(R.id.editTextDate);
        pass=findViewById(R.id.editTextTextPassword);
        ch=findViewById(R.id.checkBox);
        bt=findViewById(R.id.button);

    }

    public void submit(View view) {
        isAll=check();
        if(isAll){
            Toast.makeText(this, "Succesfully Registered", Toast.LENGTH_SHORT).show();
        }

    }
    private boolean check(){
        if(fname.length()==0){
            fname.setError("Enter First Name");
            return false;
        }
        if(lname.length()==0){
            lname.setError("Enter Last Name");
            return false;
        }
        if(email.length()==0){
            email.setError("Enter Email");
            return false;
        }
        else{
            String em=email.getText().toString();
            String checkem="[a-zA-Z0-9.-_]+@[a-z]+.+[a-z]";
            if(!em.matches(checkem)){
                email.setError("Invalid Email");
                return false;
            }

        }
        if(dob.length()==0){
            dob.setError("Enter Date of Birth");
            return false;
        }
        if(pass.length()==0){
            pass.setError("Enter Password");
            return false;
        }
        else if(pass.length()<8){
            pass.setError("Password must have size of 8!");
            return false;
        }
        if(sex.getCheckedRadioButtonId()==-1){
            b3.setError("Enter Gender");
            b3.requestFocus();
            return false;
        }
        if(!ch.isChecked()){
            ch.setError("Accept Privacy and Policy!");
            ch.requestFocus();
            return false;
        }
        return true;
    }
}