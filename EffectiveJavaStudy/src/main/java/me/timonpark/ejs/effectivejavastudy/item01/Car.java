package me.timonpark.ejs.effectivejavastudy.item01;


import java.util.Objects;

public class Car implements CarInterface {
    private String model;
    private int year;
    private String type;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return year == car.year && Objects.equals(model, car.model) && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, year, type);
    }
}
