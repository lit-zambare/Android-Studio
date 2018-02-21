package com.example.asus.scarnesdice;

        import android.graphics.drawable.Drawable;
        import android.media.Image;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.ImageView;
        import android.widget.TextView;
        import android.widget.Toast;
        import java.util.Random;
        import static android.widget.Toast.*;

public class MainActivity extends AppCompatActivity {

    int turn=0;
    int comp=0,player=0;
    boolean turn1,game;

    public MainActivity() {
        turn1 = false;
        game=true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void computer()
    {
        if(!game) return;
        int r=0,d;
//        ImageView i=(ImageView)findViewById(R.id.DiceImage);
        Random rand = new Random();
        while (r<=2)
        {
            d=rand.nextInt(6);
//            switch (d)
//            {
//                case 1:
//                    i.setImageResource(R.drawable.dice1);
//                    turn=0;
//                    setscore();
//                    break;
//                case 2:i.setImageResource(R.drawable.dice2);
//                    break;
//                case 3:i.setImageResource(R.drawable.dice3);
//                    break;
//                case 4:i.setImageResource(R.drawable.dice4);
//                    break;
//                case 5:i.setImageResource(R.drawable.dice5);
//                    break;
//                case 6:i.setImageResource(R.drawable.dice6);
//                    break;
//            }
            if(d!=1)
            {
                turn+=d;
            }
            else break;
            r=rand.nextInt(4);
            disp();
        }
        setscore();
    }

    public void rollDice(View view) {
        if(!game) return;
        ImageView i= (ImageView) findViewById(R.id.imageview);
        Random rand=new Random();
        int d=rand.nextInt(6);
        switch (d)
        {
            case 1:
                i.setImageResource(R.drawable.dice1);
                turn=0;
                setscore();
                return;
//                    break;
            case 2:i.setImageResource(R.drawable.dice2);
                break;
            case 3:i.setImageResource(R.drawable.dice3);
                break;
            case 4:i.setImageResource(R.drawable.dice4);
                break;
            case 5:i.setImageResource(R.drawable.dice5);
                break;
            case 6:i.setImageResource(R.drawable.dice6);
                break;
        }
        turn+=d;
        disp();
    }

    public void setscore()
    {

        if(turn1)
            comp+=turn;
        else
            player+=turn;
//        Toast toast;
        if(player>=100)
        {
            makeText(MainActivity.this, "You Win!!", LENGTH_LONG).show();
            game=false;
        }
        else if(comp>=100)
        {
            makeText(MainActivity.this, "Computer Won;)", LENGTH_LONG).show();
            game=false;
        }
        turn1^=true;
        turn=0;
        if(turn1)
            computer();
        disp();

    }
    public void HoldDice(View view) {
        if(game) {
            setscore();
        }
    }

    public void disp()
    {
        TextView t=(TextView)findViewById(R.id.turn);
        t.setText(Integer.toString(turn));
        t=(TextView)findViewById(R.id.turn);
        String s1,s2;
        String st=" ";
        TextView s=(TextView)findViewById(R.id.scoreView);
        s.setText(Integer.toString(player)+st+Integer.toString(comp));
        s1="Computer";
        s2="YOU";
        if(turn1) {
            t.setText(s1);
        }
        else
            t.setText(s2);
    }

    public void Reset(View view) {
        turn=0;
        comp=0;
        player=0;
        turn1=false;
        game=true;
        disp();
    }
}
