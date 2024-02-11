package com.example.duaduasi.quizwinnie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Activity_profil extends AppCompatActivity {
    TextView textview3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
            textview3 = (TextView) findViewById(R.id.textView3);
            textview3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //catat di log
                    Log.d("TODO", "Masuk ke todo");
                    //pindah dari quizactivity ke todoactivity
                    Intent intent = new Intent(Activity_profil.this, MainActivity.class);
                    startActivity(intent);
                }
            });
        }
    }