package com.example.desafio1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText inputInitialAmount, inputInterestRate, inputInvestmentDuration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputInitialAmount = findViewById(R.id.editTextInitialAmount);
        inputInterestRate = findViewById(R.id.editTextInterestRate);
        inputInvestmentDuration = findViewById(R.id.editTextInvestmentTime);
        Button calculateButton = findViewById(R.id.buttonCalculate);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateAndDisplayResult();
            }
        });
    }

    private void calculateAndDisplayResult() {
        double initialAmount = Double.parseDouble(inputInitialAmount.getText().toString());
        double interestRate = Double.parseDouble(inputInterestRate.getText().toString());
        int investmentDuration = Integer.parseInt(inputInvestmentDuration.getText().toString());

        double futureValue = initialAmount * Math.pow(1 + interestRate, investmentDuration);

        String resultMessage = String.format("Valor Futuro: R$ %.2f", futureValue);

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("RESULTADO", resultMessage);
        startActivity(intent);
    }
}
