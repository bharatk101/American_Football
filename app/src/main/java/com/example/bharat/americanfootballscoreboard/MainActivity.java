package com.example.bharat.americanfootballscoreboard;

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

    int teamA = 0;
    int teamB = 0;

    public void sixptsA(View view){
        teamA += 6;
        displayA(teamA);
    }

    public void sixptsB(View view){
        teamB += 6;
        displayB(teamB);
    }

    public void oneptA(View view){
        teamA += 1;
        displayA(teamA);
    }
    public void oneptB(View view){
        teamB += 1;
        displayB(teamB);
    }

    public void twoptsA(View view){
        teamA += 2;
        displayA(teamA);
    }

    public void twoptsB(View view){
        teamB += 2;
        displayB(teamB);
    }

    public void threeptsA(View view){
        teamA += 3;
        displayA(teamA);
    }
    public void threeptsB(View view){
        teamB += 3;
        displayB(teamB);
    }




    public void format(View view){
        teamA = 0;
        teamB = 0;
        displayA(teamA);
        displayB(teamB);
    }



    public void displayA(int teamA){
        TextView scoreA = (TextView) findViewById(R.id.teamAPts);
        scoreA.setText(String.valueOf(teamA));
    }

    public void displayB(int teamB){
        TextView scoreB = (TextView) findViewById(R.id.teamBPts);
        scoreB.setText(String.valueOf(teamB));
    }
}
