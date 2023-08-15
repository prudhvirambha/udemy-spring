package com.udemy.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuicksortAlgo implements SortAlgorithm {
    public int[] sort(int[] numbers){
        //Logic for Quick Sort
        return numbers;
    }
}
