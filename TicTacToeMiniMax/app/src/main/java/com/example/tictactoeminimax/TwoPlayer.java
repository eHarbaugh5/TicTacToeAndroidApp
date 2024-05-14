package com.example.tictactoeminimax;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class TwoPlayer extends AppCompatActivity {



    ImageView   img_j_TwoPlayer_gameBoard;

    //  Locations
    //  ================================================================
    ImageView   btn_j_TwoPlayer_Location0;
    ImageView   btn_j_TwoPlayer_Location1;
    ImageView   btn_j_TwoPlayer_Location2;
    ImageView   btn_j_TwoPlayer_Location3;
    ImageView   btn_j_TwoPlayer_Location4;
    ImageView   btn_j_TwoPlayer_Location5;
    ImageView   btn_j_TwoPlayer_Location6;
    ImageView   btn_j_TwoPlayer_Location7;
    ImageView   btn_j_TwoPlayer_Location8;
    TextView    tv_j_TwoPlayer_winnerText;

    //  ================================================================
    Button      btn_j_TwoPlayer_resetGame;
    Button      btn_j_TwoPlayer_goToMainActivity;
    Intent      MainActivityIntent;

    Boolean     b_toggleTesting;

    //  Game Dependencies
    Boolean     playerOneTurn;
    Boolean     isGameover;
    int gameTimer;
    char[][] gameBoard;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_player);

        gameBoard = new char[][]{ {'0', '3', '6'}, {'1', '4', '7'}, {'2', '5', '8'} };

        img_j_TwoPlayer_gameBoard = (ImageView) findViewById(R.id.img_v_TwoPlayer_gameBoard);

        btn_j_TwoPlayer_Location0 = (ImageView) findViewById(R.id.btn_v_TwoPlayer_location0);
        btn_j_TwoPlayer_Location1 = (ImageView) findViewById(R.id.btn_v_TwoPlayer_location1);
        btn_j_TwoPlayer_Location2 = (ImageView) findViewById(R.id.btn_v_TwoPlayer_location2);
        btn_j_TwoPlayer_Location3 = (ImageView) findViewById(R.id.btn_v_TwoPlayer_location3);
        btn_j_TwoPlayer_Location4 = (ImageView) findViewById(R.id.btn_v_TwoPlayer_location4);
        btn_j_TwoPlayer_Location5 = (ImageView) findViewById(R.id.btn_v_TwoPlayer_location5);
        btn_j_TwoPlayer_Location6 = (ImageView) findViewById(R.id.btn_v_TwoPlayer_location6);
        btn_j_TwoPlayer_Location7 = (ImageView) findViewById(R.id.btn_v_TwoPlayer_location7);
        btn_j_TwoPlayer_Location8 = (ImageView) findViewById(R.id.btn_v_TwoPlayer_location8);

        btn_j_TwoPlayer_resetGame = findViewById(R.id.btn_v_PlayerTwo_resetGame);
        btn_j_TwoPlayer_goToMainActivity = findViewById(R.id.btn_v_PlayerTwo_goToMainActivity);

        MainActivityIntent = new Intent(TwoPlayer.this, MainActivity.class);

        tv_j_TwoPlayer_winnerText = findViewById(R.id.tv_v_TwoPlayer_winnerText);
        tv_j_TwoPlayer_winnerText.setVisibility(View.INVISIBLE);
        btn_j_TwoPlayer_resetGame.setVisibility(View.INVISIBLE);

        isGameover = false;
        b_toggleTesting = true;
        resetGameBoard();

       buttonClickEventHandler_TwoPlayer();


    }

    public void buttonClickEventHandler_TwoPlayer()
    {

        //  TOGGLE BUTTON
        btn_j_TwoPlayer_resetGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                resetGameBoard();


            }
        });

        btn_j_TwoPlayer_goToMainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(MainActivityIntent);
            }
        });

        //  Location Click Handlers
        //  ================================================================================

        //  Location 0 Pressed
        btn_j_TwoPlayer_Location0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                placeAtLocation(btn_j_TwoPlayer_Location0, 0);
                testingLogCall("buttonClickEventHandler_TwoPlayer", 0, "Clicked Button 0");

            }
        });
        //  Location 1 Pressed
        btn_j_TwoPlayer_Location1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeAtLocation(btn_j_TwoPlayer_Location1, 1);
                testingLogCall("buttonClickEventHandler_TwoPlayer", 0, "Clicked Button 0");
            }
        });
        //  Location 2 Pressed
        btn_j_TwoPlayer_Location2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeAtLocation(btn_j_TwoPlayer_Location2, 2);
                testingLogCall("buttonClickEventHandler_TwoPlayer", 0, "Clicked Button 0");
            }
        });
        //  Location 3 Pressed
        btn_j_TwoPlayer_Location3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeAtLocation(btn_j_TwoPlayer_Location3, 3);
                testingLogCall("buttonClickEventHandler_TwoPlayer", 0, "Clicked Button 0");
            }
        });
        //  Location 4 Pressed
        btn_j_TwoPlayer_Location4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeAtLocation(btn_j_TwoPlayer_Location4, 4);
                testingLogCall("buttonClickEventHandler_TwoPlayer", 0, "Clicked Button 0");
            }
        });
        //  Location 5 Pressed
        btn_j_TwoPlayer_Location5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeAtLocation(btn_j_TwoPlayer_Location5, 5);
                testingLogCall("buttonClickEventHandler_TwoPlayer", 0, "Clicked Button 0");
            }
        });
        //  Location 6 Pressed
        btn_j_TwoPlayer_Location6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeAtLocation(btn_j_TwoPlayer_Location6, 6);
                testingLogCall("buttonClickEventHandler_TwoPlayer", 0, "Clicked Button 0");
            }
        });
        //  Location 7 Pressed
        btn_j_TwoPlayer_Location7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeAtLocation(btn_j_TwoPlayer_Location7, 7);
                testingLogCall("buttonClickEventHandler_TwoPlayer", 0, "Clicked Button 0");
            }
        });
        //  Location 8 Pressed
        btn_j_TwoPlayer_Location8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeAtLocation(btn_j_TwoPlayer_Location8, 8);
                testingLogCall("buttonClickEventHandler_TwoPlayer", 0, "Clicked Button 0");
            }
        });

        //  ================================================================================



    }


    public void placeAtLocation(ImageView imageLocation, int location )
    {

        //  Player clicks their desired Location

        //  Call the gameLoop Function
        if (!isGameover)
        {
            if (canPlaceAtLocation(location))
            {
                //  Place Piece, Check For Winner
                gameLoop(location);
                //  Update Game Board
                updateGameBoard(imageLocation);
                //  Swap Player turn
                playerOneTurn = !playerOneTurn;
                //  Decrease Timer
                gameTimer--;
            }

        }
        else if (gameTimer == 0)
        {
            isGameover = true;

        }


    }

    public void gameLoop(int location)
    {
        int inputX = location % 3;
        int inputY = (location - inputX) / 3;

        //  place player One or Two's piece
        if (playerOneTurn) {
            gameBoard[inputX][inputY] = 'X';
        }
        else
        {
            gameBoard[inputX][inputY] = 'O';
        }

        char currWinner = checkForWinner(location);

        //  check if they won
        if (currWinner != 'N')
        {

            //  temp log just to see results
            //Log.d("gameLoop", "checkForWinner -> " +  "Winner");
            String winnerTextToDisplay = currWinner + " Is The Winner!";

            tv_j_TwoPlayer_winnerText.setText(winnerTextToDisplay);
            tv_j_TwoPlayer_winnerText.setVisibility(View.VISIBLE);
            btn_j_TwoPlayer_resetGame.setVisibility(View.VISIBLE);
            isGameover = true;

        }


        //Log.d("gameLoop function", "======== End Of Turn =======");


    }


    public char checkForWinner(int location)
    {

        int x = location % 3;
        int y = (location - x) / 3;

        //  check Columns and Rows
        if (gameBoard[x][0] == gameBoard[x][1] && gameBoard[x][1] == gameBoard[x][2])
        {

            if (gameBoard[x][y] == 'X' || gameBoard[x][y] == 'O')
            {

                //  winner
                //Log.d("checkForWinner", "X Column");
                return gameBoard[x][y];

            }

        } else if (gameBoard[0][y] == gameBoard[1][y] && gameBoard[1][y] == gameBoard[2][y])
        {

            if (gameBoard[x][y] == 'X' || gameBoard[x][y] == 'O')
            {

                //  winner
                //Log.d("checkForWinner", "Y Column");
                return gameBoard[x][y];

            }

        }

        //  check diagonals
        if (location % 2 == 0)
        {
            //  Down Right
            if (gameBoard[0][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[2][2])
            {

                if (gameBoard[x][y] == 'X' || gameBoard[x][y] == 'O')
                {

                    //  winner
                    //Log.d("checkForWinner", "Diagonal Down Right");
                    return gameBoard[x][y];

                }

            //  Up Right
            } else if (gameBoard[2][0] == gameBoard[1][1] && gameBoard[1][1] == gameBoard[0][2])
            {

                if (gameBoard[x][y] == 'X' || gameBoard[x][y] == 'O')
                {

                    //  winner
                    //Log.d("checkForWinner", "Diagonal Up Right");
                    return gameBoard[x][y];

                }

            }

        }

        //  nobody wins
        //Log.d("checkForWinner", "Nobody");
        if (gameTimer > 0)
        {
            return 'N';
        }

        return 'C';




    }

    public boolean canPlaceAtLocation(int location)
    {
        int x = location % 3;
        int y = (location - x) / 3;

        if (gameBoard[x][y] != 'X' && gameBoard[x][y] != 'O')
        {
            return true;
        }

        return false;

    }


    public void updateGameBoard(ImageView imageLocation)
    {

        if (imageLocation.getAlpha() == 0.0f)
        {
            //  True -> X
            if (playerOneTurn)
            {
                imageLocation.setImageResource(R.drawable.tictactoex);
                imageLocation.setAlpha(1.0f);

            }
            //  False -> O
            else {
                imageLocation.setImageResource(R.drawable.tictactoeo);
                imageLocation.setAlpha(1.0f);

            }
        }

    }

    public void resetGameBoard()
    {

        gameBoard = new char[][]{ {'0', '3', '6'}, {'1', '4', '7'}, {'2', '5', '8'} };
        playerOneTurn = true;
        gameTimer = 9;
        tv_j_TwoPlayer_winnerText.setVisibility(View.INVISIBLE);
        btn_j_TwoPlayer_resetGame.setVisibility(View.INVISIBLE);



        btn_j_TwoPlayer_Location0.setAlpha(0.0f);
        btn_j_TwoPlayer_Location1.setAlpha(0.0f);
        btn_j_TwoPlayer_Location2.setAlpha(0.0f);
        btn_j_TwoPlayer_Location3.setAlpha(0.0f);
        btn_j_TwoPlayer_Location4.setAlpha(0.0f);
        btn_j_TwoPlayer_Location5.setAlpha(0.0f);
        btn_j_TwoPlayer_Location6.setAlpha(0.0f);
        btn_j_TwoPlayer_Location7.setAlpha(0.0f);
        btn_j_TwoPlayer_Location8.setAlpha(0.0f);

        b_toggleTesting = true;
        isGameover = false;

    }

    public void testingLogCall(String function, int call, String message)
    {

        if (call == 2)
        {

            Log.d(function + "", message + "");

        }
        if (call == 1)
        {

            Log.d(function + "", message + "");

        }


    }





}