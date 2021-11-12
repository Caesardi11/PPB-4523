package com.example.menu_makanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String s1[], s2[], s3[], s4[];
    int images[] = {R.drawable.papeda, R.drawable.aunu_senebre, R.drawable.ikan_bakar,
                    R.drawable.abon_gulung, R.drawable.kue_lontar, R.drawable.keripik_keladi,
                    R.drawable.es_kelapa};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        s1 = getResources().getStringArray(R.array.menu_makanan_khas);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.bersambung);
        s4 = getResources().getStringArray(R.array.pesanan);

        MyAdapter myAdapter = new MyAdapter(this, s1, s2, s3, s4, images);
        recyclerView.setAdapter(myAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}