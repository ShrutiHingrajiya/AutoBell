package com.example.AutoBell.Bean;

import android.graphics.drawable.Drawable;

public class TreatmentsType {
    String name, subname;
    int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }


    public TreatmentsType(String name, String subname, int image) {
        this.name = name;
        this.subname = subname;
        this.image = image;
    }
}
