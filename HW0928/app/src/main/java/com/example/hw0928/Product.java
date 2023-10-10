package com.example.hw0928;

public class Product {
    private String title;
    private String info;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public int getSource() {
        return source;
    }

    public void setSource(int source) {
        this.source = source;
    }

    public Product(String title, String info, int source) {
        this.title = title;
        this.info = info;
        this.source = source;
    }

    private int source;
}
