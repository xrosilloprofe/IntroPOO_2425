package ejercicios1y2;

public class Tarjeta {
    private static final String TIPO_TARJETA = "5555";
    private static int cont;
    //Atributos
    private Cuenta cuentaAsociada;
    private double limite;
    private double cargos;
    private String numTarjeta;
    private String titular;

    //contructor con cuenta + limite
    public Tarjeta(Cuenta cuenta, double limite){
        this.cuentaAsociada = cuenta;
        this.limite = limite;
        this.titular = cuenta.getTitular();
        this.numTarjeta = TIPO_TARJETA+cont++;
        this.cargos = 0;
    }

    //contructor con cuenta + limite + titular
    public Tarjeta(Cuenta cuenta, double limite, String titular){
        this(cuenta, limite);
        this.titular = titular;
    }

    //getters
    public String getTitular(){return titular;}
    public String getNumTarjeta(){return numTarjeta;}
    public double getCargos(){return cargos;}
    public double getLimite(){return limite;}
    public Cuenta getCuentaAsociada(){return cuentaAsociada;}

    //setters
    public void setLimite(double limite) {
        this.limite = limite;
    }

    //métodos funcionales - extraerCredito, extraerDebito, liquidacion
    public boolean extraerDebito(double importe){
        return cuentaAsociada.reintegro(importe);
    }

    public boolean extraerCredito(double importe){
        if(importe<0 || importe>(limite-cargos))
            return false;
        cargos += importe;
        return true;
    }

    public boolean liquidacion(){
        if(cuentaAsociada.reintegro(cargos)){
            cargos = 0;
            return true;
        }
        return false;
    }

    //toString
    public String toString(){
        return "Tarjeta: " + numTarjeta +
                " del titular: " + titular +
                " con saldo: " + cargos +
                " y límite: " + limite +
                ". \nCuenta asociada: " + cuentaAsociada.toString();
    }

}
