package com.example.duaduasi.quizwinnie;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;

public class activity_todolist extends AppCompatActivity {
    TextView textView3;
    Button button;
    EditText editTextText;
    RadioButton radioButton1, radioButton2;
    CheckBox checkBox1, checkBox2, checkBox3, checkBox4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todolist);

        textView3 = findViewById(R.id.textView3);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Catat di log
                Log.d("TODO", "Masuk ke todo");
                // Pindah dari activity_todolist ke MainActivity
                Intent intent = new Intent(activity_todolist.this, MainActivity.class);
                startActivity(intent);
            }
        });

        editTextText = findViewById(R.id.editTextText);
        radioButton1 = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        checkBox1 = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namaKegiatan = editTextText.getText().toString();
                String tempatKegiatan = radioButton1.isChecked() ? "Luar Ruangan" : "Dalam Ruangan";
                String jenisKegiatan = "";
                if (checkBox1.isChecked()) jenisKegiatan += checkBox1.getText().toString() + ", ";
                if (checkBox2.isChecked()) jenisKegiatan += checkBox2.getText().toString() + ", ";
                if (checkBox3.isChecked()) jenisKegiatan += checkBox3.getText().toString() + ", ";
                if (checkBox4.isChecked()) jenisKegiatan += checkBox4.getText().toString() + ", ";
                if (!jenisKegiatan.isEmpty()) {
                    jenisKegiatan = jenisKegiatan.substring(0, jenisKegiatan.length() - 2);
                }


                if (namaKegiatan.isEmpty()) {
                    Snackbar.make(v, "Nama kegiatan tidak boleh kosong", Snackbar.LENGTH_SHORT)
                            .setBackgroundTint(getResources().getColor(android.R.color.holo_red_light))
                            .show();
                } else {
                    String snackbarText = "Data telah disimpan\n" +
                            "Nama Kegiatan: " + namaKegiatan + "\n" +
                            "Tempat Kegiatan: " + tempatKegiatan + "\n" +
                            "Jenis Kegiatan: " + jenisKegiatan;

                    Snackbar.make(v, snackbarText, Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }
}
