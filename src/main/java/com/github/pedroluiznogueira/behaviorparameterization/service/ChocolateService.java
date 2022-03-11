package com.github.pedroluiznogueira.behaviorparameterization.service;

import com.github.pedroluiznogueira.behaviorparameterization.domain.Chocolate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

@Service
public class ChocolateService {

    public static List<Chocolate> filterBitterChocolates(List<Chocolate> chocolates) {
        return chocolates.stream().filter(chocolate -> chocolate.getType().equals("bitter")).collect(toList());
    }

    public static List<Chocolate> filterChocolatesByType(List<Chocolate> chocolates, String type) {
        return chocolates.stream().filter(chocolate -> chocolate.getType().equals(type)).collect(toList());
    }

}
