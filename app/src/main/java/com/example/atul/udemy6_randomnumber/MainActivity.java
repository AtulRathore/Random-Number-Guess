package com.example.atul.udemy6_randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomnumber;

    EditText editText;
    public void guess(View view){


        editText = (EditText) findViewById(R.id.editText);
        String num = editText.getText().toString().trim();

        int guessInt= Integer.parseInt(num);

        /*num.isEmpty() || num.length()==0 || num.equals("")|| num==null
        if(guessInt){
            Toast.makeText(this, "Please enter a number", Toast.LENGTH_SHORT).show();
        }*/
        if (guessInt>randomnumber){
            Toast.makeText(this, "Little lower", Toast.LENGTH_SHORT).show();
        }else if (guessInt<randomnumber){
            Toast.makeText(this, "Little Higher", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Right", Toast.LENGTH_SHORT).show();
        }
        editText.getText().clear();


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random r = new Random();
        int low =1;
        int high = 20;
        randomnumber = r.nextInt(high-low)+low;
    }
}
