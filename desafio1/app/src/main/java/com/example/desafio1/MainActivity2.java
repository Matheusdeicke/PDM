package com.example.desafio1;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String futureValueMessage = getIntent().getStringExtra("RESULTADO");

        TextView resultTextView = findViewById(R.id.textViewResult);

        resultTextView.setText(futureValueMessage);
    }
}
