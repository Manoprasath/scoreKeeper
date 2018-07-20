package com.lakeba.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        int scoreTeamA = 0;
        int scoreTeamB = 0;
        int yellowCardTeamA = 0;
        int redCardTeamA = 0;
        int yellowCardTeamB = 0;
        int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayScore(View view){
        switch (view.getId()){
            case R.id.goalA :
                scoreTeamA = scoreTeamA + 1;
                displayForTeamA(scoreTeamA);
                break;
            case R.id.yellowCardA :
                yellowCardTeamA = yellowCardTeamA + 1;
                displayYellowForTeamA(yellowCardTeamA);
                break;
            case R.id.redCardA :
                redCardTeamA = redCardTeamA + 1;
                displayRedForTeamA(redCardTeamA);
                break;
            case R.id.goalB :
                scoreTeamB = scoreTeamB + 1;
                displayForTeamB(scoreTeamB);
                break;
            case R.id.yellowCardB :
                yellowCardTeamB = yellowCardTeamB + 1;
                displayYellowForTeamB(yellowCardTeamB);
                break;
            case R.id.redCardB :
                redCardTeamB = redCardTeamB + 1;
                displayRedForTeamB(redCardTeamB);
                break;
            case R.id.reset :
                int scoreTeamA = 0;
                int scoreTeamB = 0;
                int yellowCardTeamA = 0;
                int redCardTeamA = 0;
                int yellowCardTeamB = 0;
                int redCardTeamB = 0;
                displayForTeamA(scoreTeamA);
                displayForTeamB(scoreTeamB);
                displayYellowForTeamA(yellowCardTeamA);
                displayYellowForTeamB(yellowCardTeamB);
                displayRedForTeamA(redCardTeamA);
                displayRedForTeamB(redCardTeamB);
        }
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayYellowForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_textA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayRedForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_textA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayYellowForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.yellow_textB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayRedForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.red_textB);
        scoreView.setText(String.valueOf(score));
    }

}
