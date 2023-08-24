package com.udemy.spring.basics.springin5steps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

import com.udemy.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	//What are the beans @Component
	//What are the dependencies of a bean @Autowired
	//Where to search for beans => No need because of @SpringBootApplication


	public static void main(String[] args) {

		//BinarySearchImpl binarySearch=new BinarySearchImpl(new BubblesortAlgo());
		//Application context will maintain the beans
		ApplicationContext applicationContext =
				new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplication.class);
				//SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearch =
				applicationContext.getBean(BinarySearchImpl.class);

//		BinarySearchImpl binarySearch1 =
//				applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		//System.out.println(binarySearch1); //Prints different output
		//We are requesting prototype bean
		int result=binarySearch.binarySearch(new int[] {12,14,2,14},3);
		System.out.println(result);
		
		((ConfigurableApplicationContext) applicationContext).close();
		
	}

}
