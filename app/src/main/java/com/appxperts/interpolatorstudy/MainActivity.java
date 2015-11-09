package com.appxperts.interpolatorstudy;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.imageView);
    }

    public void accelerateDeaccelerate(View v) {
//        ObjectAnimator anim = ObjectAnimator.ofFloat(imageView, "translationY", 0f, 700f);
//        anim.setInterpolator(new AccelerateDecelerateInterpolator());
//        anim.setDuration(2000);
//        anim.start();

        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.accelerate_decelerate);
        imageView.startAnimation(anim);
    }

    public void accelerate(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.accelerate);
        imageView.startAnimation(anim);
    }

    public void anticipate(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anticipate);
        imageView.startAnimation(anim);
    }

    public void anticipateOvershoot(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anticipate_overshoot);
        imageView.startAnimation(anim);
    }

    public void bounce(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.bounce);
        imageView.startAnimation(anim);
    }


    public void cycle(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.cycle);
        imageView.startAnimation(anim);
    }


    public void deaccelerate(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.deaccelerate);
        imageView.startAnimation(anim);
    }

    public void linear(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.linear);
        imageView.startAnimation(anim);
    }

    public void overshoot(View v) {
        Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.overshoot);
        imageView.startAnimation(anim);
    }


}
