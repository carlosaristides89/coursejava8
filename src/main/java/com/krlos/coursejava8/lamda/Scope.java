package com.krlos.coursejava8.lamda;

public class Scope {

    private static double value1;
    private double value2;

    public void probarLocalVariable(){
        double n3 = 3; //el comportamiento de una variable dentro de otro ambito se comporta como final. No va a cambiar el valor.
        Operation op = new Operation() {
            @Override
            public double calculateAverage(double x, double y) {
                return x + y + n3;
            }
        };
    }

    public void probarStaticVariable(){ //se pueden modigificar los atributos declarados sean o no static
        Operation op = new Operation() {
            @Override
            public double calculateAverage(double x, double y) {
                value1 = x;
                value2 = y;
                return value1 + value2;
            }
        };

    }

}
