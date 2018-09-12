package com.example.com.list;

public class Data {
    String bigTitle;
    String smallTitle;

    Data(String bigTitle, String smallTitle) {
        this.bigTitle = bigTitle;
        this.smallTitle = smallTitle;
    }

    public void setBigTitle(String bigTitle) {
        this.bigTitle = bigTitle;
    }

    public void setSmallTitle(String smallTitle) {
        this.smallTitle = smallTitle;
    }

    public String getBigTitle() {

        return bigTitle;
    }

    public String getSmallTitle() {

        return smallTitle;
    }
}
