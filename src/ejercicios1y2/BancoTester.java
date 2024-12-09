package ejercicios1y2;

public class BancoTester {
    public static void main(String[] args) {
        Cuenta angelM = new Cuenta("Àngel M");
        Cuenta andriiL = new Cuenta("Andrii L",100);
        Cuenta pauN = new Cuenta("Pau N", 1000000);
        angelM.ingreso(10000);
        angelM.reintegro(500);
        andriiL.reintegro(10000);
        pauN.transferencia(50000,andriiL);
        pauN.transferencia(50000,angelM);

        System.out.println(angelM);
        System.out.println(andriiL);
        System.out.println(pauN);

    }
}
