package com.example.asus.randomnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void ToastMe(View view)
    {
        Toast.makeText(MainActivity.this, "Here's the Toast", Toast.LENGTH_SHORT).show();

    }


    public void countMe(View view) {
        TextView showCountTextView=(TextView)findViewById(R.id.textview);
        String countString=showCountTextView.getText().toString();
        Integer count=Integer.parseInt(countString);
        count++;
        showCountTextView.setText(Integer.toString(count));
    }
    public void randomMe(View view) {
        TextView showCountTextView=(TextView)findViewById(R.id. textview );
        String countString=showCountTextView.getText().toString();
        Integer maxCount=Integer. parseInt (countString);
        Intent intent= new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("Maxcount",maxCount);
        startActivity(intent);
    }
}

