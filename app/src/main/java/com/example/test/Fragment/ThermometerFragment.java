package com.example.test.Fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.test.R;

public class ThermometerFragment extends Fragment {


    public ThermometerFragment() {
        // Required empty public constructor
    }

    public static ThermometerFragment newInstance(String param1, String param2) {
        ThermometerFragment fragment = new ThermometerFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_thermometer, container, false);
        return v;
    }
}