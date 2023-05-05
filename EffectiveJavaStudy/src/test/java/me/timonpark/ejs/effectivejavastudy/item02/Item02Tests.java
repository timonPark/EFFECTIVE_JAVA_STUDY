package me.timonpark.ejs.effectivejavastudy.item02;

import me.timonpark.ejs.effectivejavastudy.item02.builderPattern.NutritionFacts03;
import me.timonpark.ejs.effectivejavastudy.item02.javaBeansPattern.NutritionFacts02;
import me.timonpark.ejs.effectivejavastudy.item02.lombok.NutritionFacts04;
import me.timonpark.ejs.effectivejavastudy.item02.nutritionFactsFactory.NutritionFactsFactory;
import me.timonpark.ejs.effectivejavastudy.item02.telescopingConstructorPattern.NutritionFacts01;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class Item02Tests {

    @Test
    void constructorTest() {
        /**
         * 점층적 생성자 패턴(Telescoping Constructor Pattern)
         * 가장 정석적인 방법으로 객체로 만들수 있다
         * 불편객체로 만들어짐
         * 매개변수가 늘어날 수록, 특정 매개변수가 이름이 명시되지 않기 때문에
         * 가독성이 떨어지고, 매개변수를 넣는 과정에서 실수 발생할 가능성이 있다
         */
        NutritionFacts01 nutritionFacts01 = new NutritionFacts01(
                240, 8, 100, 0, 35, 27);

        /**
         * 자바빈즈 패턴(JavaBeans Pattern)
         * 매개변수 없는 생성자로 만듬
         * 매개변수를 입력할 때 명시된 이름의 Setter를 호출하여 넣기 때문에 매개변수 입력시 실수를 줄일 수 있다
         * 단 불변객체로 만들 수 없음, 객체가 완전히 값을 갖출때까지 일관성이 무너져있음(consistency)
         * => 스레드 안정성(Thread Safety)을 확보할 수 없다
         */
        NutritionFacts02 nutritionFacts02 = new NutritionFacts02();
        nutritionFacts02.setServingSize(240);
        nutritionFacts02.setServings(8);
        nutritionFacts02.setCalories(100);
        nutritionFacts02.setFat(0);
        nutritionFacts02.setSodium(35);
        nutritionFacts02.setCarbohydrate(27);

        /**
         * 빌더패턴 (builder pattern)
         * 객체 생성시 모양은 자바빈즈 패턴과 흡사하나 불변성을 보장한다
         */

        NutritionFacts03 nutritionFacts03 = new NutritionFacts03
                .Builder(240, 8)
                .calories(100)
                .fat(0)
                .sodium(35)
                .carbohydrate(27)
                .build();

        /**
         * Lombok으로 만든 빌더패턴 (builder pattern)
         */

        NutritionFacts04 nutritionFacts04 = NutritionFacts04.builder()
                .servingSize(240)
                .servings(8)
                .calories(100)
                .fat(0)
                .sodium(35)
                .carbohydrate(27)
                .build();

        // 4개의 객체를 각각 비교했을 때 True가 나옴
        assertThat(NutritionFactsFactory.createNutritionFacts(nutritionFacts01)).isEqualTo(NutritionFactsFactory.createNutritionFacts(nutritionFacts02));
        assertThat(NutritionFactsFactory.createNutritionFacts(nutritionFacts01)).isEqualTo(NutritionFactsFactory.createNutritionFacts(nutritionFacts03));
        assertThat(NutritionFactsFactory.createNutritionFacts(nutritionFacts01)).isEqualTo(NutritionFactsFactory.createNutritionFacts(nutritionFacts04));
    }
}
