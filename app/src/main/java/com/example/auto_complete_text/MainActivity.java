package com.example.auto_complete_text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    private AutoCompleteTextView actv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        actv = findViewById(R.id.actv_1);
        String[]str=getResources().getStringArray(R.array.person);
        ArrayAdapter adt=new ArrayAdapter(this,android.R.layout.simple_list_item_1,str);
        actv.setAdapter(adt);

    }
}