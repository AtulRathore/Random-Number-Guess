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

    public  void makeToast(String str){
        Toast.makeText(this, str, Toast.LENGTH_SHORT).show();
    }

    public void guess(View view){

        editText = (EditText) findViewById(R.id.editText);
        String num = editText.getText().toString().trim();

        int guessInt= Integer.parseInt(num);

        if (guessInt>randomnumber){
            makeToast("Little lower");
        }else if (guessInt<randomnumber){
            makeToast("Little Higher");
        }else {
            Toast.makeText(this, "Right, Try Again", Toast.LENGTH_SHORT).show();

            Random r = new Random();
            int low =1;
            int high = 20;
            randomnumber = r.nextInt(high-low)+low;
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
