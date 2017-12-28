package com.example.dvodyanov.newapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void onClick(View view) {
        Intent intentNext = new Intent(this, CodeActivity.class);
        startActivity(intentNext);
    }

    public void onClickVk(View view) {
        Intent intentVk = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.vk.com"));
        startActivity(intentVk);

    }

    public void onClickFb(View view) {
        Intent intentFb = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com"));
        startActivity(intentFb);

    }

    public void onClickG(View view) {
        Intent intentG = new Intent(Intent.ACTION_VIEW, Uri.parse("http://plus.google.com"));
        startActivity(intentG);


    }
}
