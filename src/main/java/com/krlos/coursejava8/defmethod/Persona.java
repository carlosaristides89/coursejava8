package com.krlos.coursejava8.defmethod;

public interface Persona {

    public void caminar();

    //Se utilizan los default method cuando programamos orientado a interfaces y queremos tener comportamientos iguales en clases que implementan estas interfaces.
    default public void hablar(){
        System.out.println("puedo hablar");
    }
}
