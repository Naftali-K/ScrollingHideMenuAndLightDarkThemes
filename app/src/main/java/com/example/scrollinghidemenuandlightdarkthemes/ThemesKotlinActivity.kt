package com.example.scrollinghidemenuandlightdarkthemes

import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup

class ThemesKotlinActivity : AppCompatActivity() {

    private val TAG = "Test_Code"

    private val SHARED_PREFERENCES_NAME: String = "Theme"
    private val SHARED_PREFERENCES_THEME: String = "Theme"
    private val SHARED_PREFERENCES_THEME_ENUM: String = "ThemeEnum"

    private var themeName: String = ""

    private val sharedPreferences: SharedPreferences = getSharedPreferences(SHARED_PREFERENCES_NAME, MODE_PRIVATE)
    private val editor: SharedPreferences.Editor = sharedPreferences.edit()

//    private val themesRadioGroup: RadioGroup? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_themes)
        setReferences()
    }

    private fun setReferences(){
//        themeName = findViewById(R.id.themes_radio_group)
    }
}