package com.example.meterstoinches;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText enterMeters;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterMeters = findViewById(R.id.metersEditText);
        convertButton = findViewById(R.id.convertButtonID);
        resultTextView = findViewById(R.id.resultid);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double multipler = 39.3701;
                double result = 0.0;

                if (enterMeters.getText().toString().equals("")){

                    resultTextView.setText(R.string.error_message);
                    resultTextView.setTextColor(Color.RED);

                }else {

                    double meterValue = Double.parseDouble(enterMeters.getText().toString());
                    result = meterValue*multipler;

                    resultTextView.setTextColor(Color.DKGRAY);
                    resultTextView.setText(String.format("%.2f", result) + " inches");
                }

            }
        });

    }
}
