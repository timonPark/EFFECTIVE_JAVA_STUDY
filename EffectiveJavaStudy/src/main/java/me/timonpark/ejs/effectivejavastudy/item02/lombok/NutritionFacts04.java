package me.timonpark.ejs.effectivejavastudy.item02.lombok;

import lombok.Builder;
import lombok.Getter;
import me.timonpark.ejs.effectivejavastudy.item02.base.NutritionFactsInterface;

@Builder
@Getter
public class NutritionFacts04 implements NutritionFactsInterface {
    private final int servingSize; // (ml, 1회 제공량) 필수
    private final int servings; // (회, 총 n회 제공량) 필수
    private final int calories; // (1회 제공량당) 선택
    private final int fat; // (g/1회 제공량) 선택
    private final int sodium; // (mg/1회 제공량) 선택
    private final int carbohydrate; // (g/1회 제공량) 선택
}
