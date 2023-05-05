package me.timonpark.ejs.effectivejavastudy.item02.base;

import java.util.Objects;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class NutritionFacts implements NutritionFactsInterface{
    private final int servingSize; // (ml, 1회 제공량) 필수
    private final int servings; // (회, 총 n회 제공량) 필수
    private final int calories; // (1회 제공량당) 선택
    private final int fat; // (g/1회 제공량) 선택
    private final int sodium; // (mg/1회 제공량) 선택
    private final int carbohydrate; // (g/1회 제공량) 선택
}
