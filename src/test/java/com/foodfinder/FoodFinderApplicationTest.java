package com.foodfinder;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FoodFinderApplicationTest {
    @Test
    public void shouldReturnRecipeWhenUserGaveFiveCorrectIngredients() {
        FoodFinderDto result = new FoodFinderApplicationStarter().start();

        assertThat(result.message()).isEqualTo("success");
        assertThat(result.recipe()).isEqualTo("jajecznicaa");
    }
    @Test
    public void shouldReturnErrorMessageWhenUserGaveLessThanFiveCorrectIngredients() {
        FoodFinderDto result = new FoodFinderApplicationStarter().start();
    }
    @Test
    public void shouldReturnErrorMessageWhenUserGaveMoreThanFiveCorrectIngredients() {
        FoodFinderDto result = new FoodFinderApplicationStarter().start();
    }

}
