package com.example.highterorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.filament.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber ;
    public void generateRandomNumber(){

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1 ;


    }

    public void Guess(android.view.View view) {
//        Log.i("Info", "Button Pressed");

        EditText editText = (EditText) findViewById(R.id.editText);
         int guessValue = Integer.parseInt((editText.getText().toString()));

         String message ;

         if (guessValue > randomNumber){
             message = "Lower!!";
         }
         else if (guessValue < randomNumber){
             message = "Higher!!";
         }
         else {
             message= "You Got It!!" +
                     "Try Again✨";

         }

        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


        Log.i("Entered Value", editText.getText().toString());

        Log.i("Random Number", Integer.toString(randomNumber));



    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateRandomNumber();
    }
}