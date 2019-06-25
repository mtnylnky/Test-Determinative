package com.example.testdeterminative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ExperimentalIndependent extends AppCompatActivity {

    private Button exp_independent_one, exp_independent_two;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_experimental_independent);

        exp_independent_one=findViewById(R.id.exp_independent_one);
        exp_independent_two=findViewById(R.id.exp_independent_two);

        exp_independent_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ExperimentalIndependent.this,IndependentMeasurements.class);
                startActivity(intent);
            }
        });

        exp_independent_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ExperimentalIndependent.this,RepetitiveMeasurements.class);
                startActivity(intent);
            }
        });
    }
}
