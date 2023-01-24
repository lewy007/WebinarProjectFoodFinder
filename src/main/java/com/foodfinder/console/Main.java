package com.foodfinder.console;

import com.foodfinder.FoodFinderApplicationStarter;
import com.foodfinder.FoodFinderDto;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FoodFinderDto start = new FoodFinderApplicationStarter().start();
        System.out.println(start.recipe());
        System.out.println(start.message());

    }
}