package com.example.applepi_;

public class Data {
    private String title;
    private String content;

    //alt+insert con,get,set
    public Data(String title, String content) {
        this.title = title;
        this.content = content;
    }
    //getTitle
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
