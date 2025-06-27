package com.example.myapplication4;

public class Sport {
    String name;
    int imageResId;

    public Sport(String name, int imageResId) {
        this.name = name;
        this.imageResId = imageResId;
    }

    public String getName() {
        return name;
    }

    public int getImageResId() {
        return imageResId;
    }
}

