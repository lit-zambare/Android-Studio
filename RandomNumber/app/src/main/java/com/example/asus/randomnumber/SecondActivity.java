package com.example.asus.randomnumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

public class SecondActivity extends AppCompatActivity {

    TextView text;
    int randomInt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        text=(TextView)findViewById(R.id.text);
        generateRandom();
    }

    private void generateRandom() {
        int count=getIntent().getIntExtra("Maxcount",0);
        Random random=new Random();
        int randomInt=random.nextInt(count);
        text.setText(Integer.toString(randomInt));
    }

}
