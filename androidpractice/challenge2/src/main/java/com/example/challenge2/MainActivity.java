package com.example.challenge2;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: 3-1 declare private variable amount here.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(0);
    }

    public void payOrder(View view) {
        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    public void increaseAmount(View view) {
        // TODO: 3-2 add logic to the button onClick functions with a variable called "amount"
        display(10);
    }


    // Step 1 is in activity_main.xml file
    // TODO: 2. connect decrease Button to Activity



    private void display(int amount) {
        TextView amountTextView = findViewById(R.id.amount);
        amountTextView.setText("$ " + String.valueOf(amount));
    }
}
