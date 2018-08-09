package com.example.challenge3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: 1 Create a new Activity called "ReceiptActivity"
    // TODO: 2 Create a new layout file called "activity_receipt"

    private int amount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(amount);
    }

    public void payOrder(View view) {
        // TODO: 3 Link Activities from main to receipt
        // TODO: 4 Pass the amount information from main to receipt
    }

    public void increaseAmount(View view) {
        amount = amount + 1;
        display(amount);
    }

    public void decreaseAmount(View view) {
        amount = amount - 1;
        display(amount);

    }

    private void display(int amount) {
        TextView amountTextView = findViewById(R.id.amount);
        amountTextView.setText("$ " + String.valueOf(amount));
    }
}
