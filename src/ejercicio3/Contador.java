package ejercicio3;

/**
 * Ejercicio 3. Crea una clase Contador con los métodos para incrementar y decrementar el
 * contador. La clase contendrá los métodos getters y setters.
 */

public class Contador {
    private static int cont; //static hace que sea un ATRIBUTO DE CLASE
    //private int cont; //sin static hace que sea un ATRIBUTO DEL OBJETO
    public static final int RESET_CONTADOR=7; //CONSTANTE

    public Contador(){
        this.cont = 0;
    }

    public Contador(int cont){
        if(cont > RESET_CONTADOR)
            this.cont = RESET_CONTADOR;
        else
            this.cont = cont;
    }

    public int getCont(){return cont;}
    public void setCont(int cont){
        if(cont > RESET_CONTADOR)
            this.cont = RESET_CONTADOR;
        else
            this.cont = cont;
    }

    public void incrementar(){cont++;}
    public void decrementar(){cont--;}

}
