package com.example.khseob0715.testsample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;

import java.util.Random;

import static com.example.khseob0715.testsample.MainActivity.cle_img;
import static com.example.khseob0715.testsample.MainActivity.mission_img;

public class MissionBoxActivity extends AppCompatActivity {

    int rd_num;
    ImageView mission;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.missionboxactivity);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .8), (int) (height * .35));


        mission = (ImageView)findViewById(R.id.missionimg);

        Random rd = new Random();
        rd_num = rd.nextInt(5);

        mission.setImageResource(mission_img[rd_num]);
    }


    public void clear(View view) {
        mission_img[rd_num] = cle_img[rd_num];
        mission.setImageResource(mission_img[rd_num]);
    }

    public void NextImg(View view) {
        rd_num++;
        if(rd_num == mission_img.length){
            rd_num = 0;
        }
        mission.setImageResource(mission_img[rd_num]);
    }

    public void Exit(View view) {
        finish();
    }
}
