package com.example.learning;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView2);
        Button button = findViewById(R.id.button);
        EditText editText = findViewById(R.id.editTextNumber2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Oh my god! oh my god! you clicked me", Toast.LENGTH_SHORT).show();
                double dollar = Double.parseDouble(editText.getText().toString());
                double rupee = 74.50 * dollar;
                textView.setText(rupee + " Indian rupees");
            }
        });
    }
}