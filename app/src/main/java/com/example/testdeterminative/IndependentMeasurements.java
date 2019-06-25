package com.example.testdeterminative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IndependentMeasurements extends AppCompatActivity {

    private Button group_one, group_two,group_three;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_independent_measurements);

        group_one=findViewById(R.id.group_one);
        group_two=findViewById(R.id.group_two);
        group_three=findViewById(R.id.group_three);

        group_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_val="one";
                Intent intent = new Intent(IndependentMeasurements.this,ResultType.class);
                intent.putExtra("send_string",result_val);
                startActivity(intent);
            }
        });

        group_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_val="two";
                Intent intent = new Intent(IndependentMeasurements.this,ResultType.class);
                intent.putExtra("send_string",result_val);
                startActivity(intent);
            }
        });

        group_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_val="three";
                Intent intent = new Intent(IndependentMeasurements.this,ResultType.class);
                intent.putExtra("send_string",result_val);
                startActivity(intent);
            }
        });
    }
}
