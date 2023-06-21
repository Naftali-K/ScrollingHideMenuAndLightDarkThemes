package com.example.scrollinghidemenuandlightdarkthemes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setReferences();

        findViewById(R.id.my_design_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), MyDesignActivity.class));
            }
        });

        findViewById(R.id.collapsing_tool_bar_youtube_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), CollapsingTollBarYouTubeActivity.class));
            }
        });

        findViewById(R.id.theme_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getBaseContext(), ThemesActivity.class));
            }
        });

        findViewById(R.id.collapsing_tool_bar_with_fragments_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getBaseContext(), CollapsingTollBarWithFragmentsActivity.class));
            }
        });
    }

    private void setReferences(){
    }
}