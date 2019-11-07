//Name: Keisha Ching
//Date: 11/6/19
//Class: CS301
package com.example.mypuzzle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private static MainActivity instance;
    public Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
            b11, b12, b13, b14, b15, b16;
    public LocalGame mySurfaceView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySurfaceView = (LocalGame) findViewById(R.id.surfaceView);
        GameListener myListener = new GameListener(mySurfaceView);

        Button resetButton = (Button) findViewById(R.id.button);
        resetButton.setOnClickListener(myListener);
        b1 = (Button) findViewById(R.id.button1);
        b1.setOnClickListener(myListener);
        b2 = (Button) findViewById(R.id.button2);
        b2.setOnClickListener(myListener);
        b3 = (Button) findViewById(R.id.button3);
        b3.setOnClickListener(myListener);
        b4 = (Button) findViewById(R.id.button4);
        b4.setOnClickListener(myListener);
        b5 = (Button) findViewById(R.id.button5);
        b5.setOnClickListener(myListener);
        b6 = (Button) findViewById(R.id.button6);
        b6.setOnClickListener(myListener);
        b7 = (Button) findViewById(R.id.button7);
        b7.setOnClickListener(myListener);
        b8 = (Button) findViewById(R.id.button8);
        b8.setOnClickListener(myListener);
        b9 = (Button) findViewById(R.id.button9);
        b9.setOnClickListener(myListener);
        b10 = (Button) findViewById(R.id.button10);
        b10.setOnClickListener(myListener);
        b11 = (Button) findViewById(R.id.button11);
        b11.setOnClickListener(myListener);
        b12 = (Button) findViewById(R.id.button12);
        b12.setOnClickListener(myListener);
        b13 = (Button) findViewById(R.id.button13);
        b13.setOnClickListener(myListener);
        b14 = (Button) findViewById(R.id.button14);
        b14.setOnClickListener(myListener);
        b15 = (Button) findViewById(R.id.button15);
        b15.setOnClickListener(myListener);
        b16 = (Button) findViewById(R.id.button16);
        b16.setOnClickListener(myListener);

        //show initial numbers on puzzle
        if (LocalGame.tileList[0]==String.valueOf(0)) {
            b1.setText("");
        }
        else if (LocalGame.tileList[0]==String.valueOf(1)) {
            b1.setText("1");
        }
        else if (LocalGame.tileList[0]==String.valueOf(2)) {
            b1.setText("2");
        }
        else if (LocalGame.tileList[0]==String.valueOf(3)) {
            b1.setText("3");
        }
        else if (LocalGame.tileList[0]==String.valueOf(4)) {
            b1.setText("4");
        }
        else if (LocalGame.tileList[0]==String.valueOf(5)) {
            b1.setText("5");
        }
        else if (LocalGame.tileList[0]==String.valueOf(6)) {
            b1.setText("6");
        }
        else if (LocalGame.tileList[0]==String.valueOf(7)) {
            b1.setText("7");
        }
        else if (LocalGame.tileList[0]==String.valueOf(8)) {
            b1.setText("8");
        }
        else if (LocalGame.tileList[0]==String.valueOf(9)) {
            b1.setText("9");
        }
        else if (LocalGame.tileList[0]==String.valueOf(10)) {
            b1.setText("10");
        }
        else if (LocalGame.tileList[0]==String.valueOf(11)) {
            b1.setText("11");
        }
        else if (LocalGame.tileList[0]==String.valueOf(12)) {
            b1.setText("12");
        }
        else if (LocalGame.tileList[0]==String.valueOf(13)) {
            b1.setText("14");
        }
        else if (LocalGame.tileList[0]==String.valueOf(14)) {
            b1.setText("15");
        }
        else if (LocalGame.tileList[0]==String.valueOf(15)) {
            b1.setText("16");
        }

        if (LocalGame.tileList[1]==String.valueOf(0)) {
            b2.setText("");
        }
        else if (LocalGame.tileList[1]==String.valueOf(1)) {
            b2.setText("1");
        }
        else if (LocalGame.tileList[1]==String.valueOf(2)) {
            b2.setText("2");
        }
        else if (LocalGame.tileList[1]==String.valueOf(3)) {
            b2.setText("3");
        }
        else if (LocalGame.tileList[1]==String.valueOf(4)) {
            b2.setText("4");
        }
        else if (LocalGame.tileList[1]==String.valueOf(5)) {
            b2.setText("5");
        }
        else if (LocalGame.tileList[1]==String.valueOf(6)) {
            b2.setText("6");
        }
        else if (LocalGame.tileList[1]==String.valueOf(7)) {
            b2.setText("7");
        }
        else if (LocalGame.tileList[1]==String.valueOf(8)) {
            b2.setText("8");
        }
        else if (LocalGame.tileList[1]==String.valueOf(9)) {
            b2.setText("9");
        }
        else if (LocalGame.tileList[1]==String.valueOf(10)) {
            b2.setText("10");
        }
        else if (LocalGame.tileList[1]==String.valueOf(11)) {
            b2.setText("11");
        }
        else if (LocalGame.tileList[1]==String.valueOf(12)) {
            b2.setText("12");
        }
        else if (LocalGame.tileList[1]==String.valueOf(13)) {
            b2.setText("13");
        }
        else if (LocalGame.tileList[1]==String.valueOf(14)) {
            b2.setText("14");
        }
        else if (LocalGame.tileList[1]==String.valueOf(15)) {
            b2.setText("15");
        }

        if (LocalGame.tileList[2]==String.valueOf(0)) {
            b3.setText("");
        }
        else if (LocalGame.tileList[2]==String.valueOf(1)) {
            b3.setText("1");
        }
        else if (LocalGame.tileList[2]==String.valueOf(2)) {
            b3.setText("2");
        }
        else if (LocalGame.tileList[2]==String.valueOf(3)) {
            b3.setText("3");
        }
        else if (LocalGame.tileList[2]==String.valueOf(4)) {
            b3.setText("4");
        }
        else if (LocalGame.tileList[2]==String.valueOf(5)) {
            b3.setText("5");
        }
        else if (LocalGame.tileList[2]==String.valueOf(6)) {
            b3.setText("6");
        }
        else if (LocalGame.tileList[2]==String.valueOf(7)) {
            b3.setText("7");
        }
        else if (LocalGame.tileList[2]==String.valueOf(8)) {
            b3.setText("8");
        }
        else if (LocalGame.tileList[2]==String.valueOf(9)) {
            b3.setText("9");
        }
        else if (LocalGame.tileList[2]==String.valueOf(10)) {
            b3.setText("10");
        }
        else if (LocalGame.tileList[2]==String.valueOf(11)) {
            b3.setText("11");
        }
        else if (LocalGame.tileList[2]==String.valueOf(12)) {
            b3.setText("12");
        }
        else if (LocalGame.tileList[2]==String.valueOf(13)) {
            b3.setText("13");
        }
        else if (LocalGame.tileList[2]==String.valueOf(14)) {
            b3.setText("14");
        }
        else if (LocalGame.tileList[2]==String.valueOf(15)) {
            b3.setText("15");
        }

        if (LocalGame.tileList[3]==String.valueOf(0)) {
            b4.setText("");
        }
        else if (LocalGame.tileList[3]==String.valueOf(1)) {
            b4.setText("1");
        }
        else if (LocalGame.tileList[3]==String.valueOf(2)) {
            b4.setText("2");
        }
        else if (LocalGame.tileList[3]==String.valueOf(3)) {
            b4.setText("3");
        }
        else if (LocalGame.tileList[3]==String.valueOf(4)) {
            b4.setText("4");
        }
        else if (LocalGame.tileList[3]==String.valueOf(5)) {
            b4.setText("5");
        }
        else if (LocalGame.tileList[3]==String.valueOf(6)) {
            b4.setText("6");
        }
        else if (LocalGame.tileList[3]==String.valueOf(7)) {
            b4.setText("7");
        }
        else if (LocalGame.tileList[3]==String.valueOf(8)) {
            b4.setText("8");
        }
        else if (LocalGame.tileList[3]==String.valueOf(9)) {
            b4.setText("9");
        }
        else if (LocalGame.tileList[3]==String.valueOf(10)) {
            b4.setText("10");
        }
        else if (LocalGame.tileList[3]==String.valueOf(11)) {
            b4.setText("11");
        }
        else if (LocalGame.tileList[3]==String.valueOf(12)) {
            b4.setText("12");
        }
        else if (LocalGame.tileList[3]==String.valueOf(13)) {
            b4.setText("13");
        }
        else if (LocalGame.tileList[3]==String.valueOf(14)) {
            b4.setText("14");
        }
        else if (LocalGame.tileList[3]==String.valueOf(15)) {
            b4.setText("15");
        }

        if (LocalGame.tileList[4]==String.valueOf(0)) {
            b5.setText("");
        }
        else if (LocalGame.tileList[4]==String.valueOf(1)) {
            b5.setText("1");
        }
        else if (LocalGame.tileList[4]==String.valueOf(2)) {
            b5.setText("2");
        }
        else if (LocalGame.tileList[4]==String.valueOf(3)) {
            b5.setText("3");
        }
        else if (LocalGame.tileList[4]==String.valueOf(4)) {
            b5.setText("4");
        }
        else if (LocalGame.tileList[4]==String.valueOf(5)) {
            b5.setText("5");
        }
        else if (LocalGame.tileList[4]==String.valueOf(6)) {
            b5.setText("6");
        }
        else if (LocalGame.tileList[4]==String.valueOf(7)) {
            b5.setText("7");
        }
        else if (LocalGame.tileList[4]==String.valueOf(8)) {
            b5.setText("8");
        }
        else if (LocalGame.tileList[4]==String.valueOf(9)) {
            b5.setText("9");
        }
        else if (LocalGame.tileList[4]==String.valueOf(10)) {
            b5.setText("10");
        }
        else if (LocalGame.tileList[4]==String.valueOf(11)) {
            b5.setText("11");
        }
        else if (LocalGame.tileList[4]==String.valueOf(12)) {
            b5.setText("12");
        }
        else if (LocalGame.tileList[4]==String.valueOf(13)) {
            b5.setText("13");
        }
        else if (LocalGame.tileList[4]==String.valueOf(14)) {
            b5.setText("14");
        }
        else if (LocalGame.tileList[4]==String.valueOf(15)) {
            b5.setText("15");
        }

        if (LocalGame.tileList[5]==String.valueOf(0)) {
            b6.setText("");
        }
        else if (LocalGame.tileList[5]==String.valueOf(1)) {
            b6.setText("1");
        }
        else if (LocalGame.tileList[5]==String.valueOf(2)) {
            b6.setText("2");
        }
        else if (LocalGame.tileList[5]==String.valueOf(3)) {
            b6.setText("3");
        }
        else if (LocalGame.tileList[5]==String.valueOf(4)) {
            b6.setText("4");
        }
        else if (LocalGame.tileList[5]==String.valueOf(5)) {
            b6.setText("5");
        }
        else if (LocalGame.tileList[5]==String.valueOf(6)) {
            b6.setText("6");
        }
        else if (LocalGame.tileList[5]==String.valueOf(7)) {
            b6.setText("7");
        }
        else if (LocalGame.tileList[5]==String.valueOf(8)) {
            b6.setText("8");
        }
        else if (LocalGame.tileList[5]==String.valueOf(9)) {
            b6.setText("9");
        }
        else if (LocalGame.tileList[5]==String.valueOf(10)) {
            b6.setText("10");
        }
        else if (LocalGame.tileList[5]==String.valueOf(11)) {
            b6.setText("11");
        }
        else if (LocalGame.tileList[5]==String.valueOf(12)) {
            b6.setText("12");
        }
        else if (LocalGame.tileList[5]==String.valueOf(13)) {
            b6.setText("13");
        }
        else if (LocalGame.tileList[5]==String.valueOf(14)) {
            b6.setText("14");
        }
        else if (LocalGame.tileList[5]==String.valueOf(15)) {
            b6.setText("15");
        }

        if (LocalGame.tileList[6]==String.valueOf(0)) {
            b7.setText("");
        }
        else if (LocalGame.tileList[6]==String.valueOf(1)) {
            b7.setText("1");
        }
        else if (LocalGame.tileList[6]==String.valueOf(2)) {
            b7.setText("2");
        }
        else if (LocalGame.tileList[6]==String.valueOf(3)) {
            b7.setText("3");
        }
        else if (LocalGame.tileList[6]==String.valueOf(4)) {
            b7.setText("4");
        }
        else if (LocalGame.tileList[6]==String.valueOf(5)) {
            b7.setText("5");
        }
        else if (LocalGame.tileList[6]==String.valueOf(6)) {
            b7.setText("6");
        }
        else if (LocalGame.tileList[6]==String.valueOf(7)) {
            b7.setText("7");
        }
        else if (LocalGame.tileList[6]==String.valueOf(8)) {
            b7.setText("8");
        }
        else if (LocalGame.tileList[6]==String.valueOf(9)) {
            b7.setText("9");
        }
        else if (LocalGame.tileList[6]==String.valueOf(10)) {
            b7.setText("10");
        }
        else if (LocalGame.tileList[6]==String.valueOf(11)) {
            b7.setText("11");
        }
        else if (LocalGame.tileList[6]==String.valueOf(12)) {
            b7.setText("12");
        }
        else if (LocalGame.tileList[6]==String.valueOf(13)) {
            b7.setText("13");
        }
        else if (LocalGame.tileList[6]==String.valueOf(14)) {
            b7.setText("14");
        }
        else if (LocalGame.tileList[6]==String.valueOf(15)) {
            b7.setText("15");
        }


        if (LocalGame.tileList[7]==String.valueOf(0)) {
            b8.setText("");
        }
        else if (LocalGame.tileList[7]==String.valueOf(1)) {
            b8.setText("1");
        }
        else if (LocalGame.tileList[7]==String.valueOf(2)) {
            b8.setText("2");
        }
        else if (LocalGame.tileList[7]==String.valueOf(3)) {
            b8.setText("3");
        }
        else if (LocalGame.tileList[7]==String.valueOf(4)) {
            b8.setText("4");
        }
        else if (LocalGame.tileList[7]==String.valueOf(5)) {
            b8.setText("5");
        }
        else if (LocalGame.tileList[7]==String.valueOf(6)) {
            b8.setText("6");
        }
        else if (LocalGame.tileList[7]==String.valueOf(7)) {
            b8.setText("7");
        }
        else if (LocalGame.tileList[7]==String.valueOf(8)) {
            b8.setText("8");
        }
        else if (LocalGame.tileList[7]==String.valueOf(9)) {
            b8.setText("9");
        }
        else if (LocalGame.tileList[7]==String.valueOf(10)) {
            b8.setText("10");
        }
        else if (LocalGame.tileList[7]==String.valueOf(11)) {
            b8.setText("11");
        }
        else if (LocalGame.tileList[7]==String.valueOf(12)) {
            b8.setText("12");
        }
        else if (LocalGame.tileList[7]==String.valueOf(13)) {
            b8.setText("13");
        }
        else if (LocalGame.tileList[7]==String.valueOf(14)) {
            b8.setText("14");
        }
        else if (LocalGame.tileList[7]==String.valueOf(15)) {
            b8.setText("15");
        }


        if (LocalGame.tileList[8]==String.valueOf(0)) {
            b9.setText("");
        }
        else if (LocalGame.tileList[8]==String.valueOf(1)) {
            b9.setText("1");
        }
        else if (LocalGame.tileList[8]==String.valueOf(2)) {
            b9.setText("2");
        }
        else if (LocalGame.tileList[8]==String.valueOf(3)) {
            b9.setText("3");
        }
        else if (LocalGame.tileList[8]==String.valueOf(4)) {
            b9.setText("4");
        }
        else if (LocalGame.tileList[8]==String.valueOf(5)) {
            b9.setText("5");
        }
        else if (LocalGame.tileList[8]==String.valueOf(6)) {
            b9.setText("6");
        }
        else if (LocalGame.tileList[8]==String.valueOf(7)) {
            b9.setText("7");
        }
        else if (LocalGame.tileList[8]==String.valueOf(8)) {
            b9.setText("8");
        }
        else if (LocalGame.tileList[8]==String.valueOf(9)) {
            b9.setText("9");
        }
        else if (LocalGame.tileList[8]==String.valueOf(10)) {
            b9.setText("10");
        }
        else if (LocalGame.tileList[8]==String.valueOf(11)) {
            b9.setText("11");
        }
        else if (LocalGame.tileList[8]==String.valueOf(12)) {
            b9.setText("12");
        }
        else if (LocalGame.tileList[8]==String.valueOf(13)) {
            b9.setText("13");
        }
        else if (LocalGame.tileList[8]==String.valueOf(14)) {
            b9.setText("14");
        }
        else if (LocalGame.tileList[8]==String.valueOf(15)) {
            b9.setText("15");
        }


        if (LocalGame.tileList[9]==String.valueOf(0)) {
            b10.setText("");
        }
        else if (LocalGame.tileList[9]==String.valueOf(1)) {
            b10.setText("1");
        }
        else if (LocalGame.tileList[9]==String.valueOf(2)) {
            b10.setText("2");
        }
        else if (LocalGame.tileList[9]==String.valueOf(3)) {
            b10.setText("3");
        }
        else if (LocalGame.tileList[9]==String.valueOf(4)) {
            b10.setText("4");
        }
        else if (LocalGame.tileList[9]==String.valueOf(5)) {
            b10.setText("5");
        }
        else if (LocalGame.tileList[9]==String.valueOf(6)) {
            b10.setText("6");
        }
        else if (LocalGame.tileList[9]==String.valueOf(7)) {
            b10.setText("7");
        }
        else if (LocalGame.tileList[9]==String.valueOf(8)) {
            b10.setText("8");
        }
        else if (LocalGame.tileList[9]==String.valueOf(9)) {
            b10.setText("9");
        }
        else if (LocalGame.tileList[9]==String.valueOf(10)) {
            b10.setText("10");
        }
        else if (LocalGame.tileList[9]==String.valueOf(11)) {
            b10.setText("11");
        }
        else if (LocalGame.tileList[9]==String.valueOf(12)) {
            b10.setText("12");
        }
        else if (LocalGame.tileList[9]==String.valueOf(13)) {
            b10.setText("13");
        }
        else if (LocalGame.tileList[9]==String.valueOf(14)) {
            b10.setText("14");
        }
        else if (LocalGame.tileList[9]==String.valueOf(15)) {
            b10.setText("15");
        }

        if (LocalGame.tileList[10]==String.valueOf(0)) {
            b11.setText("");
        }
        else if (LocalGame.tileList[10]==String.valueOf(1)) {
            b11.setText("1");
        }
        else if (LocalGame.tileList[10]==String.valueOf(2)) {
            b11.setText("2");
        }
        else if (LocalGame.tileList[10]==String.valueOf(3)) {
            b11.setText("3");
        }
        else if (LocalGame.tileList[10]==String.valueOf(4)) {
            b11.setText("4");
        }
        else if (LocalGame.tileList[10]==String.valueOf(5)) {
            b11.setText("5");
        }
        else if (LocalGame.tileList[10]==String.valueOf(6)) {
            b11.setText("6");
        }
        else if (LocalGame.tileList[10]==String.valueOf(7)) {
            b11.setText("7");
        }
        else if (LocalGame.tileList[10]==String.valueOf(8)) {
            b11.setText("8");
        }
        else if (LocalGame.tileList[10]==String.valueOf(9)) {
            b11.setText("9");
        }
        else if (LocalGame.tileList[10]==String.valueOf(10)) {
            b11.setText("10");
        }
        else if (LocalGame.tileList[10]==String.valueOf(11)) {
            b11.setText("11");
        }
        else if (LocalGame.tileList[10]==String.valueOf(12)) {
            b11.setText("12");
        }
        else if (LocalGame.tileList[10]==String.valueOf(13)) {
            b11.setText("13");
        }
        else if (LocalGame.tileList[10]==String.valueOf(14)) {
            b11.setText("14");
        }
        else if (LocalGame.tileList[10]==String.valueOf(15)) {
            b11.setText("15");
        }

        if (LocalGame.tileList[11]==String.valueOf(0)) {
            b12.setText("");
        }
        else if (LocalGame.tileList[11]==String.valueOf(1)) {
            b12.setText("1");
        }
        else if (LocalGame.tileList[11]==String.valueOf(2)) {
            b12.setText("2");
        }
        else if (LocalGame.tileList[11]==String.valueOf(3)) {
            b12.setText("3");
        }
        else if (LocalGame.tileList[11]==String.valueOf(4)) {
            b12.setText("4");
        }
        else if (LocalGame.tileList[11]==String.valueOf(5)) {
            b12.setText("5");
        }
        else if (LocalGame.tileList[11]==String.valueOf(6)) {
            b12.setText("6");
        }
        else if (LocalGame.tileList[11]==String.valueOf(7)) {
            b12.setText("7");
        }
        else if (LocalGame.tileList[11]==String.valueOf(8)) {
            b12.setText("8");
        }
        else if (LocalGame.tileList[11]==String.valueOf(9)) {
            b12.setText("9");
        }
        else if (LocalGame.tileList[11]==String.valueOf(10)) {
            b12.setText("10");
        }
        else if (LocalGame.tileList[11]==String.valueOf(11)) {
            b12.setText("11");
        }
        else if (LocalGame.tileList[11]==String.valueOf(12)) {
            b12.setText("12");
        }
        else if (LocalGame.tileList[11]==String.valueOf(13)) {
            b12.setText("13");
        }
        else if (LocalGame.tileList[11]==String.valueOf(14)) {
            b12.setText("14");
        }
        else if (LocalGame.tileList[11]==String.valueOf(15)) {
            b12.setText("15");
        }

        if (LocalGame.tileList[12]==String.valueOf(0)) {
            b13.setText("");
        }
        else if (LocalGame.tileList[12]==String.valueOf(1)) {
            b13.setText("1");
        }
        else if (LocalGame.tileList[12]==String.valueOf(2)) {
            b13.setText("2");
        }
        else if (LocalGame.tileList[12]==String.valueOf(3)) {
            b13.setText("3");
        }
        else if (LocalGame.tileList[12]==String.valueOf(4)) {
            b13.setText("4");
        }
        else if (LocalGame.tileList[12]==String.valueOf(5)) {
            b13.setText("5");
        }
        else if (LocalGame.tileList[12]==String.valueOf(6)) {
            b13.setText("6");
        }
        else if (LocalGame.tileList[12]==String.valueOf(7)) {
            b13.setText("7");
        }
        else if (LocalGame.tileList[12]==String.valueOf(8)) {
            b13.setText("8");
        }
        else if (LocalGame.tileList[12]==String.valueOf(9)) {
            b13.setText("9");
        }
        else if (LocalGame.tileList[12]==String.valueOf(10)) {
            b13.setText("10");
        }
        else if (LocalGame.tileList[12]==String.valueOf(11)) {
            b13.setText("11");
        }
        else if (LocalGame.tileList[12]==String.valueOf(12)) {
            b13.setText("12");
        }
        else if (LocalGame.tileList[12]==String.valueOf(13)) {
            b13.setText("13");
        }
        else if (LocalGame.tileList[12]==String.valueOf(14)) {
            b13.setText("14");
        }
        else if (LocalGame.tileList[12]==String.valueOf(15)) {
            b13.setText("15");
        }

        if (LocalGame.tileList[13]==String.valueOf(0)) {
            b14.setText("");
        }
        else if (LocalGame.tileList[13]==String.valueOf(1)) {
            b14.setText("1");
        }
        else if (LocalGame.tileList[13]==String.valueOf(2)) {
            b14.setText("2");
        }
        else if (LocalGame.tileList[13]==String.valueOf(3)) {
            b14.setText("3");
        }
        else if (LocalGame.tileList[13]==String.valueOf(4)) {
            b14.setText("4");
        }
        else if (LocalGame.tileList[13]==String.valueOf(5)) {
            b14.setText("5");
        }
        else if (LocalGame.tileList[13]==String.valueOf(6)) {
            b14.setText("6");
        }
        else if (LocalGame.tileList[13]==String.valueOf(7)) {
            b14.setText("7");
        }
        else if (LocalGame.tileList[13]==String.valueOf(8)) {
            b14.setText("8");
        }
        else if (LocalGame.tileList[13]==String.valueOf(9)) {
            b14.setText("9");
        }
        else if (LocalGame.tileList[13]==String.valueOf(10)) {
            b14.setText("10");
        }
        else if (LocalGame.tileList[13]==String.valueOf(11)) {
            b14.setText("11");
        }
        else if (LocalGame.tileList[13]==String.valueOf(12)) {
            b14.setText("12");
        }
        else if (LocalGame.tileList[13]==String.valueOf(13)) {
            b14.setText("13");
        }
        else if (LocalGame.tileList[13]==String.valueOf(14)) {
            b14.setText("14");
        }
        else if (LocalGame.tileList[13]==String.valueOf(15)) {
            b14.setText("15");
        }


        if (LocalGame.tileList[14]==String.valueOf(0)) {
            b15.setText("");
        }
        else if (LocalGame.tileList[14]==String.valueOf(1)) {
            b15.setText("1");
        }
        else if (LocalGame.tileList[14]==String.valueOf(2)) {
            b15.setText("2");
        }
        else if (LocalGame.tileList[14]==String.valueOf(3)) {
            b15.setText("3");
        }
        else if (LocalGame.tileList[14]==String.valueOf(4)) {
            b15.setText("4");
        }
        else if (LocalGame.tileList[14]==String.valueOf(5)) {
            b15.setText("5");
        }
        else if (LocalGame.tileList[14]==String.valueOf(6)) {
            b15.setText("6");
        }
        else if (LocalGame.tileList[14]==String.valueOf(7)) {
            b15.setText("7");
        }
        else if (LocalGame.tileList[14]==String.valueOf(8)) {
            b15.setText("8");
        }
        else if (LocalGame.tileList[14]==String.valueOf(9)) {
            b15.setText("9");
        }
        else if (LocalGame.tileList[14]==String.valueOf(10)) {
            b15.setText("10");
        }
        else if (LocalGame.tileList[14]==String.valueOf(11)) {
            b15.setText("11");
        }
        else if (LocalGame.tileList[14]==String.valueOf(12)) {
            b15.setText("12");
        }
        else if (LocalGame.tileList[14]==String.valueOf(13)) {
            b15.setText("13");
        }
        else if (LocalGame.tileList[14]==String.valueOf(14)) {
            b15.setText("14");
        }
        else if (LocalGame.tileList[14]==String.valueOf(15)) {
            b15.setText("15");
        }


        if (LocalGame.tileList[15]==String.valueOf(0)) {
            b16.setText("");
        }
        else if (LocalGame.tileList[15]==String.valueOf(1)) {
            b16.setText("1");
        }
        else if (LocalGame.tileList[15]==String.valueOf(2)) {
            b16.setText("2");
        }
        else if (LocalGame.tileList[15]==String.valueOf(3)) {
            b16.setText("3");
        }
        else if (LocalGame.tileList[15]==String.valueOf(4)) {
            b16.setText("4");
        }
        else if (LocalGame.tileList[15]==String.valueOf(5)) {
            b16.setText("5");
        }
        else if (LocalGame.tileList[15]==String.valueOf(6)) {
            b16.setText("6");
        }
        else if (LocalGame.tileList[15]==String.valueOf(7)) {
            b16.setText("7");
        }
        else if (LocalGame.tileList[15]==String.valueOf(8)) {
            b16.setText("8");
        }
        else if (LocalGame.tileList[15]==String.valueOf(9)) {
            b16.setText("9");
        }
        else if (LocalGame.tileList[15]==String.valueOf(10)) {
            b16.setText("10");
        }
        else if (LocalGame.tileList[15]==String.valueOf(11)) {
            b16.setText("11");
        }
        else if (LocalGame.tileList[15]==String.valueOf(12)) {
            b16.setText("12");
        }
        else if (LocalGame.tileList[15]==String.valueOf(13)) {
            b16.setText("13");
        }
        else if (LocalGame.tileList[15]==String.valueOf(14)) {
            b16.setText("14");
        }
        else if (LocalGame.tileList[15]==String.valueOf(15)) {
            b16.setText("15");
        }

        instance = this;
    }

    public static MainActivity getInstance() { return instance; }
}
