package mx.edu.uttt.matrices.ejercicios;

import javax.swing.*;

public class Ejercicio1 {

    private int [][]m;

    public Ejercicio1(int i, int j){
        if(validarTamanio(i) && validarTamanio(j)){
            m= new int[i][j];
        }else{
            m= new int[5][4];//tamaño por defecto
        }
    }
    //si el numero es negativo, regresa un false
    private boolean validarTamanio(int tamanio){
        return tamanio > 0;
    }

    public int[][] getM() {
        return m;
    }

    public void setM(int[][] m) {
        if (m.length == this.m.length && m[0].length == this.m[0].length){
            for(int i=0; i< m.length ;  i++){
                for(int j=0; j< m[i].length; j++){
                    this.m[i][j] = m[i][j];
                }

            }

        }
    }

public void llenarMarco(){

    //para la primera fila
    for (int j = 0; j < m[0].length; j++){
        m[0][j]= 1;
    }

    //ultima fila
    if (m.length > 1){
        for (int j = 0; j< m[0].length; j++){
            m[m.length -1][j] = 1;
        }
    }

    //primera columna
    for (int i =0; i< m.length -1; i ++){
        m[i][0] = 1;
    }

    //ultima columna
    if ( m[0].length > 1){
        for (int i =0; i< m.length -1; i++){
            m[i][m[0].length -1]= 1;
        }
    }

}


    public void LlenarMatriz (){

        //llenar arreglo aleatorio
         for (int i = 0; i < m.length; i++) {
             for (int j = 0; j < m[i].length; j++) {

                 m[i][j] = (int) (Math.random() * 10);

             }
         }
    }//fin llenar arreglo



//para la fila
    public static int SolicitarTamanioF() {


        int valor = 0;
        boolean sentinel = true;

        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la fila"));

                if (valor > 0)
                    sentinel = false;
                else
                    JOptionPane.showMessageDialog(null, "El numero debe de ser mayor a 0");

            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "El numero debe de ser un numero valido");
            }


        } while (sentinel);

        return valor;
    }//fin solicitar tamanio de la fila

    //para la columna
    public static int SolicitarTamanioC() {


        int valor = 0;
        boolean sentinel = true;

        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la columna"));

                if (valor > 0)
                    sentinel = false;
                else
                    JOptionPane.showMessageDialog(null, "El numero debe de ser mayor a 0");

            } catch (NumberFormatException ex) {
                System.out.println(ex.getMessage());
                JOptionPane.showMessageDialog(null, "El numero debe de ser un numero valido");
            }


        } while (sentinel);

        return valor;
       
    }//fin solicitar tamanio de colunba


    public void Imprimir(){

        String salida = "";

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                salida+= m [i][j] + "  ";
            }
            salida+= "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }//fin imprimir



}
