package com.example.hellotoast;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.hellotoast.databinding.ActivityMainBinding;

public class  MainActivity extends AppCompatActivity {

    private int count = 0;

    public static ActivityMainBinding mainBinding;

//    public TextView displayCountText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        mainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
//        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

//        displayCountText = findViewById(R.id.text_display_count);

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count");
            mainBinding.textDisplayCount.setText(String.valueOf(count));
            if (count != 0) {
                change_colors();
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }

    public void show_toast(View view) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_SHORT).show();
    }

    public void increase_count(View view) {
        count++;
        mainBinding.textDisplayCount.setText(String.valueOf(count));
//        displayCountText.setText(String.valueOf(count));
        change_colors();
    }

    public void show_zero(View view) {
        count = 0;
        mainBinding.textDisplayCount.setText(String.valueOf(count));
        mainBinding.buttonZero.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
    }

    private void change_colors() {
        if (count % 2 == 1) {
            mainBinding.buttonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        } else {
            mainBinding.buttonCount.setBackgroundColor(ContextCompat.getColor(this, R.color.blue));
        }
        mainBinding.buttonZero.setBackgroundColor(ContextCompat.getColor(this, R.color.orange));
    }
}