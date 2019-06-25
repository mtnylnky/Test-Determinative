package com.example.testdeterminative;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ResultType extends AppCompatActivity {

    private Button parametric,nonparametric;
    public String val,val2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_type);

        parametric=findViewById(R.id.parametric);
        nonparametric=findViewById(R.id.nonparametric);

        String valuerslt = getIntent().getExtras().getString("send_string");

        if (valuerslt.equals("one")){
            val="eight";
            val2="eleven";
        } else if (valuerslt.equals("two")){
            val="nine";
            val2="twelve";
        } else if (valuerslt.equals("three")){
            val="ten";
            val2="thirteen";
        } else if (valuerslt.equals("four")){
            val="six";
            val2="fourteen";
        } else if (valuerslt.equals("five")){
            val="seven";
            val2="fifteen";
        }

        parametric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultType.this,TestResult.class);
                intent.putExtra("send_string",val);
                startActivity(intent);
            }
        });

        nonparametric.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultType.this,TestResult.class);
                intent.putExtra("send_string",val2);
                startActivity(intent);
            }
        });
    }
}
