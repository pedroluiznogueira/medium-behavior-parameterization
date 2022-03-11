package com.github.pedroluiznogueira.behaviorparameterization.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Chocolate {
    private String type;
    private Integer weight;
}
