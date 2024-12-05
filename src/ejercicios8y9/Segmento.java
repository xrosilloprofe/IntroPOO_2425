package ejercicios8y9;

public class Segmento {
    //atributos
    private Punto punto1;
    private Punto punto2;

    //constructor
    public Segmento(){
        this.punto1 = new Punto();
        this.punto2 = new Punto();
    }

    public Segmento(Punto punto1, Punto punto2){
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    //getter
    public Punto getPunto1(){return punto1;}
    public Punto getPunto2(){return punto2;}

    //mover a la vez los puntos
    public void moverArriba(int distancia){
        punto1.moverArriba(distancia);
        punto2.moverArriba(distancia);
    }
    public void moverAbajo(int distancia){
        punto1.moverAbajo(distancia);
        punto2.moverAbajo(distancia);
    }
    public void moverIzquierda(int distancia){
        punto1.moverIzquierda(distancia);
        punto2.moverIzquierda(distancia);
    }
    public void moverDerecha(int distancia){
        punto1.moverDerecha(distancia);
        punto2.moverDerecha(distancia);
    }

    @Override
    public String toString(){
        return punto1.toString() + " - " + punto2.toString();
    }

}
