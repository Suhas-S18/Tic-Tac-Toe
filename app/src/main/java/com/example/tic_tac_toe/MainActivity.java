package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9,btRestart;
    TextView textView1;
    int flag = 0, count = 0, res=0;
    String s1, s2, s3, s4, s5, s6, s7, s8, s9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=(Button) findViewById(R.id.b1);
        bt2=(Button) findViewById(R.id.b2);
        bt3=(Button) findViewById(R.id.b3);
        bt4=(Button) findViewById(R.id.b4);
        bt5=(Button) findViewById(R.id.b5);
        bt6=(Button) findViewById(R.id.b6);
        bt7=(Button) findViewById(R.id.b7);
        bt8=(Button) findViewById(R.id.b8);
        bt9=(Button) findViewById(R.id.b9);
        btRestart=(Button) findViewById(R.id.btRestart);
        textView1=(TextView) findViewById(R.id.tv);




    }
    public void check(View v){
        Button currentButton = (Button) v;
        if(currentButton.getText().toString().equals("Restart"))
        {
            bt1.setText("");
            bt2.setText("");
            bt3.setText("");
            bt4.setText("");
            bt5.setText("");
            bt6.setText("");
            bt7.setText("");
            bt8.setText("");
            bt9.setText("");
            flag=0;
            count=0;
            res=0;
            textView1.setText("");
        }
        else if(res==1)
        {
            Toast.makeText(this,"Game Over!!  Restart the game",Toast.LENGTH_SHORT).show();
        }
        else if(currentButton.getText().toString().equals("")) {
            count++;

            if (flag == 0) {
                currentButton.setText("X");
                flag = 1;
            } else {
                currentButton.setText("O");
                flag = 0;
            }
            if (count >= 5) {
                s1 = bt1.getText().toString();
                s2 = bt2.getText().toString();
                s3 = bt3.getText().toString();
                s4 = bt4.getText().toString();
                s5 = bt5.getText().toString();
                s6 = bt6.getText().toString();
                s7 = bt7.getText().toString();
                s8 = bt8.getText().toString();
                s9 = bt9.getText().toString();

                if (s1.equals(s2) && s2.equals(s3) && !s1.equals("")) {
                    textView1.setText(s1 + " is the WINNER");
                    res=1;
                } else if (s4.equals(s5) && s5.equals(s6) && !s4.equals("")) {
                    textView1.setText(s4 + " is the WINNER");
                    res=1;
                } else if (s7.equals(s8) && s8.equals(s9) && !s7.equals("")) {
                    textView1.setText(s7 + " is the WINNER");
                    res=1;
                } else if (s1.equals(s4) && s4.equals(s7) && !s1.equals("")) {
                    textView1.setText(s1 + " is the WINNER");
                    res=1;
                } else if (s2.equals(s5) && s5.equals(s8) && !s2.equals("")) {
                    textView1.setText(s2 + " is the WINNER");
                    res=1;
                } else if (s3.equals(s6) && s6.equals(s9) && !s3.equals("")) {
                    textView1.setText(s3 + " is the WINNER");
                    res=1;
                } else if (s1.equals(s5) && s5.equals(s9) && !s1.equals("")) {
                    textView1.setText(s1 + " is the WINNER");
                    res=1;
                } else if (s3.equals(s5) && s5.equals(s7) && !s3.equals("")) {
                    textView1.setText(s3 + " is the WINNER");
                    res=1;
                }
                else if(count>=9)
                {
                    textView1.setText("It's DRAW");
                    res=1;
                }



            }
        }

        else
        {
            Toast.makeText(this,"Cannot over write the value",Toast.LENGTH_SHORT).show();
        }
    }
}