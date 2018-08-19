package com.abc.guessthenumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    static final int randomNumber = new Random().nextInt(101);

    public void GuessTheNumber(View view) {

        EditText number = findViewById(R.id.GuessEdittext);
        TextView showMessage = findViewById(R.id.showMessage);

        Integer guessed = Integer.parseInt(number.getText().toString());



        String rand = String.valueOf(randomNumber);

       if(guessed >= 0 && guessed < 100 && guessed == randomNumber){
           showMessage.setText("You guessed it right");
           Toast.makeText(MainActivity.this, rand, Toast.LENGTH_LONG ).show();
       }else if(guessed >= 0 && guessed < 100){
           if(guessed < randomNumber)
             showMessage.setText("Enter a higher number");
           else {
               showMessage.setText("Enter a lower number");
           }
           Toast.makeText(MainActivity.this, rand, Toast.LENGTH_LONG ).show();
        }
        else{
            showMessage.setText("You Didn't Entered In the Range");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
