package com.github.pedroluiznogueira.behaviorparameterization.domain;

import com.github.pedroluiznogueira.behaviorparameterization.domain.abstraction.Candy;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cake implements Candy {
    private String flavor;
    private Integer weight;
}
