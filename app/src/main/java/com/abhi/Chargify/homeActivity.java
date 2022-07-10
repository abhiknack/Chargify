package com.abhi.Chargify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.view.WindowManager;

public class homeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        View back , card1 ,card2 ,card3,line ,line2;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

        Fade fade = new Fade();
        View decor = getWindow().getDecorView();
        fade.excludeTarget(R.id.clayout,true);
        fade.excludeTarget(R.id.splash_layout,true);
        fade.excludeTarget(android.R.id.navigationBarBackground,true);
        fade.excludeTarget(android.R.id.statusBarBackground,true);
        getWindow().setEnterTransition(fade);
        getWindow().setExitTransition(fade);

        back = findViewById(R.id.back);
        card1 = findViewById(R.id.bbox);
        card2 = findViewById(R.id.bbox2);
        card3 = findViewById(R.id.bbox4);
        line = findViewById(R.id.line);
        line2 = findViewById(R.id.view);
        back.animate().alpha(0f).setDuration(1000);
        card1.animate().alpha(1f).setDuration(2000);
        card2.animate().alpha(1f).setDuration(3500);
        line.animate().alpha(1f).setDuration(2250);
        card3.animate().alpha(1f).setDuration(4000);
        line2.animate().alpha(1f).setDuration(3750);

    }
}