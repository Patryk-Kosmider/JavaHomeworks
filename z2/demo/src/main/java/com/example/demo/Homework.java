package com.example.demo;

public class Homework {
    private String text;

    public Homework(){}
    public Homework(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void updateHomework(Homework homework){
        this.text = homework.getText();
    }
}
