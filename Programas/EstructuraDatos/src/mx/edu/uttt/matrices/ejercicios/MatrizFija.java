package mx.edu.uttt.matrices.ejercicios;

import javax.swing.*;

public class MatrizFija {

    static char[][] palabras;


    public static void main(String[] args) {
        crearmatriz();
        imprimir();
        buscarPalabra();
    }

    static public void crearmatriz() {
        char [][] palabras = {{'c','a','s','a','s'},
                {'p','e','r','r','o'},
                {'g','a','t','o','s'}};
    }

    static public void imprimir(){
        StringBuilder imprimir= new StringBuilder();

        for (int i = 0; i < 3; i++) {
            imprimir.append("|");
            for (int j = 0; j < 5; j++) {
                imprimir.append(palabras[i][j]).append("|");
            }
            imprimir.append("\n");
        }
        JOptionPane.showMessageDialog(null, imprimir.toString());
    }

    static public void buscarPalabra(){
        String buscar=JOptionPane.showInputDialog("Ingrese la palabra de 5 letras a buscar:");
        int contador=0;
        for (int i = 0; i < 3; i++) {
            if(palabras[i][0]==buscar.charAt(0)&&palabras[i][1]==buscar.charAt(1)&&
                    palabras[i][2]==buscar.charAt(2)&&palabras[i][3]==buscar.charAt(3)&&
                    palabras[i][4]==buscar.charAt(4))
                JOptionPane.showMessageDialog(null, "La palabra se encuentra en la "+(i+1)+" fila");
            else
                contador++;
        }
        if(contador==3)
            JOptionPane.showMessageDialog(null, "La palabra no existe en la lista");
    }
}







