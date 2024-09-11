package com.example.a11practraz;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.a11practraz.R;

public class FrameAnimationActivity {
    public static class FrameAnimationActiviy extends AppCompatActivity {
        private ImageView imageView;
        private Button button3;
        private Button button2;
        private Button button;
        private AnimationDrawable frameAnimation;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_frame_animation);
            button = findViewById(R.id.button);
            button2 = findViewById(R.id.button2);
            button3 = findViewById(R.id.button3);
            imageView = findViewById(R.id.imageView);

            frameAnimation = (AnimationDrawable) imageView.getDrawable();

            ImageView imageView = findViewById(R.id.imageView);
            imageView.setBackgroundResource(R.drawable.frame_animation);
            Animation slideDownFadeIn = AnimationUtils.loadAnimation(this, R.anim.frame_animation);

            AnimationDrawable animationDrawable = (AnimationDrawable) imageView.getBackground();
            animationDrawable.start();
            button.startAnimation(slideDownFadeIn);
            button2.startAnimation(slideDownFadeIn);
            button3.startAnimation(slideDownFadeIn);

            button.setOnClickListener(v -> {
                if (!frameAnimation.isRunning()) {
                    frameAnimation.start();
                }
            });
            button2.setOnClickListener(v -> {
                if (frameAnimation.isRunning()) {
                    frameAnimation.stop();

                }
            });
            button3.setOnClickListener(v -> {
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
            });
        }

    }
}