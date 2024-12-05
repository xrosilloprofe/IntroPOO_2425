package ejercicios8y9;

public class Punto {
    //atributos
    private int x;
    private int y;

    //constructor
    public Punto(){
        this.x = 0;
        this.y = 0;
    }

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }

    //getters
    public int getX(){return x;}
    public int getY(){return y;}

    //métodos funcionales
    public void moverArriba(int distancia){
        this.y += distancia;
    }
    public void moverAbajo(int distancia){
        this.y -= distancia;
    }
    public void moverDerecha(int distancia){
        this.x += distancia;
    }
    public void moverIzquierda(int distancia){
        this.x -= distancia;
    }

    public Punto nuevoPuntoArriba(int distancia){
        return new Punto(x,y+distancia);
    }
    public Punto nuevoPuntoAbajo(int distancia){
        return new Punto(this.x,this.y-distancia);
    }
    public Punto nuevoPuntoIzquierda(int distancia){
        return new Punto(this.x-distancia,this.y);
    }
    public Punto nuevoPuntoDerecha(int distancia){
        return new Punto(this.x+distancia,this.y);
    }

    public double distancia(Punto puntoDestino){
        return Math.sqrt(Math.pow(puntoDestino.getX()-this.x,2)+
                Math.pow(puntoDestino.getY()-this.y,2));
    }

    //sobreescribir métodos Object
    @Override
    public String toString(){
        return "("+x+","+y+")";
    }
}
