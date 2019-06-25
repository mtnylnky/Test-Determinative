package com.example.testdeterminative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScoreCorrelationActivity extends AppCompatActivity {

    private Button score_parametric, score_nonparametric;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_correlation);

        score_parametric=findViewById(R.id.score_parametric);
        score_nonparametric=findViewById(R.id.score_nonparametric);

        score_parametric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_val="three";
                Intent intent = new Intent(ScoreCorrelationActivity.this,TestResult.class);
                intent.putExtra("send_string",result_val);
                startActivity(intent);
            }
        });

        score_nonparametric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_val="four";
                Intent intent = new Intent(ScoreCorrelationActivity.this,TestResult.class);
                intent.putExtra("send_string",result_val);
                startActivity(intent);
            }
        });
    }
}
