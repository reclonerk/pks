package com.example.pks;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

public class LoginCardLight extends AppCompatActivity {

    private View parent_view;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_card_light);
        parent_view = findViewById(android.R.id.content);

        Tools.setSystemBarColor(this, R.color.grey_5);
        Tools.setSystemBarLight(this);

    }
}
