package io.robusta.animals.food;

import io.robusta.HasPrice;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.*;
import java.util.List;

public class Meal extends ArrayList<Ingredient> implements Collection<Ingredient> {

    public Meal(Ingredient... ingredients) {
        for (Ingredient current : ingredients) {
            this.add(current);
        }
    }

    public int getNutriments() {
        List<Ingredient> meal = this;
        int nutr = 0;
        for (Ingredient ingredient : meal) {
            nutr = nutr + ingredient.getNutriment();
        }
        return nutr;
    }

    public int getPrice() {

        int prix = 0;
        for (HasPrice ingredient : this) {
            prix = prix + ingredient.getPrice();
        }

        return prix;

    }

    public Ingredient cheapest(){
        TreeSet<Ingredient> ingredients = new TreeSet<>();
        ingredients.addAll(this);
        return ingredients.first();
    }
}
