package com.virgin.trial.rsp_game;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Random rand = new Random();

    private ImageButton btn_rock;
    private ImageButton btn_scissors;
    private ImageButton btn_paper;
    private TextView btn_reset;

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
        btn_reset = findViewById(R.id.btn_reset);

        text_result = findViewById(R.id.text_result);
        text_stat = findViewById(R.id.text_stat);


        btn_rock.setOnClickListener(this);
        btn_scissors.setOnClickListener(this);
        btn_paper.setOnClickListener(this);
        btn_reset.setOnClickListener(this);

    }

    public void onClick(View view) {
        // 0-rock 1-scissors 2-paper
        int cpu = rand.nextInt(3);
        int player;

        if (view.getId() == R.id.btn_rock) {
            player = 0;
        } else if (view.getId() == R.id.btn_scissors) {
            player = 1;
        } else if (view.getId() == R.id.btn_paper) {
            player = 2;
        } else if (view.getId() == R.id.btn_reset) {
            win = 0;
            lose = 0;
            draw = 0;
            return;
        } else {
            return;
        }

        //win, draw, lose
        if (player + 1 == cpu || player - 2 == cpu) {
            win++;
            Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show();
        } else if (player == cpu) {
            draw++;
            Toast.makeText(this, "Draw!", Toast.LENGTH_SHORT).show();
        } else {
            lose++;
            Toast.makeText(this, "You Lose!", Toast.LENGTH_SHORT).show();
        }

    }
}
