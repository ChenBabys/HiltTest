package com.yatinova.hilttest;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import javax.inject.Inject;

import dagger.hilt.android.AndroidEntryPoint;

/**
 * 测试hilt的注入依赖的活动，减少new之类的样板代码。
 */
@AndroidEntryPoint
public class MainActivity extends AppCompatActivity {
    @Inject
    public NetDataTest netDataTest;
    private TextView textView;
    @Inject
    public User user;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.test);
        //netDataTest = new NetDataTest();//使用了hilt之后直接就可以不用这样new就可以获得对象实例。
        textView.setText(netDataTest.getData() + "\n" + user.toString());
        Log.d("MainActivity", netDataTest.getData());
        Toast.makeText(this, netDataTest.getData(), Toast.LENGTH_SHORT).show();
        textView.setOnClickListener(view -> {
            Intent intent = new Intent(this, SecondActivity.class);
            startActivity(intent);
        });
    }
}