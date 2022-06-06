package com.example.task6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity2 extends AppCompatActivity {
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        button1 =(Button) findViewById(R.id.button1);

        Intent i = getIntent();
        String text1 = i.getStringExtra("message");
        TextView txtView1 = (TextView) findViewById(R.id.textView2);
        txtView1.setText(text1);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String text = txtView1.getText().toString();
                Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                intent.putExtra("message", text);
                openActivity3(intent);
            }
        });


    }
    public void openActivity3(Intent intent){
        startActivity(intent);
    }
}