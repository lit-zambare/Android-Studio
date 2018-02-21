package com.example.asus.calculator_basic;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import static com.example.asus.calculator_basic.R.id.btn0;
import static com.example.asus.calculator_basic.R.id.btn1;
import static com.example.asus.calculator_basic.R.id.btn2;
import static com.example.asus.calculator_basic.R.id.btn3;
import static com.example.asus.calculator_basic.R.id.btn4;
import static com.example.asus.calculator_basic.R.id.btn5;
import static com.example.asus.calculator_basic.R.id.btn6;
import static com.example.asus.calculator_basic.R.id.btn7;
import static com.example.asus.calculator_basic.R.id.btn8;
import static com.example.asus.calculator_basic.R.id.btn9;
import static com.example.asus.calculator_basic.R.id.btnadd;
import static com.example.asus.calculator_basic.R.id.btndiv;
import static com.example.asus.calculator_basic.R.id.btnmul;
import static com.example.asus.calculator_basic.R.id.btnresult;
import static com.example.asus.calculator_basic.R.id.btnsub;
import static com.example.asus.calculator_basic.R.id.info;

public class MainActivity extends AppCompatActivity {

    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button mul;
    private Button add;
    private Button div;
    private Button sub;
    private Button equal;
    private TextView info;
    private TextView result;
    private final char ADD= '+';
    private final char SUB='-';
    private final char DIV='/';
    private final char MUL = '*';
    private final char EQU = '0';
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;


    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();

        GetUIview();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "1");
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "3");
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "4");
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "5");
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "6");
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "7");
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "8");
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                info.setText(info.getText().toString() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADD;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = ADD;
                result.setText(String.valueOf(val1) + "+");
                info.setText(null);
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = SUB;
                result.setText(String.valueOf(val1) + "-");
                info.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = MUL;
                result.setText(String.valueOf(val1) + "*");
                info.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = DIV;
                result.setText(String.valueOf(val1) + "/");
                info.setText(null);
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                ACTION = EQU;
                result.setText(result.getText().toString() + String.valueOf(val2) + "==" + String.valueOf(val1));
                info.setText(null);
            }
        });
    }

    private void GetUIview() {
        one = (Button) findViewById(btn1);
        two = (Button) findViewById(btn2);
        three = (Button) findViewById(btn3);
        four = (Button) findViewById(btn4);
        five = (Button) findViewById(btn5);
        six = (Button) findViewById(btn6);
        seven = (Button) findViewById(btn7);
        eight = (Button) findViewById(btn8);
        nine = (Button) findViewById(btn9);
        zero = (Button) findViewById(btn0);
        mul = (Button) findViewById(btnmul);
        div = (Button) findViewById(btndiv);
        sub = (Button) findViewById(btnsub);
        add = (Button) findViewById(btnadd);
        info = (TextView) findViewById(R.id.info);
        result = (TextView) findViewById(btnresult);

    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(info.getText().toString());

            switch(ACTION)
            {
                case ADD:
                    val1 = val1 + val2;
                    break;

                case SUB:
                    val1 = val1 - val2;
                    break;

                case MUL:
                    val1 = val1 * val2;
                    break;

                case DIV:
                    val1 = val1/val2 ;
                    break;

                case EQU:
                    break;
            }
        }
        else
        {
            val1 = Double.parseDouble(info.getText().toString());
        }

    }
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
