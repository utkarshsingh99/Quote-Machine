package com.perfection.utkarsh.quoteaquote;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        TextView text =(TextView)findViewById(R.id.intro);
        text.startAnimation(AnimationUtils.loadAnimation(this, android.R.anim.fade_in));
    }
}
