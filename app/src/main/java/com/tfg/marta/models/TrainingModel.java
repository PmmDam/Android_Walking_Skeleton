package com.tfg.marta.models;

import android.graphics.drawable.Drawable;

import java.io.InputStream;
import java.net.URL;

public class TrainingModel {

    //Properties
    private String id;
    private String name;
    private String url;
    private String imageUrl;


    //Constructor
    public TrainingModel(String id, String name, String url, String imageUrl) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.imageUrl = imageUrl;
    }

    //Getters & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }



}
