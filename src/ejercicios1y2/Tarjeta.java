package ejercicios1y2;

public class Tarjeta {
    private static final String TIPO_TARJETA = "5555";
    private static int cont;
    private Cuenta cuentaAsociada;
    private double limite;
    private double saldo;
    private String numTarjeta;
    private String titular;

    //contructor con cuenta + limite

    //contructor con cuenta + limite + titular

    //getters
    public String getTitular(){return titular;}
    public String getNumTarjeta(){return numTarjeta;}
    public double getSaldo(){return saldo;}
    public double getLimite(){return limite;}
    public Cuenta getCuentaAsociada(){return cuentaAsociada;}

    //setters

    //métodos funcionales - extraerCredito, extraerDebito, liquidacion

    //toString
    public String toString(){
        return "Tarjeta: " + numTarjeta +
                " del titular: " + titular +
                " con saldo: " + saldo +
                " y límite: " + limite +
                ". \nCuenta asociada: " + cuentaAsociada.toString();
    }

}
