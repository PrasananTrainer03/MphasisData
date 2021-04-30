package com.java.day3;

public class Laptop {
    private int height;
    private int width;
    private String company;
    public Laptop() {}
    public Laptop(int argHeight, int argWidth, String argCompany) {
        height = argHeight;
        width = argWidth;
        company = argCompany;
    }
    public int getHeight() {
        return height;
    }
    public int getWidth() {
        return width;
    }
    public String getCompany() {
        return company;
    }
}