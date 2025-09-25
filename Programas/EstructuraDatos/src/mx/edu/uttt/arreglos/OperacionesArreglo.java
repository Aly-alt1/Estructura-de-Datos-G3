package mx.edu.uttt.arreglos;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OperacionesArreglo {
    private double[] vector;
    private final int TAMANIO = 5;

    public OperacionesArreglo(){
        this.vector =  new double[TAMANIO];
    }

    public OperacionesArreglo(int tamanio){
        this.vector =  new double[tamanio];
    }


    public OperacionesArreglo(double [] vector){
        this.vector =  new double[vector.length];
    }

    public void llenarArreglo(double [] vector){
        int i = 0;

        while (i<this.vector.length){
            this.vector[i] = vector [i];
            i++;
        }
    }


    public void llenarArreglo(){

        for (int i = 0; i < this.vector.length; i++) {
            JOptionPane.showInputDialog("Ingrese el tamaño del vector numero: "+i);
            vector[i]= Double.parseDouble(JOptionPane.showInputDialog("El vector de la posicion "+i+" es: "+vector));

        }

    }
    public double sumarValores(){
        double suma=0.0;

        for (int i = 0; i < this.vector.length; i++) {
            suma+= vector[i];
        }

        return suma;
    }

    public double obtenervalorMaximo(){

        double valorMax = 0.0;
        int i = 0;
        while(i<this.vector.length){
            if(valorMax<this.vector[i]){
                valorMax = this.vector[i];

                i++;
            }

            }

        return valorMax;
    }

    public double obtenerValorMinimo(){

        double valorMin = 0.0;
        int posicion = 0;
        for (double valor: this.vector) {
            if (valor < valorMin){
                valorMin = valor;
            }
        }
        return valorMin;
    }

    public boolean CompararArreglos(double [] vector){
        boolean isEquals = true;


        if (vector.length != this.vector.length){
            isEquals = false;
        }else {
            for (int i = 0; i < this.vector.length && isEquals; i++) {
                if (this.vector [i] != this.vector[i]){
                    isEquals = false;
                }
            }

        }

        return isEquals;
    }

    public void cambiarTamanio(int tamanio){
        double temp [] = new double[tamanio];

        for(int i=0 ; i<this.vector.length; i++){
            temp[i] = this.vector[i];
        }

    }

    public String buscarValor(double valor){
        String salida ="";
        boolean sentinel = false;

        for( int i=0; i<this.vector.length; i++){
            if(valor == this.vector [i]){
                sentinel = true;
                salida= "El valor de "+valor+ " esta en la posicion "+i;
                break;
            }

        }
        if (!sentinel)
            salida = " el valor no se encontro en el arreglo";
         return salida;
    }

    public void imprimir(){
        //for each
        String salida ="";
        for (double valor: vector){
            salida+= "| "+valor+ " |";
        }
        showMessageDialog(null, salida);
    }

}
