package ec.edu.ister.modelo;

/**
 *
 * @author Andres
 */
public class Lista {
    Nodo inicio;
    Nodo fin;
  
    public Lista() {
        inicio=null;
        fin=null;
    }
    
    public void agregarNodoAlInicio(int dato){
         Nodo nuevo=new Nodo(dato);
         nuevo.setEnlace(inicio);
         inicio=nuevo;
         if(fin==null)
             fin=nuevo;
    }
  
    public void agregarNodoAlFinal(int dato){
        Nodo nuevo=new Nodo(dato);
        if(fin!=null){
            fin.setEnlace(nuevo);
            fin=nuevo;
        }
        else{
            fin=nuevo;
            inicio=nuevo;
        }
    }
    public void recorreLista(){
        Nodo aux=inicio;
        while(aux!=null){
            System.out.println(aux.getDato());
            aux=aux.getEnlace();
        }
    }
    public void eliminarNodos(int numero){
        if(inicio!=null){
            if(inicio.getDato()!=numero){
                inicio=fin=null;
            }
            else if((inicio==fin)&&(inicio.getDato()!=numero)){
                inicio=inicio.getEnlace();
            }
            else{
                Nodo anterior=inicio;
                Nodo siguiente=inicio.getEnlace();
                while((siguiente!=null)&&(siguiente.getDato()!=numero)){
                    anterior=siguiente;
                    siguiente=siguiente.getEnlace();
                }
                if(siguiente!=null){
                    anterior.setEnlace(siguiente.getEnlace());
                    if(siguiente==fin){
                        fin=anterior;
                    }
                }
            }
        }
    }
}