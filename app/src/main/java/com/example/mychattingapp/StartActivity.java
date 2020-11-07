package com.example.mychattingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

public class StartActivity extends AppCompatActivity {
    private Button mRegBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_start);

        mRegBtn =(Button)findViewById (R.id.start_reg_btn);
        mRegBtn.setOnClickListener (new View.OnClickListener ( ) {
            @Override
            public void onClick(View v) {
                Intent reg_intent = new Intent (StartActivity.this,RegisterActivity.class);
                startActivity (reg_intent);
            }
        });
    }
}