package ejemploENUM;

public enum Meses {
    ENERO(1,"Enero","ene"),
    FEBRERO(2,"Febrero","feb"),
    MARZO(3,"Marzo","mar"),
    ABRIL(4,"Abril","abr"),
    MAYO(5,"Mayo","may"),
    JUNIO(6,"Junio","jun"),
    JULIO(7,"Julio","jul"),
    AGOSTO(8,"Agosto","ago"),
    SEPTIEMBRE(9,"Septiembre","sep"),
    OCTUBRE(10,"Octubre","oct"),
    NOVIEMBRE(11,"Noviembre","nov"),
    DICIEMBRE(12,"Diciembre","dic");

    private int numDia;
    private String nomMes;
    private String cortoMes;

    Meses(int numDia, String nomMes, String cortoMes){
        this.numDia = numDia;
        this.nomMes = nomMes;
        this.cortoMes = cortoMes;
    }

    public int getNumDia(){ return numDia;}

    public Meses mesSiguiente(){
        return Meses.values()[(this.ordinal()+1)%12];
    }

    @Override
    public String toString(){ return numDia + " " + nomMes + " " + cortoMes;}

}
