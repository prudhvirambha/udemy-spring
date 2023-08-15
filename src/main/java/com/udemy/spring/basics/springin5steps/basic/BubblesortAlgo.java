package com.udemy.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubblesortAlgo implements  SortAlgorithm{
    public int[] sort(int[] numbers){
        //Logic for bubble sort
        return numbers;
    }
}
