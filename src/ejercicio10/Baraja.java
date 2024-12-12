package ejercicio10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Baraja {
    private Carta[] cartas;
    private Palo palo;

    public Baraja(){
        int cont=0;
        cartas = new Carta[10*4];
        for (Palo palo:Palo.values()){
            for (int i = 1; i < 11; i++) {
                cartas[cont++] = new Carta(palo,i);
            }
        }
        barajar();
    }

    private void barajar(){
        List<Carta> cartaList =Arrays.asList(cartas);
        Collections.shuffle(cartaList);
        cartaList.toArray(cartas);
    }

    public Carta repartirEncima(){
        Carta carta = null;
        if(cartas.length>0){
            carta = cartas[0];
            cartas = Arrays.copyOfRange(cartas,1,cartas.length);
        }
        return carta;
    }

    public Carta repartirDebajo(){
        Carta carta = null;
        if(cartas.length>0){
            carta = cartas[cartas.length-1];
            cartas = Arrays.copyOfRange(cartas,0,cartas.length-1);
        }
        return carta;
    }

    @Override
    public String toString() { return Arrays.toString(cartas);}


}
