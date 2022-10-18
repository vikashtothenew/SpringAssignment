package com.assignment.spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm {
    public int[] sort(int [] numbers) {
        //logic of Quick sort
        return numbers;
    }
}
