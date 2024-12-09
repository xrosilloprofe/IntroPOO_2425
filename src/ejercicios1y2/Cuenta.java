package ejercicios1y2;

public class Cuenta {
    private static final String CODIGO_CUENTA = "ACME";
    private double saldo;
    private String titular;
    private String numCuenta;
    private static int cont;

    public Cuenta(String titular){
        this.saldo = 50;
        this.titular = titular;
        numCuenta = CODIGO_CUENTA + cont;
        cont++;
    }

    public Cuenta(String titular, double saldo){
        this(titular); //this llama al constructor con parámetro titular
        this.saldo = saldo;
    }

    public String getTitular(){return titular;}
    public double getSaldo(){return saldo;}
    public String getNumCuenta(){return numCuenta;}
    public void setTitular(String titular){this.titular=titular;}

    //ingreso
    public boolean ingreso(double cantidad){
        if(cantidad<0)
            return false;
        saldo += cantidad;
        return true;
    }

    //reintegro
    public boolean reintegro(double cantidad){
        if(cantidad <0 || saldo-cantidad<0)
            return false;
        saldo -= cantidad;
        return true;
    }

    //transferencia
    public boolean transferencia(double cantidad, Cuenta cuentaDestino){
        if(reintegro(cantidad)){
            cuentaDestino.ingreso(cantidad); //porque las condiciones del ingreso están en el reintegro
            return true;
        }
        return false;
    }

    @Override
    public String toString(){
        return "Cuenta: " + numCuenta + " del titular: " + titular + " con saldo: " + saldo;
    }

}
