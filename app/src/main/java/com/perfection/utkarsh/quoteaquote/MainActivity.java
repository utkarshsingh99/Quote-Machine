package com.perfection.utkarsh.quoteaquote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView text1 = findViewById(R.id.intro1);
        TextView text2 = findViewById(R.id.intro2);
        TextView text3 = findViewById(R.id.intro3);
        Animation animation;
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        text1.startAnimation(animation);
        text2.startAnimation(animation);
        text3.startAnimation(animation);
    }
}
