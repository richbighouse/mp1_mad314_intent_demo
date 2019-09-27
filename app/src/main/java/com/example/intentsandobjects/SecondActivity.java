package com.example.intentsandobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;
    TextView passwordView;
    TextView dateView;
    TextView numberView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.textView);
        passwordView = findViewById(R.id.passwordView);
        dateView = findViewById(R.id.dateView);
        numberView = findViewById(R.id.numberView);

        // Get the intent from the activity that started this
        Intent intent = getIntent();

        String textMessage = intent.getStringExtra("text");
        String passwordMessage = intent.getStringExtra("password");
        String dateMessage = intent.getStringExtra("date");
        String numberMessage = intent.getStringExtra("number");

        textView.setText(textMessage);
        passwordView.setText(passwordMessage);
        dateView.setText(dateMessage);
        numberView.setText(numberMessage);
    }
}
