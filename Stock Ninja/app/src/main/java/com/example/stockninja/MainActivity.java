package com.example.stockninja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void clickFuction (View view){

        EditText editTextStock = (EditText) findViewById(R.id.editTextStock);


        Log.i("Info" ,"Button Pressed");

        Log.i("Values", editTextStock.getText().toString());
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}