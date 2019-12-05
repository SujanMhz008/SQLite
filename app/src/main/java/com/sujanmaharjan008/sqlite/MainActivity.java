package com.sujanmaharjan008.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtWord, edtMeaning;
    Button btnEnter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtWord = findViewById(R.id.edtWord);
        edtMeaning = findViewById(R.id.edtMeaning);
        btnEnter = findViewById(R.id.btnEnter);
    }
}
