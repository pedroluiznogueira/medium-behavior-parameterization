package com.github.pedroluiznogueira.behaviorparameterization;

import com.github.pedroluiznogueira.behaviorparameterization.domain.Chocolate;
import com.github.pedroluiznogueira.behaviorparameterization.service.ChocolateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class BehaviorParameterizationApplication {

	public static void main(String[] args) {
		// SpringApplication.run(BehaviorParameterizationApplication.class, args);

		Chocolate chocoOne = new Chocolate("dark", 100);
		Chocolate chocoTwo = new Chocolate("white", 200);
		Chocolate chocoThree = new Chocolate("bitter", 300);
		Chocolate chocoFour = new Chocolate("bitter", 400);

		List<Chocolate> chocos = List.of(chocoOne, chocoTwo, chocoThree, chocoFour);

		List<Chocolate> bitterChocolates = ChocolateService.filterBitterChocolates(chocos);
		bitterChocolates.forEach(System.out::println);
	}

}
