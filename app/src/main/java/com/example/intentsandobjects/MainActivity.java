package com.example.intentsandobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Consult this link for more information
 * https://developer.android.com/training/basics/firstapp/starting-activity
 */

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText passwordText;
    EditText dateText;
    EditText numberText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        passwordText = findViewById(R.id.passwordText);
        dateText = findViewById(R.id.dateText);
        numberText = findViewById(R.id.numberText);
        button = findViewById(R.id.mainButton);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("text", editText.getText().toString());
                intent.putExtra("password", passwordText.getText().toString());
                intent.putExtra("date", dateText.getText().toString());
                intent.putExtra("number", numberText.getText().toString());
                startActivity(intent);
            }
        });
    }
}
