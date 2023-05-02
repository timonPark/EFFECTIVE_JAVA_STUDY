package me.timonpark.ejs.effectivejavastudy.item01;

import java.util.HashMap;

// 정적 팩토리 메서드를 제공하는 CarFactory 클래스
public class CarFactory {

    // 이미 생성된 인스턴스를 저장하고 관리하기 위한 HashMap
    private static final HashMap<String, Car> instances = new HashMap<>();

    // 전기차 인스턴스 생성 메서드
    public static Car createElectricCar(String model, int year) {
        String key = "electric_" + model + "_" + year; // 고유한 키 생성
        if (!instances.containsKey(key)) { // 인스턴스가 존재하지 않으면 새 인스턴스 생성 및 저장
            Car car = new ElectricCar(model, year);
            instances.put(key, car);
        }
        return instances.get(key); // 기존 인스턴스 반환
    }

    // 가솔린차 인스턴스 생성 메서드
    public static Car createGasolineCar(String model, int year) {
        String key = "gasoline_" + model + "_" + year; // 고유한 키 생성
        if (!instances.containsKey(key)) { // 인스턴스가 존재하지 않으면 새 인스턴스 생성 및 저장
            Car car = new GasolineCar(model, year);
            instances.put(key, car);
        }
        return instances.get(key); // 기존 인스턴스 반환
    }
}
