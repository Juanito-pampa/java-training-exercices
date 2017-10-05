package io.robusta.animals.food;

import io.robusta.HasPrice;

import java.lang.reflect.Array;
import java.time.Clock;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Nicolas on 22/11/2016.
 */
public class FoodApplication {

    public static void main(String[] args) {

        Potato potato = new Potato(10, 5);
        Potato smallPotato = new Potato(5, 4);
        Potato bigPotato = new Potato(20, 7);

        System.out.println(potato);
        System.out.println(smallPotato);
        System.out.println(bigPotato);

        Carrot carrot = new Carrot(1, 1);

        List<Vegetal> vegetals = Arrays.asList(potato, smallPotato, bigPotato, carrot);

        System.out.println(vegetals);

        Egg egg = new Egg();

        List<Nutriment> meal = Arrays.asList(potato, smallPotato, bigPotato, carrot, egg);

        int nutriments = 0;
        for (Nutriment ingredient : meal) {
            nutriments = nutriments + ingredient.getNutriment();
        }
        System.out.println(nutriments);

        List<Calorie> calorieMeal = Arrays.asList(potato, smallPotato, bigPotato, carrot);

        int calories = 0;
        for (Calorie ingredient : calorieMeal) {
            calories = calories + ingredient.getCalorie();
        }
        System.out.println(calories);

        List<HasPrice> prixbouf = Arrays.asList(potato, bigPotato, smallPotato, carrot, egg);

        int price = 0;

        for (HasPrice ingredient : prixbouf) {
            price = price + ingredient.getPrice();

        }
        System.out.println(price);

        IdahoPotato p1 = new IdahoPotato();
        IdahoPotato p2 = new IdahoPotato();
        IdahoPotato p3 = new IdahoPotato();
        IdahoPotato p4 = new IdahoPotato();


        System.out.println("idaho price : " + p1.getPrice());
        System.out.println("idaho price : " + p1.getNutriment());

        Meal today = new Meal(p1, p2, p3, p4, carrot);

        System.out.println(today.getPrice());

    }

}
