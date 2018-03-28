package com.example.sheetal.myapplication;

import android.content.Intent;
import android.os.Process;
import android.support.v4.content.SharedPreferencesCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity
{
    public static int marks ;
    TextView ques;     //TextView correct;
    EditText ans;
    Button n;
    Random r = new Random();
    int a = (r.nextInt(40) - 30);
    int b = (r.nextInt(40) - 30);
    int c = (r.nextInt(40) - 30);
    double sum = 0.0;


    Intent intent1 = getIntent();
    static int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //int answer; int prev[]=new int[10];
        ques = (TextView) findViewById(R.id.tv1);
        //correct=(TextView)findViewById(R.id.tv2);
        ans = (EditText) findViewById(R.id.answer);
        n = (Button) findViewById(R.id.next);

        ques.setText("  "+a + " + " + b);


        //if(i<5)
        //{
        //i=i+1;
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((ans.getText().toString().length() <= 0))
                {

                    Toast.makeText(getApplicationContext(), "Field is empty!",
                            Toast.LENGTH_LONG).show();
                    ans.getText().clear();
                }

                if (i <= 4)
                {

                    i++;
                    sum = Double.parseDouble(ans.getText().toString());
                    if ((sum == (a + b)))
                    {
                        marks = marks + 2;
                        Toast.makeText(getApplicationContext(), "Great!",
                                Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        marks=marks+0;
                        Toast.makeText(getApplicationContext(), "Sad!",
                                Toast.LENGTH_LONG).show();

                    }
                    Intent j = new Intent(MainActivity.this, MainActivity.class);
                    j.putExtra("key2", String.valueOf(marks));
                    startActivity(j);
                }


                else
                {
                    i=0;
                    Intent k = new Intent(MainActivity.this, Main3Activity.class);
                    k.putExtra("key3", String.valueOf(marks));
                    startActivity(k);
                    marks=0;

                }



            }
        });


    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(MainActivity.this, Main2Activity.class));
        finish();

    }
}
        //else
        //{

           // n.setOnClickListener(new View.OnClickListener() {
                 // @Override
                  //public void onClick(View v) {


                //}
            //});
        //}

    //}
//}

