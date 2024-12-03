package concesionario;

public class Vehiculo {
    //ATRIBUTOS
    private String marca;
    private String modelo;
    private String color;
    private String matricula;
    private int numMarcha;
    private int cantidadMarchas;
    private boolean cambioAutomatico;

    //CONSTRUCTOR
    public Vehiculo(String marca, String modelo, String color,
                    String matricula, boolean cambioAutomatico, int cantidadMarchas){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.cambioAutomatico = cambioAutomatico;
        this.cantidadMarchas = cantidadMarchas;
    }

    public Vehiculo(String marca, String modelo, String color,
                    String matricula, boolean cambioAutomatico){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.cambioAutomatico = cambioAutomatico;
    }

    public Vehiculo(){
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.matricula ="";
        this.cambioAutomatico = false;
    }

    //GETTER
    public String getMarca(){ return marca;}
    public String getModelo() { return modelo;}
    public String getColor() { return color;}
    public String getMatricula() {return matricula;}
    public int getNumMarcha() { return numMarcha;}
    public int getCantidadMarchas() { return cantidadMarchas;}
    public boolean isCambioAutomatico() { return cambioAutomatico;}

    //SETTER
    public void setColor(String color){
        this.color = color;
    }

}
