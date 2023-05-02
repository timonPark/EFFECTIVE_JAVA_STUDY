package me.timonpark.ejs.effectivejavastudy.item01;

// 가솔린차 클래스 구현
public class GasolineCar extends Car {

    private String model;
    private int year;
    private String type;

    public GasolineCar(String model, int year) {
        this.model = model;
        this.year = year;
        this.type = "gasoline";
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
