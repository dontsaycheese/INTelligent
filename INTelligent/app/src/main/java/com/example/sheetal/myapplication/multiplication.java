package com.example.sheetal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class multiplication extends AppCompatActivity {

    public static int marks1 ;
    TextView ques1;     //TextView correct;
    EditText ans1;
    Button n1;
    Random r1 = new Random();
    int d = (r1.nextInt(25) - 15);
    int e = (r1.nextInt(25) - 15);
    int f = (r1.nextInt(25) - 15);
    double sum1 = 0.0;

    Intent intent2 = getIntent();
    static int i1 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplication);

        ques1 = (TextView) findViewById(R.id.tvm);
        //correct=(TextView)findViewById(R.id.tv2);
        ans1 = (EditText) findViewById(R.id.answer1);
        n1 = (Button) findViewById(R.id.next1);

        ques1.setText("           "+d + " * " + e);


        //if(i<5)
        //{
        //i=i+1;
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if ((ans1.getText().toString().length() <= 0))
                {

                    Toast.makeText(getApplicationContext(), "Field is empty!",
                            Toast.LENGTH_LONG).show();
                    ans1.getText().clear();
                }

                if (i1 <= 4)
                {

                    i1++;
                    sum1 = Double.parseDouble(ans1.getText().toString());
                    if ((sum1 == (d * e)))
                    {
                        marks1 = marks1 + 2;
                        Toast.makeText(getApplicationContext(), "Great!",
                                Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        marks1=marks1+0;
                        Toast.makeText(getApplicationContext(), "Sad!",
                                Toast.LENGTH_LONG).show();

                    }
                    Intent j1 = new Intent(multiplication.this, multiplication.class);
                    j1.putExtra("key4", String.valueOf(marks1));
                    startActivity(j1);
                }


                else
                {
                    i1=0;
                    Intent k1 = new Intent(multiplication.this, Main3Activity.class);
                    k1.putExtra("key5", String.valueOf(marks1));
                    startActivity(k1);
                    marks1=0;

                }



            }
        });


    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(multiplication.this, Main2Activity.class));
        finish();




    }
}
