package aed;

public class Ciudad {

    int id;
    int ganancia;
    int perdida;
    int superavit;
    int posSuperavit;

    public Ciudad(int id){
        this.id = id;
        this.ganancia = 0;
        this.perdida = 0;
        this.superavit = 0;
        this.posSuperavit = id;
    }

    public int devuelveId(){
        return this.id;
    }

    public int devuelveGanancia(){
        return this.ganancia;
    }

    public int devuelvePerdida(){
        return this.perdida;
    }

    public int devuelveSuperavit(){
        return this.superavit;
    }

    public int devuelvePosSuperavit(){
        return this.posSuperavit;
    }

    public void registraGanancia(int gan){
        this.ganancia += gan;
        this.superavit += gan;
    }

    public void registraPerdida(int per){
        this.perdida += per;
        this.superavit -= per;
    }

    public void cambiaPosSuperavit(int pos){
        this.posSuperavit = pos;
    }
    
}
