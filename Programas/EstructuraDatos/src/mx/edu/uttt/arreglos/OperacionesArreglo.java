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

            for (int i = 0; i < vector.length; i++) {
                JOptionPane.showInputDialog("Ingrese el tamaño del vector numero: "+i);
                vector[i]= Double.parseDouble(JOptionPane.showInputDialog("El vector de la posicion "+i+" es: "+vector));

            }

        }
        public double sumarValores(){
            double suma=0.0;

            for (int i = 0; i < vector.length; i++) {
            suma+= vector[i];
            }
            JOptionPane.showMessageDialog(null, "La suma de todos los valores es: " + suma);
            return suma;
        }

        public double obtenervalorMaximo(){
            if (vector.length == 0) {
                JOptionPane.showMessageDialog(null, "El areglo no tiene nada unu");
            }
            double valorMax = vector[0];
            int posicion = 0;
            for (int i = 1; i < vector.length; i++) {
                if (vector[i]> valorMax){
                    valorMax = vector[i];
                    posicion= i;
                }
            }
            showMessageDialog(null, valorMax);

            return valorMax;
        }

        public double obtenerValorMinimo(){
            if (vector.length == 0) {
                JOptionPane.showMessageDialog(null, "El areglo no tiene nada unu");
            }
            double valorMin = vector[0];
            int posicion = 0;
            for (int i = 1; i < vector.length; i++) {
                if (vector[i]< valorMin){
                    valorMin = vector[i];
                    posicion= i;
                }
            }
            JOptionPane.showMessageDialog(null, "El valor minimo es: "+valorMin+ " en la posicion: "+ posicion);
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
JOptionPane.showInputDialog("Ingrese el tamañp que quiere cambiar del arreglo");

        }

        public void buscarValor(double valor){
        JOptionPane.showInputDialog("Que valor busca?");
            for (int i = 0; i < vector.length; i++) {
                if (vector[i] == valor) {
                    JOptionPane.showMessageDialog(null,"El valor de: "+valor+" esta en la posicion: "+i);
                    return;
                    
                } else{
                    JOptionPane.showMessageDialog(null, "Valor " + valor + " no se encontro");
                }
            }
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

