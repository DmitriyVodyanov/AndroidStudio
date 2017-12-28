package com.example.dvodyanov.newapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class CodeActivity extends AppCompatActivity implements View.OnClickListener {

    Button buttonEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);

        buttonEnter = findViewById(R.id.buttonEnter);
        buttonEnter.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonEnter:
                Intent intent2 = new Intent(this, ContactActivity.class);
                startActivity(intent2);

                break;

        }
    }
}
