package com.rguz.moviewatchlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainPage extends AppCompatActivity {
    TextView loggedName;
    String nameDisplayed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        loggedName = findViewById(R.id.username);
        nameDisplayed = getIntent().getExtras().getString("Send_Name");
        loggedName.setText(nameDisplayed);

    }
}
