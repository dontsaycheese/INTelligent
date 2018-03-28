package com.example.sheetal.myapplication;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button s1;
        Button s2;
        Button s3;
        s1=(Button)findViewById(R.id.StartAdd);
        s2=(Button)findViewById(R.id.StartMul);
        s3=(Button)findViewById(R.id.past);

        Intent ag=getIntent();

        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent1);

            }
        });

        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Main2Activity.this,multiplication.class);
                startActivity(intent2);


            }
        });

        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3=new Intent(Main2Activity.this,prevresults.class);
                startActivity(intent3);
            }
        });

    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();

        finish();

    }
}
