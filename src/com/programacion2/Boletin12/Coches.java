package com.programacion2.Boletin12;

public class Coches {

    private String matricula;

    public Coches() {
    }

    public Coches(String matricula) {
        this.matricula = matricula;
    }


    @Override
    public String toString() {
        return "matrícula  " + matricula;
    }


}


