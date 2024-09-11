package com.example.a11practraz;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private ImageView animationIV;
    private Button btnFrameAnimation;
    private Button btnTweenAnimation;
    private AnimationDrawable frameAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnFrameAnimation = findViewById(R.id.btnFrameAnimation);
        Button btnTweenAnimation = findViewById(R.id.btnTweenAnimation);

        btnFrameAnimation.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, FrameAnimationActivity.FrameAnimationActiviy.class);
            startActivity(intent);
        });

        btnTweenAnimation.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, TweenAnimationActivity.class);
            startActivity(intent);
        });
    }
}