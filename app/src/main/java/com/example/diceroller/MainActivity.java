package com.example.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView rollLabel;

    Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void rollButtonClick(View view){
        rollLabel = findViewById(R.id.rollCount);
        random = new Random();
        rollLabel.setText(Integer.toString(random.nextInt(6)+1));
    }
}