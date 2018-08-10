package com.example.challenge4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int amount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(amount);
    }

    public void payOrder(View view) {
        Intent intent = new Intent(this, ReceiptActivity.class);
        intent.putExtra("amount_value", String.valueOf(amount));
        startActivity(intent);

    }

    public void increaseAmount(View view) {
        amount = amount + 1;
        display(amount);
    }

    public void decreaseAmount(View view) {
        amount = amount - 1;
        display(amount);

    }

    public void getCardDetails(View view) {
        Intent intent = new Intent(this, CardActivity.class);
        startActivity(intent);
    }

    private void display(int amount) {
        TextView amountTextView = findViewById(R.id.amount);
        amountTextView.setText("$ " + String.valueOf(amount));
    }
}
