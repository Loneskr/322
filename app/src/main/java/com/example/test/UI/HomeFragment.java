package com.example.test.UI;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.test.Adapters.RoomsAdapter;
import com.example.test.R;
import com.example.test.Splash.AddRoomsActivity;

import java.util.ArrayList;


public class HomeFragment extends Fragment {

    private RecyclerView recyclerView;
    private RoomsAdapter roomsAdapter;
    private ArrayList<String> majorList;

    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_home,container,false);
        ImageView btnAdd = v.findViewById(R.id.btn_add);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), AddRoomsActivity.class);
                startActivity(intent);
            }
        });
        recyclerView = v.findViewById(R.id.recyclerRooms);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2));
        majorList = new ArrayList<>();
        majorList.add("Living Room");
        majorList.add("Kitchen");
        majorList.add("Bathroom");
        roomsAdapter = new RoomsAdapter(majorList);
        recyclerView.setAdapter(roomsAdapter);
        return v;
    }
}