package com.example.testdeterminative;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ebanx.swipebtn.OnStateChangeListener;
import com.ebanx.swipebtn.SwipeButton;

public class TestResult extends AppCompatActivity {

    private TextView result_tst_txt;
    private SwipeButton send_youtube;
    public String testvidurl;
    private ImageView backhome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_result);
        result_tst_txt=findViewById(R.id.result_tst_txt);
        send_youtube=findViewById(R.id.send_youtube);
        backhome=findViewById(R.id.backhome);

        String value = getIntent().getExtras().getString("send_string");


        if (value.equals("one")){
            testvidurl="https://www.youtube.com/watch?v=eNKbGYuolW8";
            result_tst_txt.setText(R.string.chi_square_harmony);
        } else if (value.equals("two")){
            testvidurl="https://www.youtube.com/watch?v=uTmmdTxxreo";
            result_tst_txt.setText(R.string.chi_square_relation);
        } else if (value.equals("three")){
            testvidurl="https://www.youtube.com/watch?v=VOI5IlHfZVE";
            result_tst_txt.setText(R.string.pearsons_test);
        } else if (value.equals("four")){
            testvidurl="https://www.youtube.com/watch?v=tFQtKcC768Q";
            result_tst_txt.setText(R.string.spearmans_test);
        } else if (value.equals("five")){
            testvidurl="https://www.youtube.com/watch?v=_D5YYd2FBe0";
            result_tst_txt.setText(R.string.analysis_variance);
        } else if (value.equals("six")){
            testvidurl="https://www.youtube.com/watch?v=zOAFhwzos9Y";
            result_tst_txt.setText(R.string.repetive_test);
        } else if (value.equals("seven")){
            testvidurl="https://www.youtube.com/watch?v=_p3Ko3R5IvE";
            result_tst_txt.setText(R.string.oneway_repeated_anova);
        } else if (value.equals("eight")){
            testvidurl="https://www.youtube.com/watch?v=qIFrhaTQTSM";
            result_tst_txt.setText(R.string.single_t_test);
        } else if (value.equals("nine")){
            testvidurl="https://www.youtube.com/watch?v=VgL-JnpeUgw";
            result_tst_txt.setText(R.string.independent_test);
        } else if (value.equals("ten")){
            testvidurl="https://www.youtube.com/watch?v=0XRwqT93wEk";
            result_tst_txt.setText(R.string.one_way_anova);
        } else if (value.equals("eleven")){
            testvidurl="https://www.youtube.com/watch?v=86zD2UOTeok";
            result_tst_txt.setText(R.string.binominal_test);
        } else if (value.equals("twelve")){
            testvidurl="https://www.youtube.com/watch?v=pgb1eNOnvgg";
            result_tst_txt.setText(R.string.mann_white);
        } else if (value.equals("thirteen")){
            testvidurl="https://www.youtube.com/watch?v=9l3wiHV4t60";
            result_tst_txt.setText(R.string.kruskall_wallis);
        } else if (value.equals("fourteen")){
            testvidurl="https://www.youtube.com/watch?v=IFkh3WxYFCE";
            result_tst_txt.setText(R.string.willcoxon_test);
        } else if (value.equals("fifteen")){
            testvidurl="https://www.youtube.com/watch?v=Ch8H-x-mO3E";
            result_tst_txt.setText(R.string.friedman_test);
        }

        backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(TestResult.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        send_youtube.setOnStateChangeListener(new OnStateChangeListener() {
            @Override
            public void onStateChange(boolean active) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(testvidurl));
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                intent.setPackage("com.google.android.youtube");
                startActivity(intent);
            }
        });
    }
}
