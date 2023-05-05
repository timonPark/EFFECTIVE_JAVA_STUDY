package me.timonpark.ejs.effectivejavastudy.item01;


import java.util.Objects;

public class Car implements CarInterface {
    private String model;
    private int year;
    private String type;

    public Car(final String model, final int year, final String electric) {
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public int getYear() {
        return 0;
    }

    @Override
    public String getType() {
        return null;
    }

}
