package com.example.hw0921;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import kotlin.reflect.KFunction;

public class MainActivity extends AppCompatActivity {

    private TextView inputTextView, resultTextView;

    private String num1 = "";
    private String operator = "";
    private String num2 = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputTextView = findViewById(R.id.textInput);
        resultTextView = findViewById(R.id.textResult);
    }

    public void onButtonClick(View view) {
        Button button = (Button) view;
        String buttonText = button.getText().toString();


        switch (buttonText) {
            case "+":

            case "-":

            case "×":

            case "÷": {
                if (!num1.isEmpty() && !operator.isEmpty()) {
                    return;
                }
                operator = buttonText;
            }
            break;

            case "=":
                if (num1.isEmpty() || operator.isEmpty() || num2.isEmpty()) {
                    return;
                }
                double result = calculateResult();
                resultTextView.setText(String.valueOf(result));
                break;
            case "C":
                num1 = "";
                operator = "";
                num2 = "";
                inputTextView.setText("");
                resultTextView.setText("");
                break;
            default:
                if (operator.isEmpty()) {
                    num1 += buttonText;
                }
                else {
                    num2 += buttonText;
                }
                break;
        }
        if(!buttonText.equals("C")){
            inputTextView.append(buttonText);
        }



    }

    private double calculateResult() {
        double number1 = Double.parseDouble(num1);
        double number2 = Double.parseDouble(num2);
        double result = 0.0;

        switch (operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "×":
                result = number1 * number2;
                break;
            case "÷":
                if (number2 != 0) {
                    result = number1 / number2;
                } else {
                    resultTextView.setText("Error");
                }
                break;
        }

        num1 = String.valueOf(result);
        operator = "";
        num2 = "";

        return result;
    }
}