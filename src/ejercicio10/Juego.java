package ejercicio10;

public class Juego {
    public static void main(String[] args) {
        Baraja española = new Baraja();
        System.out.println(española);

        for (int i = 0; i < 50; i++) {
            System.out.println(española.repartirDebajo());
        }
    }
}
