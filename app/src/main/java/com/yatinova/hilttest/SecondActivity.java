package com.yatinova.hilttest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class SecondActivity extends AppCompatActivity {
    private ImageView image;
    @Inject
    public NetDataModule netDataTest;
    @Inject
    public User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        image = findViewById(R.id.image);
        image.setOnClickListener(view -> {
            Toast.makeText(this, netDataTest.getData() + "\n" + user.toString(), Toast.LENGTH_SHORT).show();
        });
    }
}