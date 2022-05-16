package com.example.j_tech;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import java.util.ArrayList;
import java.util.List;
public class DataProvider {
    static String[] category = {
            "Phone","Laptop","Tablet"
    };
    static String[] price = {

    };
    static String[] description = {};
    static String[] image = {};
    static String[] year = {};
    static String[] simple_description = {};
    static String[] top_picks = {
            "True","False"
    };
   //private static List<Device> devices;
    // private static List<Device> topPicks;


    public static ArrayList<Device> generateTopPicks() {

        ArrayList<Device> topPicks = new ArrayList<Device>();

        for (int i = 0; i < 2; i++) {
            topPicks.add(new Device("iPhone 13 Max", R.drawable.phone_category));
        }

        return topPicks;

    }
}
