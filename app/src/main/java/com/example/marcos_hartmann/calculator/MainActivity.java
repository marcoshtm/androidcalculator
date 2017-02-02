package com.example.marcos_hartmann.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onSumButtonClick(View view) {
        Double value1 = getEditTextDoubleValue((EditText)findViewById(R.id.value1Text));
        Double value2 = getEditTextDoubleValue((EditText)findViewById(R.id.value2Text));
        Double result = new Double(value1.doubleValue()+value2.doubleValue());

        TextView resultText = (TextView)findViewById(R.id.resultText);
        resultText.setText(result.toString());
    }

    public Double getEditTextDoubleValue(EditText editText) {
        try {
            return Double.parseDouble(editText.getText().toString());
        } catch (Exception e) {
            return new Double(0.0);
        }
    }
}