package com.qaprosoft.carina.igor.utils;

public enum WebView {
    WEB_VIEW("Web View", 1),
    CHARTS("Charts", 2),
    MAP("Map", 3),
    UI_ELEMENTS("UI elements", 4);

    private String name;
    private int index;

    WebView(String name,int index) {
        this.name = name;
        this.index = index;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex(int index) {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}