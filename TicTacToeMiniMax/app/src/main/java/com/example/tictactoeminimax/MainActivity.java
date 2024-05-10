package com.example.tictactoeminimax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView img_j_MainActivity_ticTacToeBoard;
    Button btn_j_MainActivity_startTwoPlayer;
    Boolean boardIsEnabled;

    Intent TwoPlayerIntent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_j_MainActivity_startTwoPlayer = findViewById(R.id.btn_v_MainActivity_startTwoPlayer);

        img_j_MainActivity_ticTacToeBoard = (ImageView) findViewById(R.id.img_v_MainActivity_ticTacToeBoard);

        TwoPlayerIntent = new Intent(MainActivity.this, TwoPlayer.class);

        boardIsEnabled = true;

        buttonClickEventHandler();







    }


    public void buttonClickEventHandler()
    {

        btn_j_MainActivity_startTwoPlayer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d("Button Clicked", "Start Two Player");
                startActivity(TwoPlayerIntent);

            }
        });

    }




}