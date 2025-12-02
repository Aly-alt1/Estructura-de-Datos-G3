package mx.edu.uttt.listasEnlazadas.simples;

import org.w3c.dom.ls.LSOutput;

public class TestListaSimple {
    public static void main (String[] args){
        iniciar();
    }
    public static void iniciar(){

        ListaSimple lista1 = new ListaSimple();
        lista1.insertarAlFinal(9);
        lista1.insertarAlFinal(78);
        lista1.insertarAlFinal(5);
        lista1.insertarAlFinal(20);

        System.out.println("lista desordenada");
        lista1.imprimir();

        System.out.println("==============");
        System.out.println("Lista ordenada");
        lista1.bublueSortAsc();
        lista1.imprimir();

        System.out.println("\n Eliminar del frente");
        int valor = lista1.eliminarDelFrente();
        lista1.imprimir();
        System.out.println("el valor eliminado es: " + valor);

        System.out.println("\n Elemento buscar");
        int posicion = lista1.busquedaSecuencial(20);
        String salida =(posicion ==-1? "El elemenyo no de en la lista": "El elemnto esta en la posicion" +posicion);

        System.out.println(salida);
    }

}
