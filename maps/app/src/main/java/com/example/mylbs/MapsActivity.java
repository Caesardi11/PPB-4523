package com.example.mylbs;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.example.mylbs.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements AdapterView.OnItemSelectedListener,OnMapReadyCallback {

    private GoogleMap mMap;
    public static final String nama_pulau[] = {"Pilih Pulau", "Sumatra", "Jawa", "Kalimantan", "Sulawesi", "Bali", "NTB", "NTT", "Maluku", "Papua"};
    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        spinner = findViewById(R.id.random);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,nama_pulau);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
        double inti,longi;

        switch (position)
        {
            case 0:
                mMap.clear();
                break;

            case 1:
                // SUMATRA
                mMap.clear();
                LatLng sumatra = new LatLng(-0.1758601, 98.6947942);
                mMap.addMarker(new MarkerOptions().position(sumatra).title("Pulau Sumatra"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sumatra));
                break;

            case 2:
                //JAWA
                mMap.clear();
                LatLng jawa = new LatLng(-7.4097903, 109.1680642);
                mMap.addMarker(new MarkerOptions().position(jawa).title("Pulau Jawa"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(jawa));
                break;

            case 3:
                //KALIMANTAN
                mMap.clear();
                LatLng kalimantan = new LatLng(1.4139791, 112.0387682);
                mMap.addMarker(new MarkerOptions().position(kalimantan).title("Pulau Kalimantan"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(kalimantan));
                break;

            case 4:
                //SULAWESI
                mMap.clear();
                LatLng sulawesi = new LatLng(-1.9739667, 119.7563454);
                mMap.addMarker(new MarkerOptions().position(sulawesi).title("Pulau Sulawesi"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(sulawesi));
                break;

            case 5:
                //BALI
                mMap.clear();
                LatLng bali = new LatLng(-8.477105, 115.0241509);
                mMap.addMarker(new MarkerOptions().position(bali).title("Pulau Bali"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(bali));
                break;

            case 6:
                //NTB
                mMap.clear();
                LatLng ntb = new LatLng(-8.7175883, 117.2686319);
                mMap.addMarker(new MarkerOptions().position(ntb).title("Nusa Tenggara Barat"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(ntb));
                break;

            case 7:
                //NTT
                mMap.clear();
                LatLng ntt = new LatLng(-9.5283591, 119.8150972);
                mMap.addMarker(new MarkerOptions().position(ntt).title("Nusa Tenggara Timur"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(ntt));
                break;

            case 8:
                //MALUKU
                mMap.clear();
                LatLng maluku = new LatLng(-5.1647536, 129.0157386);
                mMap.addMarker(new MarkerOptions().position(maluku).title("Pulau Maluku"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(maluku));
                break;

            case 9:
                //PAPUA
                mMap.clear();
                LatLng papua_brt = new LatLng(-1.6833929, 132.1215795);
                mMap.addMarker(new MarkerOptions().position(papua_brt).title("Pulau Papua Barat"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(papua_brt));

                LatLng papua = new LatLng(-4.2677154, 136.8696122);
                mMap.addMarker(new MarkerOptions().position(papua).title("Pulau Papua"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(papua));
                break;

            default:
                Toast.makeText(this, "Pilihan Tidak Ada", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}