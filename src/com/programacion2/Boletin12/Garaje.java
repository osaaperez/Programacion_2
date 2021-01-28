package com.programacion2.Boletin12;

import javax.swing.JOptionPane;

    public class Garaje {
        //tiempo de estacionamiento en el garaje
        private float tiempo;
        //coche que entra en el garaje
        private Coches Coche;
        //cantidad de coches que estan en el garaje
        private static int cantidaCoches;
        //Cantidad maxima de coches que pueden estar en el garaje
        public static final int plazas = 5;


        public Garaje() {
        }

        public Garaje(com.programacion2.Boletin12.Coches coche){
            Coche=coche;
        }


        public Garaje(float tiempo,com.programacion2.Boletin12.Coches coche) {
            this.tiempo = tiempo;
            Coche = coche;
        }


        public void setTiempo(float tiempo) {
            this.tiempo = tiempo;
        }

        public void setCoche(com.programacion2.Boletin12.Coches Coche) {
            this.Coche = Coche;
        }


        public static void setCantidaCoches(int cantidaCoches) {
            Garaje.cantidaCoches = cantidaCoches;
        }



        public float getTiempo() {
            return tiempo;
        }

        public com.programacion2.Boletin12.Coches getCoche() {
            return Coche;
        }

        public static int getCantidaCoches() {
            return cantidaCoches;
        }

        @Override
        public String toString() {
            return "Garaje{" + "\nTiempo:  " + tiempo + " \n, Coche=  " + Coche + '}';
        }

        public void comprovarSitio(Coches coche){
            if(cantidaCoches<=plazas) {
                JOptionPane.showMessageDialog(null,"Plazas disponibles: "+(plazas-cantidaCoches));
                cantidaCoches++;
                JOptionPane.showMessageDialog(null,"vehiculo de "+ Coche + " estaciono en el garaje");

            }else

                JOptionPane.showMessageDialog(null,"Garaje lleno");

        }
        public void calculaPrecioTiempo(){
            float tiempoCoche;
            float precioAparcar = 0.0F;


            if(cantidaCoches < plazas ){

                do{
                    tiempoCoche=Float.parseFloat(JOptionPane.showInputDialog("Tiempo estacionado (en minutos):"));

                    if(tiempoCoche>0 && tiempoCoche <= 180){
                        precioAparcar = 1.5F;
                    }else if (tiempoCoche > 180){
                        precioAparcar =((tiempoCoche -180) / 60 * 0.20F + 1.5F);

                    }else
                        JOptionPane.showMessageDialog(null,"Error");

                }while (tiempoCoche <= 0);
                float dinero=Float.parseFloat(JOptionPane.showInputDialog(null,"Introduce dinero para pagar el estaccionamiento, el precio es de: "+Math.round(precioAparcar*100.0)/100.0+"€"));
                float vuelta =dinero-precioAparcar;

                JOptionPane.showMessageDialog(null,"Factura:\n "+
                        Coche
                        +"\n Tiempo total: "+tiempoCoche+" min \n"+
                        " Precio: "+Math.round(precioAparcar*100.0)/100.0+" €\n"
                        +" Dinero ingresado: "+dinero+" €\n"
                        +" Vuelta: "+ Math.round(vuelta*100.0)/100.0+" €");


            } else

                JOptionPane.showMessageDialog(null," Garaje completo" );

        }


    }
}
