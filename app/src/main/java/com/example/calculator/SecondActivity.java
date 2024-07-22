package com.example.calculator;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity {

    TextView resultView;
    ImageView heart;
    ImageView heart2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int result = intent.getIntExtra("result", 0);

        resultView = findViewById(R.id.result_textView);
        resultView.setText(String.valueOf(result));
        heart = findViewById(R.id.heart);
        heart2 = findViewById(R.id.heart2);

        heart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (heart2.getVisibility() == View.VISIBLE) {
                    heart2.setVisibility(View.GONE);
                } else {
                    heart2.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    public void clickNext(View view) {
        finish();
    }

}
