package com.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Votes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_votes);
    }
    int pepsivotes = 0, udacolavotes = 0;

    public void votePespsi(View view){
//        int pepsivotes = 0;
        pepsivotes = pepsivotes + 1;
    }
    public void voteUda(View view){
//        int udacolavotes = 0;
      udacolavotes = udacolavotes + 1;
    }
    public void showVotes(View view){
        display(pepsivotes + " vs " + udacolavotes);
    }

    public void display(String text){
        TextView t = (TextView) findViewById(R.id.show);
        t.setText(text);
    }

}