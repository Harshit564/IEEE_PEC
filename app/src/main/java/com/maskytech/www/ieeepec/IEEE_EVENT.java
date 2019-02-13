package com.maskytech.www.ieeepec;

public class IEEE_EVENT {

    private int id;
    private String date;
    private String event;
    private int image;

    public IEEE_EVENT(int id, String d, String e, double rating, double price, int image) {
        this.id = id;
        this.date = d;
        this.event = e;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

