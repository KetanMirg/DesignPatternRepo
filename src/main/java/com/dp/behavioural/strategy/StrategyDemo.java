package com.dp.behavioural.strategy;

public class StrategyDemo {

    public static void main(String[] args) {
        EmployeesTransformer employeesTransformer = new EmployeesTransformer();
        employeesTransformer.transform();

        employeesTransformer.setSorter(new QuickSort());
        employeesTransformer.transform();

        String str = "123,345  468,    143 ";
        System.out.println(str.split(",|\\s+").length);
        for(String s : str.split("\\s+|,") ){
            System.out.println(s);
        }
        System.out.println("Value-> " + Math.signum(-3));


    }
}
