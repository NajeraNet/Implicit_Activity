package com.example.implicit_activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnCall, btnCallFriend, btnOpenWeb, btnOpenMap;

    //
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO
        btnCall = findViewById(R.id.btnCall);
        btnCallFriend = findViewById(R.id.btnCallFriend);
        btnOpenWeb = findViewById(R.id.btnOpenWeb);
        btnOpenMap = findViewById(R.id.btnOpenMap);
        //
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewCall) {
                //
                Intent intent = new Intent(Intent.ACTION_DIAL);
                startActivity(intent);
            }
        });
        //
        btnCallFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewCallFriend) {
                //
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:4494862595"));
                startActivity(intent);
            }
        });
        //
        btnOpenWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewOpenWeb) {
                //
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.backendless.com"));
                startActivity(intent);
            }
        });
        //
        btnOpenMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View viewOpenMap) {
                //
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0q=115 State Way, Welkom, Free Street"));
                startActivity(intent);
            }
        });
        //
    }
}
