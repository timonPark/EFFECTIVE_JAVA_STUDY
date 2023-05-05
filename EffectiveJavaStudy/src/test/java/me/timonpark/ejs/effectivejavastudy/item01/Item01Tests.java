package me.timonpark.ejs.effectivejavastudy.item01;

import me.timonpark.ejs.effectivejavastudy.item01.Car;
import me.timonpark.ejs.effectivejavastudy.item01.CarFactory;
import me.timonpark.ejs.effectivejavastudy.item01.ElectricCar;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class Item01Tests {

    @Test
    void constructorTest(){
        // 생성자 방식
        Car electricCar = new ElectricCar("tesla", 1);
        Car electricCar2 = new ElectricCar("tesla", 1);

        //정적 팩토리 메서드
        Car electricCar3 = CarFactory.createElectricCar("tesla", 1);

        //정적 팩토리 메서드
        Car electricCar4 = CarFactory.createElectricCar("tesla", 1);

        System.out.println(electricCar.hashCode()); // 2124360754
        System.out.println(electricCar2.hashCode()); // 434167806
        System.out.println(electricCar3.hashCode()); // 1565397985
        System.out.println(electricCar4.hashCode()); // 1565397985
        // 객체 결과비교
        assertThat(electricCar).isNotEqualTo(electricCar2);
        assertThat(electricCar).isNotEqualTo(electricCar3);
        assertThat(electricCar2).isNotEqualTo(electricCar3);
        assertThat(electricCar3).isEqualTo(electricCar4);
    }
}
