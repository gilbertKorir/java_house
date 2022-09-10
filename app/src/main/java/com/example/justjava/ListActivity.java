package com.example.justjava;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity implements View.OnClickListener {
Button coffee, votes, others, basket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        getSupportActionBar().setTitle("Ruaraka Grounds");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        coffee = (Button) findViewById(R.id.coffeeButton);
        votes = (Button) findViewById(R.id.voteButton);
//        others = (Button) findViewById(R.id.otherButton);
        basket = (Button) findViewById(R.id.basket);

        coffee.setOnClickListener(this);
        votes.setOnClickListener(this);
//        others.setOnClickListener(this);
        basket.setOnClickListener(this);
    }
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

    @Override
    public void onClick(View view) {
        if (view == coffee){
            Intent intent = new Intent(ListActivity.this, MainActivity.class);
            startActivity(intent);
        }
        if (view == votes){
            Intent intent = new Intent(ListActivity.this, Votes.class);
            startActivity(intent);
        }
//        if (view == others){
//            Intent intent = new Intent(ListActivity.this, NewActivity.class);
//            startActivity(intent);
//        }
        if (view == basket){
            Intent intent = new Intent(ListActivity.this, BasketBallActivity.class);
            startActivity(intent);
        }
    }
}