package me.timonpark.ejs.effectivejavastudy;

import me.timonpark.ejs.effectivejavastudy.item01.Car;
import me.timonpark.ejs.effectivejavastudy.item01.CarFactory;
import me.timonpark.ejs.effectivejavastudy.item01.ElectricCar;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class Item01Tests {

    @Test
    void ConstructorTest(){
        // 생성자 방식
        Car electricCar = new ElectricCar("tesla", 1);

        //정적 팩토리 메서드
        Car electricCar2 = CarFactory.createElectricCar("tesla", 1);

        // 객체 결과비교
        assertThat(electricCar).isEqualTo(electricCar2);
    }
}
