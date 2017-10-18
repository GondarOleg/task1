package com.company.comparators;

import com.company.model.Worker;

import java.util.Comparator;

public class CompareBySalary {

    public static final Comparator<Worker> getComparator() {
        return new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                System.out.println("Sorting by salary!");
                return (int) (o1.getSalary() - o2.getSalary());
            }
        };
    }
}
