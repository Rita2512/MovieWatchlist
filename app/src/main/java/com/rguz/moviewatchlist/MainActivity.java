package com.rguz.moviewatchlist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText loginEmail ;
    EditText loginPass ;
    ImageView loginBtn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginBtn  = findViewById(R.id.loginbtn);
        loginEmail =  findViewById(R.id.editTextUN);
        loginPass  =  findViewById(R.id.editTextPW);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String text = loginEmail.getText().toString().toLowerCase();

                if (validate())  {

                    Intent login = new Intent(MainActivity.this, MainPage.class);
                    login.putExtra("Send_Name", text);
                    startActivity(login);
                }

            }

        });

    }

    private boolean validate() {
        if (loginEmail.getText().toString().equals("admin") && loginPass.getText().toString().equals("admin")) {
            Toast.makeText(MainActivity.this,"Login Successful", Toast.LENGTH_SHORT).show();
            return true;
        }
        else {
            Toast.makeText(MainActivity.this,"Please enter a valid Password", Toast.LENGTH_SHORT).show();

            return false;
        }
    }

}