package com.company.comparators;

import com.company.model.Worker;

import java.util.Comparator;

public class CompareByAge {

    public static final Comparator<Worker> getComparator() {
        return new Comparator<Worker>() {
            @Override
            public int compare(Worker o1, Worker o2) {
                return o1.getAge() - o2.getAge();
            }
        };
    }
}
