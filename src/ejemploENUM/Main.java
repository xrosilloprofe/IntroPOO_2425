package ejemploENUM;

public class Main {
    public static void main(String[] args) {
        DiaSemana dia;
        dia = DiaSemana.SABADO;

        //el metodo para mostrar el orden es .ordinal()
        System.out.println(dia.ordinal());
        if(dia == DiaSemana.SABADO || dia == DiaSemana.DOMINGO)
            System.out.println("fin de semane");
        else
            System.out.println(" trabajar");

        int tamaño = DiaSemana.values().length;
        DiaSemana primerDia = DiaSemana.values()[0]; //.values() --> DiaSemana[]
        //el enum funciona como un array --> .values()
        for(DiaSemana dia1:DiaSemana.values())
            System.out.println(dia1);


        Meses mesActual = Meses.DICIEMBRE;
        Meses mesPasado = Meses.NOVIEMBRE;

        System.out.println(mesActual.getNumDia());
        System.out.println(mesActual);
        System.out.println(mesPasado.mesSiguiente());
        System.out.println(mesActual.mesSiguiente());

    }
}
