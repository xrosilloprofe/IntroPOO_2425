package ejercicios8y9;

public class Geometria {
    public static void main(String[] args) {
        Punto origen = new Punto(5,5);
        System.out.println(origen);
        Punto destino = origen.nuevoPuntoArriba(10);
        destino.moverIzquierda(5);

        System.out.println(destino);
        System.out.println(destino.distancia(origen));

        Segmento linea = new Segmento(origen,destino);
        linea.moverIzquierda(20);
        System.out.println(linea);

    }
}
