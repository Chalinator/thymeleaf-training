package com.example.springbootthymeleaf;

public class Car {
    private String model;
    private String mark;
    public Car(String mark, String model) {
        this.model = mark;
        this.mark = model;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }
}
