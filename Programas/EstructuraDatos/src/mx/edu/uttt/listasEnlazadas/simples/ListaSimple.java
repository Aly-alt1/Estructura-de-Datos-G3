package mx.edu.uttt.listasEnlazadas.simples;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class ListaSimple {
    private NodoLista primerNodo;
    private NodoLista ultimoNodo;
    private String nombreLista;

    public ListaSimple(){
            this("Mi Listita");
    }

    public ListaSimple(String nombreLista){
        this.nombreLista = nombreLista;
        primerNodo= ultimoNodo=null;//esta vacia porque ambos son nulos

    }

    //insertar alfrente (a la izquieda
    public void insertarAlFrente (int dato){
        if (estaVacia()){
            ultimoNodo= primerNodo= new NodoLista(dato);
        return;
        }
        primerNodo= new NodoLista(dato, primerNodo);//se enlaza con el ultimo nodo


    }

    //


//insertar al final(a la derecha)
    public void insertarAlFinal(int dato){
        if(estaVacia()){
            primerNodo = ultimoNodo = new NodoLista(dato);
        }else{

            ultimoNodo = ultimoNodo.sigNodo = new NodoLista(dato);

        }
    }

   public boolean estaVacia(){
        return primerNodo == null;
   }


   public int eliminarDelFrente ()throws ExeptionListaVacia{
        if(estaVacia()){
            throw new ExeptionListaVacia(this.nombreLista);
        }
        int elementoEliminado = primerNodo.dato;
//verifica si la ista tiene un nodo
       if (primerNodo == ultimoNodo) {
           primerNodo= ultimoNodo = null;
       }else{
           primerNodo=primerNodo.sigNodo;

       }

        return elementoEliminado;
   }


   public int eliminarDelFinal(){
       if(estaVacia()){
           throw new ExeptionListaVacia(this.nombreLista);
       }


        return 0;
   }

   public int busquedaSecuencial(int valorBuscar){
       if(estaVacia()){
           throw new ExeptionListaVacia(this.nombreLista);
       }
       int posicion = -1;
       int contador =0;
       NodoLista aux = primerNodo;

       while(aux!= null){
           contador ++;
           if(aux.dato == valorBuscar){
               posicion = contador;
               break;
           }
          aux = aux.sigNodo;
       }

        return posicion;
   }

    public void busquedaBinaria(int valorBuscar)throws ExeptionListaVacia{
        if(estaVacia()){
            throw new ExeptionListaVacia(this.nombreLista);
        }

        bublueSortAsc();
        int inicio = 0;
        int medio = 0;
        int fin = obtenerTamanio();
        boolean encontrado = false;
        NodoLista aux = primerNodo;
        int contador =0;


        while (inicio < fin){
         medio = (inicio + fin)/2;
         while(contador<= medio){
             aux = aux.sigNodo;
             contador ++;
         }
        contador=0;
         if(aux.dato  ==valorBuscar){
             JOptionPane.showMessageDialog(null,"El numero "+ valorBuscar + "se encuentra en la posicion " +medio);
             encontrado = true;
             break;
         }else if (valorBuscar < aux.dato){
             inicio = medio;
         }

        }



    }


   public void bublueSortAsc(){
       if(estaVacia()){
           JOptionPane.showMessageDialog(null, "La lista esta vacia. No se puede ordenar.");
           return;
       }
       NodoLista nodoAux= primerNodo;
       int aux=0;

       for (int i = 0; i < obtenerTamanio(); i++) {
           nodoAux= primerNodo;
           while(nodoAux.sigNodo!=null){
               if(nodoAux.dato>nodoAux.sigNodo.dato){
                   aux=nodoAux.dato;
                   nodoAux.dato=nodoAux.sigNodo.dato;
                   nodoAux.sigNodo.dato=aux;
               }
               nodoAux=nodoAux.sigNodo;
           }
    }


   }


//
    public int obtenerTamanio(){
        NodoLista aux = primerNodo;
        int cantidad=0;
        while(aux!=null){
            cantidad++;
            aux=aux.sigNodo;
        }
        return cantidad;

    }

   public void imprimir(){
    if (estaVacia()){
        System.out.println("la lista esta vacia");
    }else{
        System.out.println("nombre: " +nombreLista);

        NodoLista aux= primerNodo;

        while (aux != null) {
            System.out.print(aux.dato+ "->");
            aux = aux.sigNodo;

        }
        System.out.print("Null");

    }

   }

//metodo burbuja




}
