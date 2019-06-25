package com.example.testdeterminative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RepetitiveMeasurements extends AppCompatActivity {

    private Button repetitive_one, repetitive_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_repetitive_measurements);

        repetitive_one=findViewById(R.id.repetitive_one);
        repetitive_two=findViewById(R.id.repetitive_two);

        repetitive_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_val="four";
                Intent intent = new Intent(RepetitiveMeasurements.this,ResultType.class);
                intent.putExtra("send_string",result_val);
                startActivity(intent);
            }
        });

        repetitive_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_val="five";
                Intent intent = new Intent(RepetitiveMeasurements.this,ResultType.class);
                intent.putExtra("send_string",result_val);
                startActivity(intent);
            }
        });
    }
}
