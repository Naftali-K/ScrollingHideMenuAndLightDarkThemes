package com.example.scrollinghidemenuandlightdarkthemes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioGroup;

import com.example.scrollinghidemenuandlightdarkthemes.enums.ThemesStringEnum;
import com.example.scrollinghidemenuandlightdarkthemes.objects.ThemeManager;

public class ThemesActivity extends AppCompatActivity {

    private static final String TAG = "Test_Code";

    private static final String SHARED_PREFERENCES_NAME = "Theme";
    private static final String SHARED_PREFERENCES_THEME = "Theme";
    private static final String SHARED_PREFERENCES_THEME_ENUM = "ThemeEnum";

    private String themeName;

    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;

    private RadioGroup themesRadioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        sharedPreferences = getSharedPreferences(SHARED_PREFERENCES_NAME, MODE_PRIVATE);
        editor = sharedPreferences.edit();

        themeName = sharedPreferences.getString(SHARED_PREFERENCES_THEME, "White");
        Log.d(TAG, "onCreate: Test: " + sharedPreferences.getString(SHARED_PREFERENCES_THEME_ENUM, "test"));
        ThemesStringEnum themesStringEnum = ThemesStringEnum.getEnumName(themeName);

        //SET THE THEME HERE BEFORE SETTING THE CONTENTVIEW OF THE ACTIVITY
//        ThemeManager.set(this, "Pink");
//        ThemeManager.set(this, themeName);
        ThemeManager.set(this, themesStringEnum);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_themes);
        setReferences();

        setRadioButton(themesStringEnum);

        themesRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
//                Log.d(TAG, "onCheckedChanged: Checked: " + checkedId + " Orange: " + R.id.orange_radio_btn);
                switch (checkedId){
                    case R.id.green_radio_btn:
                        setSharedPreferences(ThemesStringEnum.GREEN);
                        break;
                    case  R.id.orange_radio_btn:
                        setSharedPreferences(ThemesStringEnum.ORANGE);
                        break;
                    case R.id.pink_radio_btn:
                        setSharedPreferences(ThemesStringEnum.PINK);
                        break;
                    case R.id.black_radio_btn:
                        setSharedPreferences(ThemesStringEnum.BLACK);
                        break;
                    case R.id.black_white_radio_btn:
                        setSharedPreferences(ThemesStringEnum.BLACK_WHITE);
                        break;
                    case R.id.white_radio_btn:
                    default:
                        setSharedPreferences(ThemesStringEnum.WHITE);
                }
            }
        });
    }

    private void setReferences(){
        themesRadioGroup = findViewById(R.id.themes_radio_group);
    }

    private void setRadioButton(ThemesStringEnum theme){
        if (theme == ThemesStringEnum.GREEN){
            themesRadioGroup.check(R.id.green_radio_btn);
            return;
        }

        if (theme == ThemesStringEnum.ORANGE){
            themesRadioGroup.check(R.id.orange_radio_btn);
            return;
        }

        if (theme == ThemesStringEnum.PINK){
            themesRadioGroup.check(R.id.pink_radio_btn);
            return;
        }

        if (theme == ThemesStringEnum.BLACK){
            themesRadioGroup.check(R.id.black_radio_btn);
            return;
        }

        if (theme == ThemesStringEnum.BLACK_WHITE) {
            themesRadioGroup.check(R.id.black_white_radio_btn);
            return;
        }

        if (theme == ThemesStringEnum.WHITE){
            themesRadioGroup.check(R.id.white_radio_btn);
            return;
        }
    }

    private void setSharedPreferences(ThemesStringEnum themesStringEnum){
        String theme = themesStringEnum.getTheme();
        editor.putString(SHARED_PREFERENCES_THEME, theme);
        editor.putString(SHARED_PREFERENCES_THEME_ENUM, themesStringEnum.toString());
        editor.commit();

        reloadActivity();
    }

    private void reloadActivity(){
        Intent intent = getIntent();
        startActivity(intent);
        finish();
    }
}