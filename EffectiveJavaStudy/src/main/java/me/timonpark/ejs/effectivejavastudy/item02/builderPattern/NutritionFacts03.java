package me.timonpark.ejs.effectivejavastudy.item02.builderPattern;

import me.timonpark.ejs.effectivejavastudy.item02.base.NutritionFactsInterface;

public class NutritionFacts03 implements NutritionFactsInterface {
    private final int servingSize; // (ml, 1회 제공량) 필수
    private final int servings; // (회, 총 n회 제공량) 필수
    private final int calories; // (1회 제공량당) 선택
    private final int fat; // (g/1회 제공량) 선택
    private final int sodium; // (mg/1회 제공량) 선택
    private final int carbohydrate; // (g/1회 제공량) 선택

    public static class Builder{
        private final int servingSize; // (ml, 1회 제공량) 필수
        private final int servings; // (회, 총 n회 제공량) 필수

        private int calories = 0; // (1회 제공량당) 선택
        private int fat = 0; // (g/1회 제공량) 선택
        private int sodium = 0; // (mg/1회 제공량) 선택
        private int carbohydrate = 0; // (g/1회 제공량) 선택
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium) {
            this.sodium = sodium;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }

        public NutritionFacts03 build() {
            return new NutritionFacts03(this);
        }
    }

    private NutritionFacts03(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohydrate() {
        return carbohydrate;
    }
}
