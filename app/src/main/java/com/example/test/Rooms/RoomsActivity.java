package com.example.test.Rooms;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.example.test.Fragment.BuldFragment;
import com.example.test.Fragment.ThermometerFragment;
import com.example.test.R;

public class RoomsActivity extends AppCompatActivity {

    private LinearLayout Buld, Thermometer;
    private FragmentManager fragmentManager;
    private Fragment buldFragment = new BuldFragment();
    private Fragment thermometerFragment = new ThermometerFragment();
    private Fragment dynamic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rooms);

        fragmentManager = getSupportFragmentManager();
        dynamic = buldFragment;

        fragmentManager.beginTransaction().add(R.id.rooms_container, buldFragment, "Buld").commit();
        Buld = findViewById(R.id.bulb);
        Thermometer = findViewById(R.id.thermostat);
        Buld.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().add(R.id.rooms_container, buldFragment, "Buld").hide(dynamic).commit();
                dynamic = buldFragment;
            }
        });
        Thermometer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentManager.beginTransaction().add(R.id.rooms_container, thermometerFragment, "Thermometer").hide(dynamic).commit();
                dynamic = thermometerFragment;
            }
        });
    }
}