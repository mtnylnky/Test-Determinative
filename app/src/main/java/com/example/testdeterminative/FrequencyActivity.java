package com.example.testdeterminative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrequencyActivity extends AppCompatActivity {
    private Button frequency_one,frequency_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frequency);

        frequency_one=findViewById(R.id.frequency_one);
        frequency_two=findViewById(R.id.frequency_two);

        frequency_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_val="one";
                Intent intent = new Intent(FrequencyActivity.this,TestResult.class);
                intent.putExtra("send_string",result_val);
                startActivity(intent);
            }
        });

        frequency_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_val="two";
                Intent intent = new Intent(FrequencyActivity.this,TestResult.class);
                intent.putExtra("send_string",result_val);
                startActivity(intent);
            }
        });
    }
}
