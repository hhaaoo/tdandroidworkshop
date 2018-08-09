package com.example.challenge3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ReceiptActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receipt);

        Intent intent = getIntent();
        String amountValue = intent.getExtras().getString("amount_value");
        TextView amountTextView = findViewById(R.id.promptText);
        amountTextView.setText("You have paid $ " + amountValue);

    }


}
