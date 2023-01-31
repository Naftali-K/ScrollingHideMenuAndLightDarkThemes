package com.example.scrollinghidemenuandlightdarkthemes.enums;

import com.example.scrollinghidemenuandlightdarkthemes.R;

/**
 * @Author: naftalikomarovski
 * @Date: 2023/01/31
 */
public enum ThemeResourceStringEnum {
    GREEN(R.string.green),
    ORANGE(R.string.orange),
    PINK(R.string.pink),
    BLACK(R.string.black),
    WHITE(R.string.white);

    private int theme;

    ThemeResourceStringEnum(int theme) {
        this.theme = theme;
    }

    public int getTheme() {
        return theme;
    }
}
