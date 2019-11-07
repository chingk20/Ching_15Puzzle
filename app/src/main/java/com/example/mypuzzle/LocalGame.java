//Name: Keisha Ching
//Date: 11/6/19
//Class: CS301
//Enhancement: Implemented a way for puzzles that are only solvable to
// be made using isSolvable() to check if the random puzzle is solvable
package com.example.mypuzzle;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;

import java.util.Random;

public class LocalGame extends SurfaceView {

    protected static final int col = 4;
    protected static final int dimension= col * col;
    protected static final int numTiles = dimension -1;
    protected static final String[] tileList = new String[dimension];
    protected final String[] solution = new String[dimension];

    Random random = new Random();

    public LocalGame(Context context, AttributeSet attrs) {
        super(context, attrs);
        setWillNotDraw(false);
        fillSolution();         //sets solution to check with puzzle
        reset();                //randomizes puzzle to begin game

        //makes sure the reset game is solvable
        while(!isSolvable()) {
            reset();
        }
    }

    //creates and fills solution array with correct numbers to compare with
    private void fillSolution() {
        for (int i = 0; i < dimension; i++) {
            solution[i] = String.valueOf(i+1);
        }
        solution[15]= "";
    }

    //shuffles numbers and randomly places them on tiles
    public void reset(){
        int index;              //stores the random number
        boolean isSame = false; //checks for duplications
        int k=0;                //used to keep track of place in check array
        String temp;            //placeholder
        String[] check = new String[dimension]; //array to store random numbers

        //set all elements in check array to -1
        for(int l=0; l<dimension; l++){
            check[l]= String.valueOf(-1);
        }

        //sets random number in tileList array
        for(int i=0; i<dimension; i++){
            isSame = false;     //reset to false
            index = random.nextInt(dimension);

            //checks check array to make sure there is no duplicates
            for(int j=0; j<dimension; j++){
                if(check[j]==String.valueOf(index)){
                    isSame = true;
                    i--;    //makes sure spot isn't skipped
                }
            }

            //Random number is not a duplicate so num into tileList
            if(!isSame) {
                check[k++] = String.valueOf(index);     //stores random num
                tileList[i] = String.valueOf(index);
            }
        }

        //changes value of 0 to "" for display purposes
        for(int m=0; m<dimension; m++){
            if(tileList[m]==String.valueOf(0)){
                tileList[m]="";
            }
        }
    }

    //checks to see if the puzzle is correct
    protected boolean isSolved() {
        for (int i=0; i<dimension; i++)
        {
            if(tileList[i]!=solution[i])
            {
                return false;
            }
        }
        return true;
    }

    //checks to see if the puzzle is solvable
    protected boolean isSolvable() {
        int countInversions = 0;
        int k=0;
        int l=0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < i; j++) {
                //gets int values of array
                switch (tileList[j]) {
                    case "":
                        k = 0;
                    case "1":
                        k = 1;
                    case "2":
                        k = 2;
                    case "3":
                        k = 3;
                    case "4":
                        k = 4;
                    case "5":
                        k = 5;
                    case "6":
                        k = 6;
                    case "7":
                        k = 7;
                    case "8":
                        k = 8;
                    case "9":
                        k = 9;
                    case "10":
                        k = 10;
                    case "11":
                        k = 11;
                    case "12":
                        k = 12;
                    case "13":
                        k = 13;
                    case "14":
                        k = 14;
                    case "15":
                        k = 15;
                }
                switch (tileList[i]){
                    case "":
                        l = 0;
                    case "1":
                        l = 1;
                    case "2":
                        l = 2;
                    case "3":
                        l = 3;
                    case "4":
                        l = 4;
                    case "5":
                        l = 5;
                    case "6":
                        l = 6;
                    case "7":
                        l = 7;
                    case "8":
                        l = 8;
                    case "9":
                        l = 9;
                    case "10":
                        l = 10;
                    case "11":
                        l = 11;
                    case "12":
                        l = 12;
                    case "13":
                        l = 13;
                    case "14":
                        l = 14;
                    case "15":
                        l = 15;
                }
                if (k > l) {
                    countInversions++;
                }
            }
        }
        return countInversions % 2 == 0;
    }
}
