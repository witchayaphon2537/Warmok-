package com.pleeklum.easykku;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import warmok.warmok.R;
import warmok.warmok.SignUpactivity;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private Button signInButton, signUpButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bind Widget
        signInButton = (Button) findViewById(R.id.button6);
        signUpButton = (Button) findViewById(R.id.button5);

        //Sign Up Controller
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, SignUpactivity.class));
            }
        });

    } // Main Method

} // Main Class นี่คือคลาสหลัก


