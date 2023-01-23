package com.foodfinder;

import java.util.List;

public class FoodFinderApplicationStarter {
    public void start() {
        FoodFinder foodFinder = new FoodFinder();
        List<String> ingredients = List.of("jajka", "sól", "pieprz");
        foodFinder.createRecipe(ingredients);
        System.out.println("Hello world!");
    }
}
