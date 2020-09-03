package com.girishkumar032.cityguide.HelperClasses.HomeAdapter;

import android.graphics.drawable.GradientDrawable;

public class CategoriesHelperClass {
    int image;
    String title,description;

    public CategoriesHelperClass(GradientDrawable gradient1, int school_image, String education) {

    }

    public void FeaturedHelperClass(int image, String title, String description) {
        this.image = image;
        this.title = title;
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public Object getTitle() {
        return title;
    }

    public void getGradient() {
        return;

    }
}
