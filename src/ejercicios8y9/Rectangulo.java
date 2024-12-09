package ejercicios8y9;

public class Rectangulo {
    //Cuatro puntos
    private Punto inferiorDerecha;
    private Punto inferiorIzquierda;
    private Punto superiorDerecha;
    private Punto superiorIzquierda;

    //Constructor a partir de un punto inferiorIzda y un punto superior derecha
    public Rectangulo(Punto inferiorIzquierda, Punto superiorDerecha){
        this.inferiorIzquierda = inferiorIzquierda;
        this.superiorDerecha = superiorDerecha;
        this.superiorIzquierda =
                inferiorIzquierda.nuevoPuntoArriba(superiorDerecha.getY()- inferiorIzquierda.getY());
        this.inferiorDerecha = new Punto(superiorDerecha.getX(), inferiorIzquierda.getY());
    }

    //constructor a partir de punto inferior izquierda, base y altura
    public Rectangulo(Punto inferiorIzquierda, int base, int altura){
        this.inferiorIzquierda = inferiorIzquierda;
        this.inferiorDerecha = inferiorIzquierda.nuevoPuntoDerecha(base);
        this.superiorIzquierda = new Punto(inferiorIzquierda.getX(), inferiorIzquierda.getY()+altura);
        this.superiorDerecha = inferiorDerecha.nuevoPuntoArriba(altura);
    }

    // métodos para obtener base y altura
    public int obtenerBase(){
        return (int)(superiorIzquierda.distancia(superiorDerecha));
    }

    public int obtenerAltura(){
        return (int)(superiorIzquierda.distancia(inferiorIzquierda));
    }

    //método para calcular el perímetro
    public int obtenerPerimetro(){
        return 2*(obtenerAltura()+obtenerBase());
    }

    //sobreescribir toString
    @Override
    public String toString(){
        return inferiorIzquierda.toString() + " " + inferiorDerecha.toString() + " "
                + superiorIzquierda.toString() + " " + superiorDerecha.toString();
    }
}
