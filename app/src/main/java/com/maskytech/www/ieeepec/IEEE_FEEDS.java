package com.maskytech.www.ieeepec;

public class IEEE_FEEDS {
    String name;
    String description;
public IEEE_FEEDS(String n,String d){
    this.name=n;
    this.description=d;

}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
