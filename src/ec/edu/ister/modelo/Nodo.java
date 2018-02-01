package ec.edu.ister.modelo;

/**
 *
 * @author Andres
 */
public class Nodo {
    
    float dato;
    Nodo enlace;
  
    public Nodo(float dato){
        this.dato=dato;
        this.enlace=null;
    }
    
    public Nodo(float dato, Nodo enlace){
        this.dato=dato;
        this.enlace=enlace;
    }

    public float getDato() {
        return dato;
    }
    public Nodo getEnlace() {
        return enlace;
    }
    
    public void setDato(float dato) {
        this.dato = dato;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }

}