package com.example.lecture6intentpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class NewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);
    }
    public void Call(View view)
    {
        Uri uri= Uri.parse("tel: +923209407871");
        Intent intent=new Intent(Intent.ACTION_DIAL,uri);
        startActivity(intent);
    }
    public void openWebsite(View view)
    {
        Uri uri= Uri.parse("https://www.google.com");
        Intent intent=new Intent(Intent.ACTION_VIEW,uri);
        startActivity(intent);
    }
}