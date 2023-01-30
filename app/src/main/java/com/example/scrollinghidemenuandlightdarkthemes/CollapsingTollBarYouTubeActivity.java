package com.example.scrollinghidemenuandlightdarkthemes;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

/*
https://youtu.be/6UmHGn076To
 */

public class CollapsingTollBarYouTubeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing_toll_bar_you_tube);

        Toolbar toolbar = findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }


    // Setting option menu
    @SuppressLint("RestrictedApi") // this must be for show icons in option menu
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.top_right_options_menu, menu);

        if(menu instanceof MenuBuilder){ // for show icon in option menu
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }

        return true;
    }

    // setting Actions for options menu

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.share:
                Toast.makeText(this, "Clicked SHARE Button", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.qr_scan:
                Toast.makeText(this, "Clicked QR Button", Toast.LENGTH_SHORT).show();
                return true;
            case  R.id.report:
                Toast.makeText(this, "Clicked REPORT Button", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.edit:
                Toast.makeText(this, "Clicked EDIT Button", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.copy:
                Toast.makeText(this, "Clicked COPY Button", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.cut:
                Toast.makeText(this, "Clicked CUT Button", Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this, "Something Wrong!", Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }
}