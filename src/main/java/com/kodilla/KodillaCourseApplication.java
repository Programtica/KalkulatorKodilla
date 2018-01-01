package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KodillaCourseApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(KodillaCourseApplication.class, args);
		Calculator calculator = new Calculator();

		float sum = calculator.sumOfNumbers(5.25f, 0.5f);
		System.out.println(sum);

		float subtract = calculator.subtractOfNumbers(0.25f, 4.75f);
		System.out.println(subtract);
	}
}
