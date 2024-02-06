package ExamenConArraylist.sieteymedia;

import java.util.ArrayList;
import java.util.List;

public class Baraja implements BarajaInterface {

    private List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<Carta>();
        nuevaBaraja();
    }

    @Override
    public void nuevaBaraja() {
        for (int i = 0; i < cartas.length; i++) {
            if(cartas[i]==null){
                cartas[i] = new Carta(i);
            }
        }
    }


    @Override
    public Carta extraerCarta() {
        if (cartas.length > 0) {
            Carta cartaExtraida = cartas[0];
            Carta[] barajaAux = new Carta[cartas.length-1];
            for(int i = 0; i<cartas.length-1; i++){
                barajaAux[i] = cartas[i+1];
            }
            cartas = barajaAux;
            return cartaExtraida;
        } else {
            System.out.println("La baraja está vacía");
            return null;
        }
    }

    @Override
    public String toString() {
        for (int i = 0; i < 40; i++) {
            System.out.printf("%s, ", extraerCarta());
        }
        return "";
    }
}
