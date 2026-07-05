package com.example.counter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // 1. Declare variables for our UI components and our tracking number
    private TextView counterText;
    private Button incrementButton;
    private int count = 0;

    @Override
    protected void Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 2. Link this Java file to our XML design file
        setContentView(R.layout.activity_main);

        // 3. Connect our Java variables to the actual buttons on the screen
        counterText = findViewById(R.id.counterText);
        incrementButton = findViewById(R.id.incrementButton);

        // 4. Set an action for when the button is tapped
        incrementButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Increase the tracking number by 1
                count++;
                // Update the text on the phone screen to show the new number
                counterText.setText("Total Clicks: " + count);
            }
        });
    }
}
