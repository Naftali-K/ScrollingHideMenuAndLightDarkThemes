package com.example.scrollinghidemenuandlightdarkthemes.enums;

/**
 * @Author: naftalikomarovski
 * @Date: 2023/01/31
 */
public enum ThemesStringEnum {
    GREEN("Green"),
    ORANGE("Orange"),
    PINK("Pink"),
    BLACK("Black"),
    WHITE("White"),
    BLACK_WHITE("Black_White");

    private String theme;

    ThemesStringEnum(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }

    public static ThemesStringEnum getEnumName(String theme){
        if (theme.equals("Green")){
            return ThemesStringEnum.GREEN;
        }

        if (theme.equals("Orange")){
            return ThemesStringEnum.ORANGE;
        }

        if (theme.equals("Pink")){
            return ThemesStringEnum.PINK;
        }

        if (theme.equals("Black")){
            return ThemesStringEnum.BLACK;
        }

        if (theme.equals("Black_White")){
            return ThemesStringEnum.BLACK_WHITE;
        }

        return ThemesStringEnum.WHITE;
    }
}
