package com.example.task6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar());
        getSupportActionBar().hide();

        button1 =(Button) findViewById(R.id.button1);
        button2 =(Button) findViewById(R.id.button2);
        button3 =(Button) findViewById(R.id.button3);
        button4 =(Button) findViewById(R.id.button4);
        button5 =(Button) findViewById(R.id.button5);
        button6 =(Button) findViewById(R.id.button6);
        button7 =(Button) findViewById(R.id.button7);
        button8 =(Button) findViewById(R.id.button8);
        button9 =(Button) findViewById(R.id.button9);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = button1.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("message", text);
                openActivity2(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = button2.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("message", text);
                openActivity2(intent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = button3.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("message", text);
                openActivity2(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = button4.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("message", text);
                openActivity2(intent);
            }
        });
        button5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = button5.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("message", text);
                openActivity2(intent);
            }
        });
        button6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = button6.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("message", text);
                openActivity2(intent);
            }
        });
        button7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = button7.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("message", text);
                openActivity2(intent);
            }
        });
        button8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = button8.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("message", text);
                openActivity2(intent);
            }
        });
        button9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = button9.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("message", text);
                openActivity2(intent);
            }
        });
    }
    public void openActivity2(Intent intent){
        startActivity(intent);
    }
}