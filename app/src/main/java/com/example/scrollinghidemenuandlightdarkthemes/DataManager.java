package com.example.scrollinghidemenuandlightdarkthemes;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: naftalikomarovski
 * @Date: 2023/01/23
 */
public class DataManager {

    public static List<String> getItemList(int numItems){
        List<String> itemList = new ArrayList<>();

        for (int x = 0; x < numItems; x++){
            itemList.add("Item " + x);
        }

        return itemList;
    }
}
