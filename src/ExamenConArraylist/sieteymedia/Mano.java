package ExamenConArraylist.sieteymedia;

public class Mano extends Baraja implements ManoInterface {

    private Carta[] mano;

    public Mano() {
        mano = new Carta[10];
    }

    @Override
    public void anadeCarta(Carta carta) {
        boolean cartaAñadida = true;
        for(int i = 0; i<mano.length && cartaAñadida; i++){
            if(mano[i] == null){
                mano[i] = carta;
                cartaAñadida = false;
            } 
        }
        cartaAñadida = true;
    }

    @Override
    public Carta[] getCartas() {
        return mano;
    }
}
