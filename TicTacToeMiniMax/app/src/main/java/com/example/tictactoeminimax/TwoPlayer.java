package com.example.tictactoeminimax;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TwoPlayer extends AppCompatActivity {



    ImageView   img_j_TwoPlayer_gameBoard;

    ImageView   btn_j_TwoPlayer_Location0;
    ImageView   btn_j_TwoPlayer_Location1;
    ImageView   btn_j_TwoPlayer_Location2;
    ImageView   btn_j_TwoPlayer_Location3;
    ImageView   btn_j_TwoPlayer_Location4;
    ImageView   btn_j_TwoPlayer_Location5;
    ImageView   btn_j_TwoPlayer_Location6;
    ImageView   btn_j_TwoPlayer_Location7;
    ImageView   btn_j_TwoPlayer_Location8;

    Button      btn_j_TwoPlayer_toggleButton;

    Boolean     b_toggleTesting;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);


        img_j_TwoPlayer_gameBoard = (ImageView) findViewById(R.id.img_v_TwoPlayer_gameBoard);

        btn_j_TwoPlayer_Location0 = (ImageView) findViewById(R.id.btn_v_TwoPlayer_location0);

        btn_j_TwoPlayer_toggleButton = findViewById(R.id.btn_v_PlayerTwo_toggleButton);

        b_toggleTesting = true;

       buttonClickEventHandler_PlayerTwo();


    }

    public void buttonClickEventHandler_PlayerTwo()
    {

        //  TOGGLE BUTTON
        btn_j_TwoPlayer_toggleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                    btn_j_TwoPlayer_Location0.setAlpha(0.0f);

                Log.d("Button Clicked", "Toggle Button");

            }
        });

        //  FLIP X AND O BUTTON FOR LOCATION 0
        btn_j_TwoPlayer_Location0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (b_toggleTesting)
                {

                    btn_j_TwoPlayer_Location0.setImageResource(R.drawable.tictactoeo);
                    btn_j_TwoPlayer_Location0.setAlpha(1.0f);
                    b_toggleTesting = false;

                }
                else {
                    btn_j_TwoPlayer_Location0.setImageResource(R.drawable.tictactoex);
                    btn_j_TwoPlayer_Location0.setAlpha(1.0f);
                    b_toggleTesting = true;

                }


                Log.d("Image Clicked", "Location 0 Clicked");

            }
        });





    }






}