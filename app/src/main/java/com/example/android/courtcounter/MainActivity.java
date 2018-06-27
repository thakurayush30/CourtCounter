package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreOfA=0,scoreOfB=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add_three_to_a(View view){
        scoreOfA=scoreOfA+3;
        displayForTeamA(scoreOfA);
    }

    public void add_three_to_b(View view){
        scoreOfB=scoreOfB+3;
        displayForTeamB(scoreOfB);
    }

    public void add_two_to_a(View view){
        scoreOfA=scoreOfA+2;
        displayForTeamA(scoreOfA);
    }

    public void add_two_to_b(View view){
        scoreOfB=scoreOfB+2;
        displayForTeamB(scoreOfB);
    }

    public void add_one_to_a(View view){
        scoreOfA=scoreOfA+1;
        displayForTeamA(scoreOfA);
    }

    public void add_one_to_b(View view){
        scoreOfB=scoreOfB+1;
        displayForTeamB(scoreOfB);
    }

    public void reset_score(View view){
        scoreOfA=0;
        scoreOfB=0;
        displayForTeamA(scoreOfA);
        displayForTeamB(scoreOfB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
