package com.example.kotlinsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BmiJavaActivity extends AppCompatActivity {

    EditText tallField;
    EditText weightField;
    TextView resultLabel;
    Button bmiButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout_view_binding);

        tallField = findViewById(R.id.tallField);
        weightField = findViewById(R.id.weightField);
        resultLabel = findViewById(R.id.resultLabel);
        bmiButton = findViewById(R.id.bmiButton);

        findViewById(R.id.bmiButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tall = tallField.getText().toString();

                String weight = weightField.getText().toString();

                double bmi = Double.parseDouble(weight) / Math.pow(Double.parseDouble(tall) / 100.0, 2);

                resultLabel.setText("키: " + tall +", 체중: " + weight + ", BMI: " + bmi);
            }
        });
    }
}