package com.example.exam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void DriverLogin(View view)
    {
        Intent intent = new Intent(MainActivity.this,
                SignInDriverActivity.class);
        startActivity(intent);
    }
    public void ClientLogin(View view)
    {
        Intent intent = new Intent(MainActivity.this,
                SignInClientActivity.class);
        startActivity(intent);
    }
}