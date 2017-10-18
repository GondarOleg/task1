package com.company;

import com.company.database.DataBase;
import com.company.model.Worker;

public class Main {

    public static void main(String[] args) {
        DataBase dataBase = new DataBase();
        dataBase.create(new Worker("test", 25, 1500));
        dataBase.create(new Worker("test3", 5, 250));
        dataBase.create(new Worker("test1", 2, 2500));
        dataBase.showWorkers();
        dataBase.sortByAge();
        dataBase.showWorkers();
        dataBase.sortBySalary();
        dataBase.showWorkers();
        dataBase.sortByName();
        dataBase.showWorkers();
        Worker worker = new Worker();
        worker.setName("Updated");
        dataBase.update(1, worker);
        System.out.println(dataBase.read(1));
        dataBase.delete(1);
        dataBase.showWorkers();
    }
}
