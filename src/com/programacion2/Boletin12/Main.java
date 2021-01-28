package com.programacion2.Boletin12;

public class Main {
    public static void main(String[] args) {


        Coches coche1 = new Coches("re7894b");
        Garaje cliente1 = new Garaje(coche1);
        cliente1.comprovarSitio(coche1);
        cliente1.calculaPrecioTiempo();

        Coches coche2 = new Coches("6548fds");
        Garaje cliente2 = new Garaje(coche2);
        cliente2.comprovarSitio(coche2);
        cliente2.calculaPrecioTiempo();

        Coches coche3 = new Coches("26sd15d");
        Garaje Cliente3 = new Garaje(coche3);
        Cliente3.comprovarSitio(coche3);
        Cliente3.calculaPrecioTiempo();

        Coches coche4 = new Coches("5jyf159");
        Garaje cliente4 = new Garaje(coche4);
        cliente4.comprovarSitio(coche4);
        cliente4.calculaPrecioTiempo();

        Coches coche5 = new Coches("ty26d84");
        Garaje cliente5 = new Garaje(coche5);
        cliente5.comprovarSitio(coche5);
        cliente5.calculaPrecioTiempo();


        Coches coche6 = new Coches("uki1546");
        Garaje cliente6 = new Garaje (coche6);
        cliente6.comprovarSitio(coche6);
        cliente6.calculaPrecioTiempo();




    }

}
