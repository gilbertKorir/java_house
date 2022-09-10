package com.example.justjava;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;
    EditText name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.nameEdit);

        getSupportActionBar().setTitle("Java House");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //underline the order summarry
        TextView tx = (TextView) findViewById(R.id.summarry);
        tx.setPaintFlags(tx.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }


    //when a button is called
    public void submitOrder(View view){
        //whipped
        CheckBox whipp = (CheckBox) findViewById(R.id.whipped);
        boolean hasWhip = whipp.isChecked();

        //chocolate
        CheckBox choco = (CheckBox) findViewById(R.id.chocolate);
        boolean hasChoco = choco.isChecked();

        //price
        int price = calculatePrice();

        String messageOrder = orderSum(price,hasWhip, hasChoco);
        displayMessage(messageOrder);

    }
    //when a + button is called
    public void addOrder(View view){
        if(quantity >= 100){
            return;
        }
        quantity = quantity + 1;
        display(quantity);
    }
    //when a - button is called
    public void reduceOrder(View view){
        if(quantity == 1){
            return;
        }
        quantity = quantity - 1;
        display(quantity);
    }

    //displays the quantity
    public void display(int number){
        TextView quantity = (TextView) findViewById(R.id.quantityView);
        quantity.setText(" " + number);
    }
    //calculate price
    public int calculatePrice(){
        return quantity * 5;
    }
    //display order summary
    public String orderSum(int price, boolean addWhip, boolean addChoco){
        String message = "Name: " + name.getText().toString();
        message += "\n add Whipped " + addWhip;
        message += "\n add Chocolate " + addChoco;
        message += "\n Quantity:" + quantity;
        message += "\n Price: " + price;
        message += "\n Thank You.";

        return message;
    }
    //display price by order
    public void displayMessage(String msg){
        TextView price = (TextView) findViewById(R.id.orderSummary);
        price.setText(msg);
    }



}