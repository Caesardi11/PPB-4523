package com.example.menu_makanan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView mainImageView;
    TextView judul, description, pesanan;

    String data1, data2, data4;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mainImageView = findViewById(R.id.mainImageView);
        judul = findViewById(R.id.judul);
        description = findViewById(R.id.description);
        pesanan = findViewById(R.id.pesanan);

        getData();
        setData();
    }

    private void getData() {
        if(getIntent().hasExtra("myImage") && getIntent().hasExtra("data1")
        && getIntent().hasExtra("data2")) {

            data1 = getIntent().getStringExtra("data1");
            data2 = getIntent().getStringExtra("data2");
            data4 = getIntent().getStringExtra("data4");
            myImage = getIntent().getIntExtra("myImage", 1);
        }
        
        else {
            Toast.makeText(this, "No data.", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData() {
        judul.setText(data1);
        description.setText(data2);
        pesanan.setText(data4);
        mainImageView.setImageResource(myImage);
    }

}