package com.github.pedroluiznogueira.behaviorparameterization.filter;

import com.github.pedroluiznogueira.behaviorparameterization.domain.Chocolate;

import java.util.function.Predicate;

public class DarkChocolateFilter<T> implements Predicate<T> {

    @Override
    public boolean test(T t) {
        Chocolate chocolate = (Chocolate) t;
        return chocolate.getType().equals("dark");
    }
}
