package com.example.scoreboard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA= 0 ;
    int scoreB= 0 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**Button for team A**/
    public void point3A(View view){
        scoreA=scoreA+3;
        displayForTeamA(scoreA);
    }
    public void point2A(View view){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }
    public void freethrowA(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    /**Button for team A**/
    public void point3B(View view){
        scoreB=scoreB+3;
        displayForTeamB(scoreB);
    }
    public void point2B(View view){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void freethrowB(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showA);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.showB);
        scoreView.setText(String.valueOf(score));
    }
    public void Reseter(View view){
        scoreA = 0 ;
        scoreB = 0 ;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}