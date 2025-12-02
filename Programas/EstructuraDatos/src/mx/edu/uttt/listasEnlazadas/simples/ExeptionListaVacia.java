package mx.edu.uttt.listasEnlazadas.simples;

public class ExeptionListaVacia extends RuntimeException{

    public ExeptionListaVacia(){
        this("lista");
    }
    //constructor con un argumento
    public ExeptionListaVacia (String nombre){
        super(nombre +" esta vacia");
    }


}
