package com.udemy.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON) 
//This is changed from prototype to singleton to call predestroy
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
    
    @PostConstruct
    //Will be called after bean construction
    public void postConstruct() {
    	System.out.println("PostConstruct");
    }
    
    @PreDestroy 
    //This will not be called for Prototype 
    //as the these bean life cycle is not completely managed by spring
    public void preDestroy() {
    	System.out.println("PreDestroy");
    }
}
