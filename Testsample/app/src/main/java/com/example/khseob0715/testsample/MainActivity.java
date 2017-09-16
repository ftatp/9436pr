package com.example.khseob0715.testsample;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    static int mission_img[] = {R.drawable.mis01,R.drawable.mis02,R.drawable.mis03,R.drawable.mis04,R.drawable.mis05};
    static int cle_img[] = {R.drawable.cle01,R.drawable.cle02,R.drawable.cle03,R.drawable.cle04,R.drawable.cle05};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void Mission(View view) {
        Intent Mission = new Intent(getApplicationContext(), MissionBoxActivity.class);
        startActivity(Mission);
    }
}
