package com.example.higherorlower;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int random_number=0;
  public  void generateRandom(){
      // This will generate numbers between 1 and 20
      random_number = random.nextInt(20)+1;
  }
  public void checkNumber(View view) {
      EditText editText = (EditText)findViewById(R.id.guessNumber);

      //Changing the enter number to integer for  comparing with Random Number..

      if(Integer.parseInt(editText.getText().toString())<random_number){
          Toast.makeText(this, "Guess number is smaller", Toast.LENGTH_SHORT).show();
      }else if(Integer.parseInt(editText.getText().toString())>random_number){
          Toast.makeText(this, "Guess number is larger", Toast.LENGTH_SHORT).show();
      }else{
          Toast.makeText(this, "Hurray! Play Again", Toast.LENGTH_SHORT).show();
          //Again generating Random Number so that one can play it again...
          generateRandom();
      }
  }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateRandom();
    }
}