package com.example.lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Toast.makeText(this, "Application Started", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void onPause(){
        super.onPause();
        Toast.makeText(this, "Application Paused", Toast.LENGTH_LONG).show();
    }

    @Override
    protected  void onStop(){
        super.onStop();
        Toast.makeText(this, "Application Stop", Toast.LENGTH_LONG).show();
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Toast.makeText(this, "Application Destroy", Toast.LENGTH_LONG).show();
    }

    @Override
    protected  void onRestart(){
        super.onRestart();
        Toast.makeText(this, "Application Restart", Toast.LENGTH_LONG).show();
    }

    @Override
    protected  void onResume(){
        super.onResume();
        Toast.makeText(this, "Application Resume", Toast.LENGTH_LONG).show();
    }
}