package com.example.a11practraz;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class TweenAnimationActivity extends AppCompatActivity {
    private Button button3;
    private Button button2;
    private Button button;
    private ImageView imageViewTween;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tween_animation);
        imageViewTween = findViewById(R.id.imageViewTween);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        imageViewTween = findViewById(R.id.imageViewTween);

        ImageView imageView = findViewById(R.id.imageViewTween);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.tween_animation);
        imageView.startAnimation(animation);

        Animation slideUpFadeIn = AnimationUtils.loadAnimation(this, R.anim.slide_up_fade_in);


        button.startAnimation(slideUpFadeIn);
        button2.startAnimation(slideUpFadeIn);
        button3.startAnimation(slideUpFadeIn);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewTween.startAnimation(animation);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageViewTween.clearAnimation();
            }
        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        });
    }
}

