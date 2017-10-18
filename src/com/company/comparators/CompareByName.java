package com.company.comparators;

import com.company.model.Worker;

import java.util.Comparator;

public class CompareByName {

    public static final Comparator<Worker> getComparator(){
        return new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                System.out.println("Sorting by name!");
                return o1.getName().compareTo(o2.getName());
            }
        };
    }
}
