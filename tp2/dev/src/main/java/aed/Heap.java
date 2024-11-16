package aed;

import java.util.ArrayList;

public class Heap<T> {
    
    ArrayList<T> heap;

    public Heap (ArrayList<T> arr, int lon){
        this.heap = new ArrayList<T>();
        for (int i=0;i<lon;i++){
            this.heap.add(arr.get(i));
        }
        ordenInicial();
    }

    public void ordenInicial(){

    }

    public void agregar(T obj){

    }

    public void borrar(int indice){

    }

    public T raiz(){
        return this.heap.get(0);
    }

}
// public class ComparadorTiempo implements Comparator<CaballoDeCarrera>{
// @Override
// public int compare(CaballoDeCarrera cab1, CaballoDeCarrera cab2){
// return Integer.compare(cab1.carrerasGanadas,
// cab2.carrerasGanadas);
// }
//}


//Comparator<CaballoDeCarrera> CarrerasComparator = Comparator.comparing(CaballoDeCarrera::carrerasGanadas);
















