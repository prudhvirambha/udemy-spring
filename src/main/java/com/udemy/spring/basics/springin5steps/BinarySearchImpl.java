package com.udemy.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //This will create a new instance
//The above is good practice
public class BinarySearchImpl {

    @Autowired
    @Qualifier("quick")
    private SortAlgorithm sortAlgorithm;

    //below is the constructor injection
//    public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//        super();
//        this.sortAlgorithm = sortAlgorithm;
//    }

    public int binarySearch(int[] numbers, int numberToSearchFor){
        int[] sortedNumbers= sortAlgorithm.sort(numbers);
        System.out.println(sortAlgorithm);
        return 30;
    }
}
