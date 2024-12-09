package ejercicios8y9;

public class Geometria {
    public static void main(String[] args) {
        Punto origen = new Punto(25,25);
        System.out.println(origen);
        Punto destino = origen.nuevoPuntoArriba(10);
        destino.moverDerecha(5);

        System.out.println(destino);
        System.out.println(destino.distancia(origen));

        Segmento linea = new Segmento(origen,destino);
        linea.moverIzquierda(20);
        System.out.println(linea);

        Rectangulo rectangulo1 = new Rectangulo(origen, destino);
        System.out.println(rectangulo1.obtenerPerimetro());
        System.out.println(rectangulo1);

        Rectangulo rectangulo2 = new Rectangulo(destino,50,50);
        System.out.println(rectangulo2.obtenerPerimetro());
        System.out.println(rectangulo2);

    }
}
