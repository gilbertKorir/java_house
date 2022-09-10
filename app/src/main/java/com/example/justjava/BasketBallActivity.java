package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BasketBallActivity extends AppCompatActivity {
    int pointA=0, pointB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket_ball);
        getSupportActionBar().setTitle("Basket Ball Counter");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    //add 1 point
    public void addOneA(View v){
        pointA = pointA + 1;
        displayA(pointA);
    }
 //add 2 point
    public void addTwoA(View v){
        pointA = pointA + 2;
        displayA(pointA);
    }
 //add 3 point
    public void addThreeA(View v){
        pointA = pointA + 3;
        displayA(pointA);
    }

    //display the points added to team A
    public void displayA(int score){
        TextView sc = (TextView) findViewById(R.id.scoreA);
        sc.setText(String.valueOf(score));
    }

    /*TEAM B*/
    //add 1 point
    public void addOneB(View v){
        pointB = pointB + 1;
        displayB(pointB);
    }
    //add 2 point
    public void addTwoB(View v){
        pointB = pointB + 2;
        displayB(pointB);
    }
    //add 3 point
    public void addThreeB(View v){
        pointB = pointB + 3;
        displayB(pointB);
    }

    //display the points added to team A
    public void displayB(int score){
        TextView sc = (TextView) findViewById(R.id.scoreB);
        sc.setText(String.valueOf(score));
    }
    // RESET the scores
    public void reset(View v){
        displayA(0);
        displayB(0);
        pointA = 0;
        pointB = 0;
    }
}