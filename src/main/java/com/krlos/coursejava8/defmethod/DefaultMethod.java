package com.krlos.coursejava8.defmethod;

public class DefaultMethod implements Persona {
    @Override
    public void caminar() {
        System.out.println("puedo caminar");
    }

    public static void main(String[] args) {
        DefaultMethod app = new DefaultMethod();
        app.caminar();
        app.hablar();
    }
}
