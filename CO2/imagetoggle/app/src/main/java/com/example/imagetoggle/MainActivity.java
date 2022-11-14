package com.example.imagetoggle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    ImageView img,img2;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img=findViewById(R.id.imageView3);
        img2=findViewById(R.id.imageView4);
        img.setOnClickListener(this);
        img2.setOnClickListener(this);
    }
    public void onClick(View v){
        if(v==img){
            img.setVisibility(View.GONE);
            img2.setVisibility(View.VISIBLE);

        }else{
            img2.setVisibility(View.GONE);
            img.setVisibility(View.VISIBLE);
        }

    }
}