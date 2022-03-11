package com.github.pedroluiznogueira.behaviorparameterization.service;

import com.github.pedroluiznogueira.behaviorparameterization.domain.Chocolate;
import com.github.pedroluiznogueira.behaviorparameterization.service.implementation.ChocolateDark;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChocolateServiceTest {

    private final Chocolate chocoOne = new Chocolate("dark", 100);
    private final Chocolate chocoTwo = new Chocolate("white", 200);
    private final Chocolate chocoThree = new Chocolate("bitter", 300);
    private final Chocolate chocoFour = new Chocolate("bitter", 400);
    private final Chocolate chocoFive = new Chocolate("milk", 600);
    private final List<Chocolate> chocos = List.of(chocoOne, chocoTwo, chocoThree, chocoFour, chocoFive);
    private final ChocolateDark<Chocolate> predicate = new ChocolateDark<>();

    @Test
    public void filterBitterChocolates() {
        // arrange
        Integer expectedAmountOfChocos = 2;

        // act
        List<Chocolate> bitterChocos = ChocolateService.filterBitterChocolates(chocos);
        Integer actualAmountOfChocos = bitterChocos.size();

        // assert
        assertEquals(expectedAmountOfChocos, actualAmountOfChocos);
    }

    @Test
    public void filterChocolatesByColor() {
        // arrange
        Integer expectedAmountOfChocos = 1;

        // act
        List<Chocolate> bitterChocos = ChocolateService.filterChocolatesByType(chocos, "dark");
        Integer actualAmountOfChocos = bitterChocos.size();

        // assert
        assertEquals(expectedAmountOfChocos, actualAmountOfChocos);
    }

    @Test
    public void filterChocolatesByWeight() {
        // arrange
        Integer expectedAmountOfChocos = 3;

        // act
        List<Chocolate> bitterChocos = ChocolateService.filterChocolatesByWeight(chocos, 200);
        Integer actualAmountOfChocos = bitterChocos.size();

        // assert
        assertEquals(expectedAmountOfChocos, actualAmountOfChocos);
    }

    @Test
    public void filterChocolatesByAnyAttribute_Type() {
        // arrange
        Integer expectedAmountOfChocos = 1;

        // act
        List<Chocolate> bitterChocos = ChocolateService.filterChocolatesByAnyAttribute(chocos, "white", 0, false);
        Integer actualAmountOfChocos = bitterChocos.size();

        // assert
        assertEquals(expectedAmountOfChocos, actualAmountOfChocos);
    }

    @Test
    public void filterChocolatesByAnyAttribute_Weight() {
        // arrange
        Integer expectedAmountOfChocos = 4;

        // act
        List<Chocolate> bitterChocos = ChocolateService.filterChocolatesByAnyAttribute(chocos, "", 100, true);
        Integer actualAmountOfChocos = bitterChocos.size();

        // assert
        assertEquals(expectedAmountOfChocos, actualAmountOfChocos);
    }

    @Test
    public void filterChocolatesWithAbstraction_DarkType() {
        // arrange
        Integer expectedAmountOfChocos = 1;

        // act
        List<Chocolate> bitterChocos = ChocolateService.filterChocolatesWithAbstraction(chocos, predicate);
        Integer actualAmountOfChocos = bitterChocos.size();

        // assert
        assertEquals(expectedAmountOfChocos, actualAmountOfChocos);
    }
}
