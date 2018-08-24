package com.krlos.coursejava8.lamda;

import java.util.*;

public class LamdaApp {

    public void ordenar() {
        List<String> list = new ArrayList<>();
        list.add("Mia");
        list.add("Lia");
        list.add("Mauri");
        list.add("Krlos");

        list.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);

        /* JDK 1.7
        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        for(String x : list){
            System.out.println(x);
        }*/
    }

    public void calculate () {
        Operation operation = (double x, double y) -> (x + y) / 2;
        System.out.println(operation.calculateAverage(3, 4));
    }

    public static void main(String[] args) {
        LamdaApp app =  new LamdaApp();
        app.ordenar();
    }


    //Tambien se pueden definir expresiones lamdas entre llaves
    public double calculateOthe(){
        Operation operation = (double x, double y) -> {
            double a = 4;
            System.out.println(a);
            return (x+y)/2 * a;
        };
        return operation.calculateAverage(2,4);
    }

}
