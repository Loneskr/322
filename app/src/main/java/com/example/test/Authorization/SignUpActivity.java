package com.example.test.Authorization;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.test.R;

public class SignUpActivity extends AppCompatActivity {

    private CardView cardResident, cardHouse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        cardResident = findViewById(R.id.bnt_Resident);
        cardHouse = findViewById(R.id.btn_House);

        cardHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SignUpActivity.this, SignInActivity.class));
            }
        });
    }
}