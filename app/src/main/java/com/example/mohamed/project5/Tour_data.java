package com.example.mohamed.project5;

public class Tour_data {
    private String Tour_name;
    private String Tour_Adress;
    private String Tour_phone;
    private int Tour_img;

    public Tour_data(String name, String adress, String phone, int imgs) {
        this.Tour_Adress = adress;
        this.Tour_img = imgs;
        this.Tour_name = name;
        this.Tour_phone = phone;
    }

    public Tour_data(String name, String adress) {
        this.Tour_Adress = adress;
        this.Tour_name = name;
    }

    public String getTour_Adress() {
        return Tour_Adress;
    }

    public int getTour_img() {
        return Tour_img;
    }

    public String getTour_name() {
        return Tour_name;
    }

    public String getTour_phone() {
        return Tour_phone;
    }
}
