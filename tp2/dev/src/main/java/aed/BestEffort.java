package aed;

import java.util.ArrayList;

public class BestEffort {
    
    ArrayList<Ciudad> listaCiudades;
    Heap<Cajita> trasladosPorTiempos;
    Heap<Cajita> trasladosPorGanancia;
    Heap<Ciudad> ciudadesPorSuperavit;
    ArrayList<Integer> idsMaximaGanancia;
    ArrayList<Integer> idsMaximaPerdida;

    int gananciaAcumulada;
    int trasladosDespachados;
    int cantidadTraslados;
    int maximaPerdida;
    int maximaGanancia;

    public BestEffort(int cantCiudades, Traslado[] traslados){      //O(|C| + |T |)

        this.gananciaAcumulada = 0;
        this.trasladosDespachados = 0;
        this.cantidadTraslados = traslados.length;

        this.listaCiudades = new ArrayList<>();
        for (int i=0;i<cantCiudades;i++){                   //creacion listas
            //ciudades.append(new ciudad(id=i))
        }
        
        ArrayList<Cajita> listaAux = new ArrayList<>();
        for (int i=0;i<this.cantidadTraslados;i++){
            //listaAux.append(new Cajita(traslados[i],pos=i))
        }
        this.trasladosPorGanancia = new Heap<Cajita>(listaAux, this.cantidadTraslados);     //creacion heaps
        this.trasladosPorTiempos = new Heap<Cajita>(listaAux, this.cantidadTraslados);
        this.ciudadesPorSuperavit = new Heap<Ciudad>(listaCiudades, cantCiudades);


    }

    public void registrarTraslados(Traslado[] traslados){           //O(|traslados| log(|T |))
        for (int i=0;i<traslados.length;i++){
            Cajita nuevo = new Cajita(traslados[i],i);
            this.trasladosPorGanancia.agregar(nuevo);
            this.trasladosPorTiempos.agregar(nuevo);
            this.cantidadTraslados += 1;
        }
    }

    public int[] despacharMasRedituables(int n){                    //O(n (log(|T |) + log(|C|)))
        int[] ids = new int[n];
        for (int i=0;i<n;i++){
            Cajita raiz = new Cajita(this.trasladosPorGanancia.raiz());
            ids[i] = raiz.devuelveId();
            //chequeos
            //this.trasladosPorGanancia.borrar(0)
        }
        return ids;
    }

    public int[] despacharMasAntiguos(int n){                       //O(n (log(|T |) + log(|C|)))
        int[] ids = new int[n];
        return ids;
    }

    public int ciudadConMayorSuperavit(){
        return this.ciudadesPorSuperavit.raiz().devuelveId();
    }

    public ArrayList<Integer> ciudadesConMayorGanancia(){
        return this.idsMaximaGanancia;
    }

    public ArrayList<Integer> ciudadesConMayorPerdida(){
        return this.idsMaximaPerdida;
    }

    public int gananciaPromedioPorTraslado(){
        return this.gananciaAcumulada/this.cantidadTraslados;
    }
    
}
