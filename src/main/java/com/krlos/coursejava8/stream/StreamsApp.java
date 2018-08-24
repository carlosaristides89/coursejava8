package com.krlos.coursejava8.stream;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsApp {

    private List<String> list;
    private List<String> number;

    public StreamsApp() {
        list = new ArrayList<>();
        list.add("Lia");
        list.add("Mia");
        list.add("Mauri");
        list.add("Krlos");

        number = new ArrayList<>();
        number.add("1");
        number.add("2");
    }

    public static void notDuplicated() {
        Integer[] elements = new Integer[]{1, 1, 7, 7, 8, 8, 9};
        List<Integer> notDuplicated;

        notDuplicated = Arrays.stream(elements).filter(i -> Collections
                .frequency(Arrays.asList(elements), i) == 1)
                .collect(Collectors.toList());
        System.out.println(notDuplicated.get(0));
    }


    public void filtrar() { //filtrar la cantidad de elementos que comienzan con M
        list.stream().filter(x -> x.startsWith("M")).forEach(System.out::println);
    }

    public void ordenar() {  //ordenarlo de manera descendente  y descendente
        list.stream().sorted().forEach(System.out::println);
        //list.stream().sorted((x,y) -> y.compareTo(x)).forEach(System.out::println);
    }

    public void transformar() {  //map se utiliza para convertir ejemlo convertir elemntos de minusculas a mayusculas.
        /*list.stream().map(String::toUpperCase).forEach(System.out::println);

       /* for (String x : number){ //como antes de java 8 convertir string a int
            int value = Integer.parseInt(x) + 1;
            System.out.println(value);
        }*/
        number.stream().map(x -> Integer.parseInt(x) + 1).forEach(System.out::println);
    }

    public void limitar() {
        list.stream().limit(2).forEach(System.out::println); //limita la cantidad de elementos que voy a recorrer.
    }

    public void contar() {
        long value = list.stream().count();
        System.out.println(value);
    }

    public static void main(String[] args) {
        StreamsApp app = new StreamsApp();
        //app.filtrar();
        //app.ordenar();
        //app.trasformar();
        //app.limitar();
        //app.contar();
        notDuplicated();

    }
}
