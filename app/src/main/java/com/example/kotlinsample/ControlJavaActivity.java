package com.example.kotlinsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ControlJavaActivity extends AppCompatActivity {

    EditText numberField;
    Button control_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_control);

        numberField = findViewById(R.id.numberField);
        control_button = findViewById(R.id.control_button);

        control_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int number = Integer.parseInt(numberField.getText().toString());

                if (number % 2 == 0) {
                    ToastUtilJava.toastShort("" + number + "는 2의 배수입니다");
                } else if (number % 3 == 0) {
                    ToastUtilJava.toastShort("" + number + "는 3의 배수입니다");
                } else {
                    ToastUtil.toastShort("" + number);
                }

                switch (number) {
                    case 4:
                        control_button.setText("실행 - 4");
                        break;
                    case 9:
                        control_button.setText("실행 - 9");
                        break;
                    default:
                        control_button.setText("실행");
                        break;
                }
            }
        });
    }
}