package me.timonpark.ejs.effectivejavastudy.item01;

// 전기차 클래스 구현
public class ElectricCar extends Car {

    private String model;
    private int year;
    private String type;

    public ElectricCar(String model, int year) {
        this.model = model;
        this.year = year;
        this.type = "electric";
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String getType() {
        return type;
    }
}
