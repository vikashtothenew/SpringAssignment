package com.assignment.spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
    @Autowired
    private SortAlgorithm sortAlgorithm;
    public BinarySearchImpl(SortAlgorithm sortAlgorithm){
        super();
        this.sortAlgorithm=sortAlgorithm;
    }
    public int binarySearch(int [] numbers, int numberToSearchFor){

        int [] sortedNumbers = sortAlgorithm.sort(numbers);
        //implementing Sorting Logic
        //bubble sort
        //quick sort
        System.out.println(sortAlgorithm);
        return 5;
    }
}
