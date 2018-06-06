package com.websarva.wings.android.lifecyclesample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class LifeCycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_life_cycle);
    }
}
