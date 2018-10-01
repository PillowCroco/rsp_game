package com.virgin.trial.rsp_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ImageButton btn_rock;
    private ImageButton btn_scissors;
    private ImageButton btn_paper;
    private ImageButton btn_cpu;

    private TextView text_result;
    private TextView text_stat;

    int win = 0, lose = 0, draw = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_rock = findViewById(R.id.btn_rock);
        btn_scissors = findViewById(R.id.btn_scissors);
        btn_paper = findViewById(R.id.btn_paper);
        btn_cpu = findViewById(R.id.btn_cpu);

        text_result = findViewById(R.id.text_result);
        text_stat = findViewById(R.id.text_stat);




        btn_rock.setOnClickListener(this);

    }

    public void onClick(View view){
        if (view.getId() == R.id.btn_rock) {

        }
    }
}
