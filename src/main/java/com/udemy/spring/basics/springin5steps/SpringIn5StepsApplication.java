package com.udemy.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class SpringIn5StepsApplication {

	//What are the beans @Component
	//What are the dependencies of a bean @Autowired
	//Where to search for beans => No need because of @SpringBootApplication


	public static void main(String[] args) {

		//BinarySearchImpl binarySearch=new BinarySearchImpl(new BubblesortAlgo());
		//Application context will maintain the beans
		ApplicationContext applicationContext =
				SpringApplication.run(SpringIn5StepsApplication.class, args);
		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);
		//Requesting same bean
		BinarySearchImpl binarySearch1 =
				applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1); //Prints same output as above
		//Which means we will get same instance for both (Singleton) so bean scope is singleton by default
		int result=binarySearch.binarySearch(new int[] {12,14,2,14},3);
		System.out.println(result);
	}

}
