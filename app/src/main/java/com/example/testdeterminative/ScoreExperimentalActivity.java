package com.example.testdeterminative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ScoreExperimentalActivity extends AppCompatActivity {

    private Button experimental_one, experimental_more;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_experimental);

        experimental_one=findViewById(R.id.experimental_one);
        experimental_more=findViewById(R.id.experimental_more);

        experimental_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(ScoreExperimentalActivity.this,ExperimentalIndependent.class);
                startActivity(intent);
            }
        });

        experimental_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result_val="five";
                Intent intent = new Intent(ScoreExperimentalActivity.this,TestResult.class);
                intent.putExtra("send_string",result_val);
                startActivity(intent);
            }
        });
    }
}
