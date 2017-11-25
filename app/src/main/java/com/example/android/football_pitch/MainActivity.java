package com.example.android.football_pitch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int goalsTeamA;
    int goalsTeamB;
    int shotsTeamA;
    int shotsTeamB;

    /**
     * Displays the given goals for Team A.
     */
    public void teamAScoreDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots for Team A.
     */
    public void teamAShotsDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotsTeamA);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase number of GOALS for Team A.
     */
    public void teamAScores(View view) {
        goalsTeamA = goalsTeamA + 1;
        teamAScoreDisplay(goalsTeamA);
    }

    /**
     * Increase number of SHOTS for Team A.
     */
    public void teamAShots(View view) {
        shotsTeamA = shotsTeamA + 1;
        teamAShotsDisplay(shotsTeamA);
    }





    /**
     * Displays the given goals for Team A.
     */
    public void teamBScoreDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given shots for Team A.
     */
    public void teamBShotsDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.shotsTeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase number of GOALS for Team A.
     */
    public void teamBscores(View view) {
        goalsTeamB = goalsTeamB + 1;
        teamBScoreDisplay(goalsTeamB);
    }

    /**
     * Increase number of SHOTS for Team A.
     */
    public void teamBshots(View view) {
        shotsTeamB = shotsTeamB + 1;
        teamBShotsDisplay(shotsTeamB);
    }

    /**
     * Reset all scores
     */
    public void resetAll(View view) {
        goalsTeamA = 0;
        goalsTeamB = 0;
        shotsTeamA = 0;
        shotsTeamB = 0;
        teamAScoreDisplay(goalsTeamA);
        teamAShotsDisplay(shotsTeamA);
        teamBScoreDisplay(goalsTeamB);
        teamBShotsDisplay(shotsTeamB);
    }
}
