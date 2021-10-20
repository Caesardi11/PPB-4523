package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    public String bhs_program[] ={"Prolog", "C+", "Pascal", "Cobol", "Perl", "Algol L", "Java", "PHP", "Phyton"};
    Spinner gabungan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView=(ListView) findViewById(R.id.listdata);
        gabungan=(Spinner) findViewById(R.id.datagabungan);

        ArrayAdapter adapter=new ArrayAdapter(MainActivity.this, R.layout.support_simple_spinner_dropdown_item, bhs_program);
        listView.setAdapter(adapter);
        gabungan.setAdapter(adapter);

    }
}