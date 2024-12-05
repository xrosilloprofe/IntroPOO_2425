import concesionario.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo cochePau = new Vehiculo("Porche","Ipace","Gris","4444PPP",true);

        cochePau.bajarMarcha();
        cochePau.bajarMarcha();

        System.out.println(cochePau.getNumMarcha());

    }
}
