package com.assignment.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {
     //what are beans?
	//what are dependencies of beans?
	//where to search for bean
	public static void main(String[] args) {
//Tight Coupling
     //BinarySearchImpl binarySearch = new BinarySearchImpl(new BubbleSort());
	//int result = binarySearch.binarySearch(new int[] {12,4,6},3);
		//System.out.println("-->> "+result);
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {12,4,6},3);
		System.out.println("-->>"+result);

	}

}
