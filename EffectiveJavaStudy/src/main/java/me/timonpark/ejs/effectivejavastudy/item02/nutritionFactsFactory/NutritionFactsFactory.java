package me.timonpark.ejs.effectivejavastudy.item02.nutritionFactsFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import me.timonpark.ejs.effectivejavastudy.item02.base.NutritionFacts;
import me.timonpark.ejs.effectivejavastudy.item02.base.NutritionFactsInterface;

/**
 * 정적 팩토리 메소드 패턴 적용하여 NutritionFacts 생성하는 팩토리 구현
 */
public class NutritionFactsFactory {

    private static final Map<Integer, NutritionFacts> instances = new HashMap<>();

    public static NutritionFacts createNutritionFacts(NutritionFactsInterface nutritionFactsInterface) {
        int hashCode = getHashCode(nutritionFactsInterface);
        if (hasNutritionFacts(hashCode)) {
            return instances.get(hashCode);
        }
        return createNutritionFactsAndReturn(hashCode, createNutritionFactsInstance(nutritionFactsInterface));
    }

    private static int getHashCode(NutritionFactsInterface nutritionFacts) {
        return Objects.hash(nutritionFacts.getServingSize(), nutritionFacts.getServings(), nutritionFacts.getCalories(),
                nutritionFacts.getFat(), nutritionFacts.getSodium(), nutritionFacts.getCarbohydrate());
    }

    private static boolean hasNutritionFacts (int hashCode) {
        return instances.containsKey(hashCode);
    }

    private static NutritionFacts createNutritionFactsInstance(NutritionFactsInterface nutritionFacts){
        return new NutritionFacts(nutritionFacts.getServingSize(), nutritionFacts.getServings(), nutritionFacts.getCalories(),
                nutritionFacts.getFat(), nutritionFacts.getSodium(), nutritionFacts.getCarbohydrate());
    }

    private static NutritionFacts createNutritionFactsAndReturn (int hashCode, NutritionFacts nutritionFacts){
        instances.put(hashCode, nutritionFacts);
        return nutritionFacts;
    }
}
