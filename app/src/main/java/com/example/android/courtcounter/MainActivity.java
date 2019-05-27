package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void increment1(View view) {
        score = score + 1;
        display(score);
    }

    public void increment2(View view) {
        score = score + 2;
        display(score);
    }

    public void increment3(View view) {
        score = score + 3;
        display(score);
    }


   public void increment1B(View view){
        scoreB = scoreB + 1;
        displayB(scoreB);
   }

    public void increment2B(View view){
        scoreB = scoreB + 2;
        displayB(scoreB);
    }
    public void increment3B(View view){
        scoreB = scoreB + 3;
        displayB(scoreB);
    }

    private void display (int number) {
        TextView teamScoreTextView = findViewById(R.id.teamScore);
        teamScoreTextView.setText("" + number);
    }
    private void displayB (int number) {
        TextView teamScoreBTextView = findViewById(R.id.teamScoreB);
        teamScoreBTextView.setText("" + number);
    }

    public void reset(View view) {
        score = 0;
        scoreB = 0;
        display(score);
        displayB(scoreB);
    }
}