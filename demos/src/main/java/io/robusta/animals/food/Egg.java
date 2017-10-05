package io.robusta.animals.food;

import io.robusta.HasPrice;

public class Egg implements Nutriment, Ingredient{

    int nutriment = 5;

    @Override
    public int getNutriment() {
        return nutriment;

    }

    @Override
    public int getPrice() {
        return 3;
    }
}
