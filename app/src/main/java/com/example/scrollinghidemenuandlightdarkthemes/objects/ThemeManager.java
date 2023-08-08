package com.example.scrollinghidemenuandlightdarkthemes.objects;

import android.content.Context;

import com.example.scrollinghidemenuandlightdarkthemes.R;
import com.example.scrollinghidemenuandlightdarkthemes.enums.ThemesStringEnum;

/**
 * @Author: naftalikomarovski
 * @Date: 2023/01/30
 */
abstract public class ThemeManager {

    public static void set(Context context, String activeTheme) {
        int themeRecourseID = R.style.White;

        if (activeTheme.equals("DarkMode")) {
            themeRecourseID = R.style.DarkMode;
        }

        if (activeTheme.equals("Green")) {
            themeRecourseID = R.style.Green;
        }

        if (activeTheme.equals("Orange")) {
            themeRecourseID = R.style.Orange;
        }

        if (activeTheme.equals("Pink")) {
            themeRecourseID = R.style.Pink;
        }

        if (activeTheme.equals("Black")) {
            themeRecourseID = R.style.Black;
        }

        if (activeTheme.equals("White")) {
            themeRecourseID = R.style.White;
        }

        context.setTheme(themeRecourseID);
    }

    public static void set(Context context, ThemesStringEnum themesStringEnum){
        int themeResourceID = R.style.White;

        if (themesStringEnum == ThemesStringEnum.GREEN){
            themeResourceID = R.style.Green;
        }

        if (themesStringEnum == ThemesStringEnum.ORANGE){
            themeResourceID = R.style.Orange;
        }

        if (themesStringEnum == ThemesStringEnum.PINK){
            themeResourceID = R.style.Pink;
        }

        if (themesStringEnum == ThemesStringEnum.BLACK){
            themeResourceID = R.style.Black;
        }

        if (themesStringEnum == ThemesStringEnum.BLACK_WHITE) {
            themeResourceID = R.style.Black_white;
        }

        context.setTheme(themeResourceID);
    }
}
