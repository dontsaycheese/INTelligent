package com.example.sheetal.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static com.example.sheetal.myapplication.MainActivity.marks;

public class Main3Activity extends AppCompatActivity {

    TextView s;
    TextView score1, score2;
    Button restart;
    //Connection con;
    String storemarks, db, ip;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent ia=getIntent();
        Intent im=getIntent();
        //String m=im.getIntExtra("key3",String.valueOf(marks));
        String m=ia.getStringExtra("key3");
        String n=im.getStringExtra("key5");

        ip="192.168.1.103";
        db="intelligent";
        storemarks="";
        Connection classs;

        s=(TextView)findViewById(R.id.tv3);
        score1=(TextView)findViewById(R.id.tv4);
        score2=(TextView)findViewById(R.id.tv5);
        restart=(Button)findViewById(R.id.again);

        score1.setText(m);
        score2.setText(n);

        s.setText("         Your Score");



        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ag=new Intent(Main3Activity.this,Main2Activity.class);
                startActivity(ag);

            }
        });

    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(Main3Activity.this, Main2Activity.class));
        finish();

    }
}
