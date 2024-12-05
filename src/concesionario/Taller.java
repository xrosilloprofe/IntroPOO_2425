package concesionario;

import java.util.Arrays;

public class Taller {

    private String nombre;
    private int numVehiculos;
    private Vehiculo[] vehiculos;

    public Taller(String nombre){
        this.nombre = nombre;
        this.vehiculos = new Vehiculo[10];
        this.numVehiculos = 0;
    }

    public String getNombre(){ return nombre;}
    public Vehiculo[] getVehiculos(){ return vehiculos;}
    public int getNumVehiculos() {return numVehiculos;}

    public void setNombre(String nombre){this.nombre = nombre;}

    public void addVehiculo(Vehiculo vehiculo){
        if(numVehiculos<vehiculos.length){
            vehiculos[numVehiculos] = vehiculo;
            numVehiculos++;
        }
    }

//    public void cambioColor(String color, Vehiculo vehiculo){
//        for(Vehiculo coche:vehiculos){
//            if(coche.equals(vehiculo))
//                coche.setColor(color);
//        }
//    }

   @Override
    public String toString(){
        return "Taller: " + nombre + " vehiculos: " + Arrays.toString(vehiculos);
    }


}
