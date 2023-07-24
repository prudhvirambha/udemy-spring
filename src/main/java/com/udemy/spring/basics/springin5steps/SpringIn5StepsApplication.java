package com.udemy.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {

		BinarySearchImpl binarySearch=new BinarySearchImpl(new QuicksortAlgo());
		int result=binarySearch.binarySearch(new int[] {12,14,2,14},3);
		System.out.println(result);

		//SpringApplication.run(SpringIn5StepsApplication.class, args);
	}

}
