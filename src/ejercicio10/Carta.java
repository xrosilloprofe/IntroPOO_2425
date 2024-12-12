package ejercicio10;

public class Carta {
    private Palo palo;
    private int numero;

    public Carta(Palo palo, int numero){
        this.palo = palo;
        this.numero = numero;
    }

    public Palo getPalo(){return palo;}
    public int getNumero(){return numero;}

    @Override
    public String toString(){ return numero+""+palo;}

}

