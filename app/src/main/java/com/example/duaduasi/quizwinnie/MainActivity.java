package com.example.duaduasi.quizwinnie;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.duaduasi.quizwinnie.R;

public class MainActivity extends AppCompatActivity {

    TextView textview7, textview11;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textview7 = (TextView) findViewById(R.id.textView7);
        textview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //catat di log
                Log.d("PROFIL", "Masuk ke profil");
                //pindah dari quizactivity ke pertemuan3activity
                Intent intent = new Intent(MainActivity.this, Activity_profil.class);
                startActivity(intent);
            }
        });

        textview11 = (TextView) findViewById(R.id.textView11);
        textview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //catat di log
                Log.d("TODO", "Masuk ke todo");
                //pindah dari quizactivity ke todoactivity
                Intent intent = new Intent(MainActivity.this, activity_todolist.class);
                startActivity(intent);
            }
        });
    }
}