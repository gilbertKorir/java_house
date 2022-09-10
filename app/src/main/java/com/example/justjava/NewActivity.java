package com.example.justjava;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {
    int raspberryPrice = 5;
    private static final String TAG = "NewActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);


        display1("1 box: $" + raspberryPrice);
        raspberryPrice = 10;
        display2("2 boxes: $" + (raspberryPrice));
        display3("3 boxes: $" + (raspberryPrice * 3));

        //sleep debt
        int weekday = 5;
        int weekend = 9;
        int optimal = 7*8;
        int actual = weekday;
        actual = actual + weekend * 2;
        int soln = optimal - actual;
        displaySoln(soln);

        //traffic
        int day1 = 15;
        int day2 = 22;
        int day3 = 18;
        displayTraf(day1 + day2 + day3/3);

    }

    public void display(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text);
    }

    public void display(int text) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(text + "");
    }

    public void display1(String text) {
        display(text);
    }

    public void display2(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(text);
    }

    public void display3(String text) {
        TextView t = (TextView) findViewById(R.id.display_text_view_3);
        t.setText(text);
    }
    private void displaySoln(int sol){
        TextView t = (TextView) findViewById(R.id.sleep);
//        t.setText("" + sol);
//        Log.d(TAG,"Output :" +sol);
    }
    public void displayTraf(int text){
        TextView t = (TextView) findViewById(R.id.trafic);
//        t.setText(text);
        Log.d(TAG, "Output : " + text);
    }

}