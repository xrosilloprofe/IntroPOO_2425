package concesionario;

public class Concesionario {
    public static void main(String[] args) {
        Vehiculo porcheXabi = new Vehiculo("Porche","Cayanne","Negro","5555XXX",false,6);
        porcheXabi.setColor("Rojo");
        System.out.println(porcheXabi.getColor());
        System.out.println(porcheXabi.getModelo());
    }
}
