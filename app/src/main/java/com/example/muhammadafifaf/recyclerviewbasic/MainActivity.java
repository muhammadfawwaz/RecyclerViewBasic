package com.example.muhammadafifaf.recyclerviewbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String message = "Hello";
    private RecyclerView recyclerView;
    private MainAdapter mainAdapter;
    private ArrayList<String> x;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i(message,"onCreate()");
        setContentView(R.layout.activity_main);
        initData();
        recyclerView = findViewById(R.id.recyclerViewId);
        layoutManager = new GridLayoutManager(this,1);
        mainAdapter = new MainAdapter(x);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(mainAdapter);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(message,"onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(message,"onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(message,"onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(message,"onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(message,"onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(message,"onStop()");
    }

    public ArrayList<String> initData() {
        x = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            x.add(String.valueOf(i));
        }
        return x;
    }
}
