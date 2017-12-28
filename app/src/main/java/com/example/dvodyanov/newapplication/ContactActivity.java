package com.example.dvodyanov.newapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ContactActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        final ListView listView;
        listView = (ListView) findViewById(R.id.listViewContact);
        String[] values = new String[]{
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",
                "Имя Фамилия",

        };
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.my_item, R.id.text1, values);
        listView.setAdapter(adapter);

    }
}
