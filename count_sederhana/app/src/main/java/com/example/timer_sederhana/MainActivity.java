package com.example.timer_sederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView angkakaunter;
    int angka=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        angkakaunter=findViewById(R.id.kaunter);
    }

    public void TOASTklik(View view) {
        Toast.makeText(this, "INI ADALAH TOAST", Toast.LENGTH_SHORT).show();
    }

    public void tmblkonter(View view) {
        angka=angka+1;
        angkakaunter.setText(Integer.toString(angka));
    }
}