package com.github.pedroluiznogueira.behaviorparameterization.service;

import com.github.pedroluiznogueira.behaviorparameterization.domain.Chocolate;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateServiceTest {

    private final Chocolate chocoOne = new Chocolate("dark", 100);
    private final Chocolate chocoTwo = new Chocolate("white", 200);
    private final Chocolate chocoThree = new Chocolate("bitter", 300);
    private final Chocolate chocoFour = new Chocolate("bitter", 400);
    private final Chocolate chocoFive = new Chocolate("milk", 600);
    private List<Chocolate> chocos = List.of(chocoOne, chocoTwo, chocoThree, chocoFour, chocoFive);

    @Test
    public void filterBitterChocolates() {
        // arrange
        Integer expectedAmountOfBitterChocos = 2;

        // act
        List<Chocolate> bitterChocos = ChocolateService.filterBitterChocolates(chocos);
        Integer actualAmountOfBitterChocos = bitterChocos.size();

        // assert
        assertEquals(expectedAmountOfBitterChocos, actualAmountOfBitterChocos);
    }

    @Test
    public void filterChocolatesByColor() {
        // arrange
        Integer expectedAmountOfBitterChocos = 1;

        // act
        List<Chocolate> bitterChocos = ChocolateService.filterChocolatesByType(chocos, "dark");
        Integer actualAmountOfBitterChocos = bitterChocos.size();

        // assert
        assertEquals(expectedAmountOfBitterChocos, actualAmountOfBitterChocos);
    }

}
