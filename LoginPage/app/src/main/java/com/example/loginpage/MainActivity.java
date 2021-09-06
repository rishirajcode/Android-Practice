package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public void login(View view){

        EditText editUsername = (EditText) findViewById(R.id.editUsername);

        EditText editPassword = (EditText) findViewById(R.id.editPassword);

        Log.i("Info", "Button Pressed");

        Log.i("Username", editUsername.getText().toString());

        Log.i("Password", editPassword.getText().toString());
    }
    public void button2(View view ){
        Log.i("Button", "Next");

        ImageView image = (ImageView) findViewById(R.id.loginimg);
        image.setImageResource(R.drawable.dog);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}