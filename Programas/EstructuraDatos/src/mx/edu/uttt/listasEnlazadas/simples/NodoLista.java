package mx.edu.uttt.listasEnlazadas.simples;

public class NodoLista {

    public int dato;
    public NodoLista sigNodo;//autoreferenciada


    public NodoLista (int dato){

       this(dato, null);
    }

    //sobrecarga de lista
    public NodoLista(int dato, NodoLista nodo){
        this.dato = dato;
        this.sigNodo= nodo;
    }


    public int getDato(){
        return this.dato;
    }

    public NodoLista getSigNodo(){
        return this.sigNodo;
    }


}
