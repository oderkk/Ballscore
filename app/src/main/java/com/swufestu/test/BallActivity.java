package com.swufestu.test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class BallActivity extends AppCompatActivity {
    int score1 = 0;
    int score2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ball);
    }
    public void click(View btn){
        Log.i("BallActivity", "click:" );
    if (btn.getId()==R.id.button2){
            score1 +=3;
        }else if(btn.getId()==R.id.button3){
            score1 +=2;
        }else if (btn.getId()==R.id.button4){
            score1 +=1;
        }else{
            score1=0;
            score2=0;
        }
        TextView show = findViewById(R.id.score);
        show.setText(String.valueOf(score1));
        TextView show1 = findViewById(R.id.score2);
        show1.setText(String.valueOf(score2));

    }
    public void clickb(View btn){
        Log.i("BallActivity", "click:" );
        if (btn.getId()==R.id.button6){
            score2 +=3;
        }else if(btn.getId()==R.id.button7){
            score2 +=2;
        }else if (btn.getId()==R.id.button8){
            score2 +=1;
        }
        TextView show = findViewById(R.id.score2);
        show.setText(String.valueOf(score2));

    }
}