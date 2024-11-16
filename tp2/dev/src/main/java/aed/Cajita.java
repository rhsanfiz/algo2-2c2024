package aed;

public class Cajita {

    Traslado traslado;
    int posTiempo;
    int posGan;

    public Cajita(Traslado tras, int pos){
        this.traslado = tras;
        this.posGan = pos;
        this.posTiempo = pos;
    }
    
    public int devuelveId(){
        return this.traslado.id;
    }
}
