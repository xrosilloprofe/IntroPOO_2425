package ejercicio3;

public class ContadorTester {
    public static void main(String[] args) {
        Contador cont1 = new Contador();
        Contador cont2 = new Contador(Contador.RESET_CONTADOR);
        cont1.setCont((int)Math.PI);

        for (int i = 0; i < 5; i++) {
            cont1.incrementar();
            cont2.incrementar();
        }
        cont1.decrementar();
        Contador cont3 = new Contador();
        System.out.println(cont1.getCont());
        System.out.println(cont2.getCont());

    }
}
