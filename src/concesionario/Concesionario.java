package concesionario;

import java.util.Scanner;

public class Concesionario {
    public static void main(String[] args) {
        Vehiculo porcheXabi = new Vehiculo("Porche","Cayanne","Negro","5555XXX",false,6);
        Vehiculo nada = new Vehiculo();

        String cadena = "";

        porcheXabi.setColor("Rojo");
        System.out.println(porcheXabi.getColor());
        System.out.println(porcheXabi.getModelo());

        for (int i = 0; i < 10; i++) {
            porcheXabi.subirMarcha();
        }

        System.out.println(porcheXabi.getNumMarcha());

    }
}
