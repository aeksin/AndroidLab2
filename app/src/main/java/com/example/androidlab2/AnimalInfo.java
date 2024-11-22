package com.example.androidlab2;

public class AnimalInfo {
    private String name;
    private float weight;
    private float height;
    private int pictureResource;

    public AnimalInfo(String name, float weight, float height, int pictureId) {
        this.name = name;
        this.weight = weight;
        this.height = height;
        this.pictureResource = pictureId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return this.weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return this.height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getPictureResource() {
        return this.pictureResource;
    }

    public void setPictureResource(int pictureResource) {
        this.pictureResource = pictureResource;
    }
}
