package com.company.database;

import com.company.comparators.CompareByAge;
import com.company.comparators.CompareByName;
import com.company.comparators.CompareBySalary;
import com.company.model.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DataBase {

    List<Worker> workers;

    public DataBase() {
        workers = new ArrayList<>();
    }

    public DataBase(List<Worker> workers) {
        this.workers = workers;
    }

    public void create(Worker worker) {
        workers.add(worker);
    }

    public Worker read(int workerIndex) {
        return workers.get(workerIndex);
    }

    public void update(int workerIndex, Worker worker) {
        Worker tmp = workers.get(workerIndex);
        workers.remove(workerIndex);
        tmp.setName(worker.getName());
        tmp.setAge(worker.getAge());
        tmp.setSalary(worker.getSalary());
        workers.add(workerIndex, tmp);
    }

    public void delete(int workerIndex) {
        workers.remove(workerIndex);
    }

    public void sortByName(){
        sort(CompareByName.getComparator());
    }

    public void sortByAge(){
       sort(CompareByAge.getComparator());
    }

    public void sortBySalary(){
        sort(CompareBySalary.getComparator());
    }

    private void sort(Comparator<Worker> comparator){
        Collections.sort(workers, comparator);
    }

    public void showWorkers(){
        for (Worker worker: workers
             ) {
            System.out.println(worker);
        }
    }

}
