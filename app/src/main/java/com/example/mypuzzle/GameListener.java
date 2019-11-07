//Name: Keisha Ching
//Date: 11/6/19
//Class: CS301
package com.example.mypuzzle;

import android.app.Activity;
import android.graphics.Color;
import android.view.View;

public class GameListener extends Activity implements View.OnClickListener {

    private LocalGame myGame;
    protected String hold;

    //constructor
    public GameListener(LocalGame game) {
        myGame = game;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            //resets game by shuffling numbers
            case R.id.button:
                myGame.reset();

                //makes sure the reset game is solvable
                while(!myGame.isSolvable()) {
                    myGame.reset();
                }
                MainActivity.getInstance().b1.setText(myGame.tileList[0]);
                MainActivity.getInstance().b2.setText(myGame.tileList[1]);
                MainActivity.getInstance().b3.setText(myGame.tileList[2]);
                MainActivity.getInstance().b4.setText(myGame.tileList[3]);
                MainActivity.getInstance().b5.setText(myGame.tileList[4]);
                MainActivity.getInstance().b6.setText(myGame.tileList[5]);
                MainActivity.getInstance().b7.setText(myGame.tileList[6]);
                MainActivity.getInstance().b8.setText(myGame.tileList[7]);
                MainActivity.getInstance().b9.setText(myGame.tileList[8]);
                MainActivity.getInstance().b10.setText(myGame.tileList[9]);
                MainActivity.getInstance().b11.setText(myGame.tileList[10]);
                MainActivity.getInstance().b12.setText(myGame.tileList[11]);
                MainActivity.getInstance().b13.setText(myGame.tileList[12]);
                MainActivity.getInstance().b14.setText(myGame.tileList[13]);
                MainActivity.getInstance().b15.setText(myGame.tileList[14]);
                MainActivity.getInstance().b16.setText(myGame.tileList[15]);

                //changes background color if the puzzle is solved
                if(myGame.isSolved()){
                    MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                }
                else{
                    MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                }
                myGame.invalidate();
                break;
            //buttons on grid, moves if button next to it is black (legal move)
            case R.id.button1:
                if (myGame.tileList[1] == "" || myGame.tileList[4] == "") {
                    if(myGame.tileList[1]==""){
                        //switches numbers of button clicked
                        hold = myGame.tileList[0];
                        myGame.tileList[0] = myGame.tileList[1];
                        myGame.tileList[1] = hold;
                        //sets text on buttons
                        MainActivity.getInstance().b1.setText(myGame.tileList[0]);
                        MainActivity.getInstance().b2.setText(myGame.tileList[1]);
                        //changes color of background if solved
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[4]==""){
                        hold = myGame.tileList[0];
                        myGame.tileList[0] = myGame.tileList[4];
                        myGame.tileList[4] = hold;
                        MainActivity.getInstance().b1.setText(myGame.tileList[0]);
                        MainActivity.getInstance().b5.setText(myGame.tileList[4]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button2:
                if (myGame.tileList[0] == "" || myGame.tileList[2] == ""
                        || myGame.tileList[5] == "") {
                    if(myGame.tileList[0]==""){
                        hold = myGame.tileList[1];
                        myGame.tileList[1] = myGame.tileList[0];
                        myGame.tileList[0] = hold;
                        MainActivity.getInstance().b1.setText(myGame.tileList[0]);
                        MainActivity.getInstance().b2.setText(myGame.tileList[1]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[2]==""){
                        hold = myGame.tileList[1];
                        myGame.tileList[1] = myGame.tileList[2];
                        myGame.tileList[2] = hold;
                        MainActivity.getInstance().b2.setText(myGame.tileList[1]);
                        MainActivity.getInstance().b3.setText(myGame.tileList[2]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[5]==""){
                        hold = myGame.tileList[1];
                        myGame.tileList[1] = myGame.tileList[5];
                        myGame.tileList[5] = hold;
                        MainActivity.getInstance().b2.setText(myGame.tileList[1]);
                        MainActivity.getInstance().b6.setText(myGame.tileList[5]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button3:
                if (myGame.tileList[1] == "" || myGame.tileList[3] == ""
                        || myGame.tileList[6] == "") {
                    if(myGame.tileList[1]==""){
                        hold = myGame.tileList[2];
                        myGame.tileList[2] = myGame.tileList[1];
                        myGame.tileList[1] = hold;
                        MainActivity.getInstance().b2.setText(myGame.tileList[1]);
                        MainActivity.getInstance().b3.setText(myGame.tileList[2]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[3]==""){
                        hold = myGame.tileList[2];
                        myGame.tileList[2] = myGame.tileList[3];
                        myGame.tileList[3] = hold;
                        MainActivity.getInstance().b3.setText(myGame.tileList[2]);
                        MainActivity.getInstance().b4.setText(myGame.tileList[3]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[6]==""){
                        hold = myGame.tileList[2];
                        myGame.tileList[2] = myGame.tileList[6];
                        myGame.tileList[6] = hold;
                        MainActivity.getInstance().b3.setText(myGame.tileList[2]);
                        MainActivity.getInstance().b7.setText(myGame.tileList[6]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
            }
                break;
            case R.id.button4:
                if (myGame.tileList[2] == "" ||  myGame.tileList[7] == "") {
                    if(myGame.tileList[2]==""){
                        hold = myGame.tileList[3];
                        myGame.tileList[3] = myGame.tileList[2];
                        myGame.tileList[2] = hold;
                        MainActivity.getInstance().b3.setText(myGame.tileList[2]);
                        MainActivity.getInstance().b4.setText(myGame.tileList[3]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[7]==""){
                        hold = myGame.tileList[3];
                        myGame.tileList[3] = myGame.tileList[7];
                        myGame.tileList[7] = hold;
                        MainActivity.getInstance().b4.setText(myGame.tileList[3]);
                        MainActivity.getInstance().b8.setText(myGame.tileList[7]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button5:
                if (myGame.tileList[0] == "" || myGame.tileList[5] == ""
                        || myGame.tileList[8] == "") {
                    if(myGame.tileList[0]==""){
                        hold = myGame.tileList[4];
                        myGame.tileList[4] = myGame.tileList[0];
                        myGame.tileList[0] = hold;
                        MainActivity.getInstance().b1.setText(myGame.tileList[0]);
                        MainActivity.getInstance().b5.setText(myGame.tileList[4]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[5]==""){
                        hold = myGame.tileList[4];
                        myGame.tileList[4] = myGame.tileList[5];
                        myGame.tileList[5] = hold;
                        MainActivity.getInstance().b5.setText(myGame.tileList[4]);
                        MainActivity.getInstance().b6.setText(myGame.tileList[5]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[8]==""){
                        hold = myGame.tileList[4];
                        myGame.tileList[4] = myGame.tileList[8];
                        myGame.tileList[8] = hold;
                        MainActivity.getInstance().b5.setText(myGame.tileList[4]);
                        MainActivity.getInstance().b9.setText(myGame.tileList[8]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button6:
                if (myGame.tileList[1] == "" || myGame.tileList[4] == ""
                        || myGame.tileList[6] == "" || myGame.tileList[9] == "") {
                    if(myGame.tileList[1]==""){
                        hold = myGame.tileList[5];
                        myGame.tileList[5] = myGame.tileList[1];
                        myGame.tileList[1] = hold;
                        MainActivity.getInstance().b2.setText(myGame.tileList[1]);
                        MainActivity.getInstance().b6.setText(myGame.tileList[5]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[4]==""){
                        hold = myGame.tileList[5];
                        myGame.tileList[5] = myGame.tileList[4];
                        myGame.tileList[4] = hold;
                        MainActivity.getInstance().b5.setText(myGame.tileList[4]);
                        MainActivity.getInstance().b6.setText(myGame.tileList[5]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[6]==""){
                        hold = myGame.tileList[5];
                        myGame.tileList[5] = myGame.tileList[6];
                        myGame.tileList[6] = hold;
                        MainActivity.getInstance().b6.setText(myGame.tileList[5]);
                        MainActivity.getInstance().b7.setText(myGame.tileList[6]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[9]==""){
                        hold = myGame.tileList[5];
                        myGame.tileList[5] = myGame.tileList[9];
                        myGame.tileList[9] = hold;
                        MainActivity.getInstance().b10.setText(myGame.tileList[9]);
                        MainActivity.getInstance().b6.setText(myGame.tileList[5]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button7:
                if (myGame.tileList[2] == "" || myGame.tileList[5] == ""
                        || myGame.tileList[7] == "" || myGame.tileList[10] == "") {
                    if(myGame.tileList[2]==""){
                        hold = myGame.tileList[6];
                        myGame.tileList[6] = myGame.tileList[2];
                        myGame.tileList[2] = hold;
                        MainActivity.getInstance().b3.setText(myGame.tileList[2]);
                        MainActivity.getInstance().b7.setText(myGame.tileList[6]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[5]==""){
                        hold = myGame.tileList[6];
                        myGame.tileList[6] = myGame.tileList[5];
                        myGame.tileList[5] = hold;
                        MainActivity.getInstance().b6.setText(myGame.tileList[5]);
                        MainActivity.getInstance().b7.setText(myGame.tileList[6]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[7]==""){
                        hold = myGame.tileList[6];
                        myGame.tileList[6] = myGame.tileList[7];
                        myGame.tileList[7] = hold;
                        MainActivity.getInstance().b7.setText(myGame.tileList[6]);
                        MainActivity.getInstance().b8.setText(myGame.tileList[7]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[10]==""){
                        hold = myGame.tileList[6];
                        myGame.tileList[6] = myGame.tileList[10];
                        myGame.tileList[10] = hold;
                        MainActivity.getInstance().b7.setText(myGame.tileList[6]);
                        MainActivity.getInstance().b11.setText(myGame.tileList[10]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button8:
                if (myGame.tileList[3] == "" || myGame.tileList[6] == ""
                        || myGame.tileList[11] == "") {
                    if(myGame.tileList[3]==""){
                        hold = myGame.tileList[7];
                        myGame.tileList[7] = myGame.tileList[3];
                        myGame.tileList[3] = hold;
                        MainActivity.getInstance().b4.setText(myGame.tileList[3]);
                        MainActivity.getInstance().b8.setText(myGame.tileList[7]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[6]==""){
                        hold = myGame.tileList[7];
                        myGame.tileList[7] = myGame.tileList[6];
                        myGame.tileList[6] = hold;
                        MainActivity.getInstance().b7.setText(myGame.tileList[6]);
                        MainActivity.getInstance().b8.setText(myGame.tileList[7]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[11]==""){
                        hold = myGame.tileList[7];
                        myGame.tileList[7] = myGame.tileList[11];
                        myGame.tileList[11] = hold;
                        MainActivity.getInstance().b12.setText(myGame.tileList[11]);
                        MainActivity.getInstance().b8.setText(myGame.tileList[7]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button9:
                if (myGame.tileList[4] == "" || myGame.tileList[9] == ""
                        || myGame.tileList[12] == "") {
                    if(myGame.tileList[4]==""){
                        hold = myGame.tileList[8];
                        myGame.tileList[8] = myGame.tileList[4];
                        myGame.tileList[4] = hold;
                        MainActivity.getInstance().b5.setText(myGame.tileList[4]);
                        MainActivity.getInstance().b9.setText(myGame.tileList[8]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[9]==""){
                        hold = myGame.tileList[8];
                        myGame.tileList[8] = myGame.tileList[9];
                        myGame.tileList[9] = hold;
                        MainActivity.getInstance().b9.setText(myGame.tileList[8]);
                        MainActivity.getInstance().b10.setText(myGame.tileList[9]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[12]==""){
                        hold = myGame.tileList[8];
                        myGame.tileList[8] = myGame.tileList[12];
                        myGame.tileList[12] = hold;
                        MainActivity.getInstance().b9.setText(myGame.tileList[8]);
                        MainActivity.getInstance().b13.setText(myGame.tileList[12]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button10:
                if (myGame.tileList[5] == "" || myGame.tileList[8] == ""
                        || myGame.tileList[10] == "" || myGame.tileList[13] == "") {
                    if(myGame.tileList[5]==""){
                        hold = myGame.tileList[9];
                        myGame.tileList[9] = myGame.tileList[5];
                        myGame.tileList[5] = hold;
                        MainActivity.getInstance().b6.setText(myGame.tileList[5]);
                        MainActivity.getInstance().b10.setText(myGame.tileList[9]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[8]==""){
                        hold = myGame.tileList[9];
                        myGame.tileList[9] = myGame.tileList[8];
                        myGame.tileList[8] = hold;
                        MainActivity.getInstance().b9.setText(myGame.tileList[8]);
                        MainActivity.getInstance().b10.setText(myGame.tileList[9]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[10]==""){
                        hold = myGame.tileList[9];
                        myGame.tileList[9] = myGame.tileList[10];
                        myGame.tileList[10] = hold;
                        MainActivity.getInstance().b10.setText(myGame.tileList[9]);
                        MainActivity.getInstance().b11.setText(myGame.tileList[10]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[13]==""){
                        hold = myGame.tileList[9];
                        myGame.tileList[9] = myGame.tileList[13];
                        myGame.tileList[13] = hold;
                        MainActivity.getInstance().b10.setText(myGame.tileList[9]);
                        MainActivity.getInstance().b14.setText(myGame.tileList[13]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button11:
                if (myGame.tileList[6] == "" || myGame.tileList[9] == ""
                        || myGame.tileList[11] == "" || myGame.tileList[14] == "") {
                    if(myGame.tileList[6]==""){
                        hold = myGame.tileList[10];
                        myGame.tileList[10] = myGame.tileList[6];
                        myGame.tileList[6] = hold;
                        MainActivity.getInstance().b7.setText(myGame.tileList[6]);
                        MainActivity.getInstance().b11.setText(myGame.tileList[10]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[9]==""){
                        hold = myGame.tileList[10];
                        myGame.tileList[10] = myGame.tileList[9];
                        myGame.tileList[9] = hold;
                        MainActivity.getInstance().b10.setText(myGame.tileList[9]);
                        MainActivity.getInstance().b11.setText(myGame.tileList[10]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[11]==""){
                        hold = myGame.tileList[10];
                        myGame.tileList[10] = myGame.tileList[11];
                        myGame.tileList[11] = hold;
                        MainActivity.getInstance().b11.setText(myGame.tileList[10]);
                        MainActivity.getInstance().b12.setText(myGame.tileList[11]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[14]==""){
                        hold = myGame.tileList[10];
                        myGame.tileList[10] = myGame.tileList[14];
                        myGame.tileList[14] = hold;
                        MainActivity.getInstance().b11.setText(myGame.tileList[10]);
                        MainActivity.getInstance().b15.setText(myGame.tileList[14]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button12:
                if (myGame.tileList[7] == "" || myGame.tileList[10] == ""
                        || myGame.tileList[15] == "") {
                    if(myGame.tileList[7]==""){
                        hold = myGame.tileList[11];
                        myGame.tileList[11] = myGame.tileList[7];
                        myGame.tileList[7] = hold;
                        MainActivity.getInstance().b8.setText(myGame.tileList[7]);
                        MainActivity.getInstance().b12.setText(myGame.tileList[11]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[10]==""){
                        hold = myGame.tileList[11];
                        myGame.tileList[11] = myGame.tileList[10];
                        myGame.tileList[10] = hold;
                        MainActivity.getInstance().b11.setText(myGame.tileList[10]);
                        MainActivity.getInstance().b12.setText(myGame.tileList[11]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[15]==""){
                        hold = myGame.tileList[11];
                        myGame.tileList[11] = myGame.tileList[15];
                        myGame.tileList[15] = hold;
                        MainActivity.getInstance().b12.setText(myGame.tileList[11]);
                        MainActivity.getInstance().b16.setText(myGame.tileList[15]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button13:
                if (myGame.tileList[8] == "" || myGame.tileList[13] == "") {
                    if(myGame.tileList[8]==""){
                        hold = myGame.tileList[12];
                        myGame.tileList[12] = myGame.tileList[8];
                        myGame.tileList[8] = hold;
                        MainActivity.getInstance().b9.setText(myGame.tileList[8]);
                        MainActivity.getInstance().b13.setText(myGame.tileList[12]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[13]==""){
                        hold = myGame.tileList[12];
                        myGame.tileList[12] = myGame.tileList[13];
                        myGame.tileList[13] = hold;
                        MainActivity.getInstance().b14.setText(myGame.tileList[13]);
                        MainActivity.getInstance().b13.setText(myGame.tileList[12]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button14:
                if (myGame.tileList[9] == "" || myGame.tileList[12] == ""
                        || myGame.tileList[14] == ""){
                    if(myGame.tileList[9]==""){
                        hold = myGame.tileList[13];
                        myGame.tileList[13] = myGame.tileList[9];
                        myGame.tileList[9] = hold;
                        MainActivity.getInstance().b10.setText(myGame.tileList[9]);
                        MainActivity.getInstance().b14.setText(myGame.tileList[13]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[12]==""){
                        hold = myGame.tileList[13];
                        myGame.tileList[13] = myGame.tileList[12];
                        myGame.tileList[12] = hold;
                        MainActivity.getInstance().b13.setText(myGame.tileList[12]);
                        MainActivity.getInstance().b14.setText(myGame.tileList[13]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[14]==""){
                        hold = myGame.tileList[13];
                        myGame.tileList[13] = myGame.tileList[14];
                        myGame.tileList[14] = hold;
                        MainActivity.getInstance().b14.setText(myGame.tileList[13]);
                        MainActivity.getInstance().b15.setText(myGame.tileList[14]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button15:
                if (myGame.tileList[10] == "" || myGame.tileList[13] == ""
                        || myGame.tileList[15] == "") {
                    if(myGame.tileList[10]==""){
                        hold = myGame.tileList[14];
                        myGame.tileList[14] = myGame.tileList[10];
                        myGame.tileList[10] = hold;
                        MainActivity.getInstance().b11.setText(myGame.tileList[10]);
                        MainActivity.getInstance().b15.setText(myGame.tileList[14]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[13]==""){
                        hold = myGame.tileList[14];
                        myGame.tileList[14] = myGame.tileList[13];
                        myGame.tileList[13] = hold;
                        MainActivity.getInstance().b14.setText(myGame.tileList[13]);
                        MainActivity.getInstance().b15.setText(myGame.tileList[14]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[15]==""){
                        hold = myGame.tileList[14];
                        myGame.tileList[14] = myGame.tileList[15];
                        myGame.tileList[15] = hold;
                        MainActivity.getInstance().b15.setText(myGame.tileList[14]);
                        MainActivity.getInstance().b16.setText(myGame.tileList[15]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                }
                break;
            case R.id.button16:
                if (myGame.tileList[11] == "" || myGame.tileList[14] == "") {
                    if(myGame.tileList[11]==""){
                        hold = myGame.tileList[15];
                        myGame.tileList[15] = myGame.tileList[11];
                        myGame.tileList[11] = hold;
                        MainActivity.getInstance().b12.setText(myGame.tileList[11]);
                        MainActivity.getInstance().b16.setText(myGame.tileList[15]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    else if(myGame.tileList[14]==""){
                        hold = myGame.tileList[15];
                        myGame.tileList[15] = myGame.tileList[14];
                        myGame.tileList[14] = hold;
                        MainActivity.getInstance().b15.setText(myGame.tileList[14]);
                        MainActivity.getInstance().b16.setText(myGame.tileList[15]);
                        if(myGame.isSolved()){
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 141, 126, 187));
                        }
                        else{
                            MainActivity.getInstance().mySurfaceView.setBackgroundColor(Color.argb(255, 243, 231, 132));
                        }
                        myGame.invalidate();
                        break;
                    }
                    break;
                }
                break;
        }
    }
}
