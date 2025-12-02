package mx.edu.uttt.matrices.ejercicios;

import javax.swing.*;

public class Ejercicio2 {

    private int[][] m;

    public Ejercicio2(int i, int j) {
        if (validarTamanio(i) && validarTamanio(j)) {
            m = new int[i][j];
        } else {
            m = new int[3][3];//tamaño por defecto
        }
    }


    //si el numero es negativo, regresa un false
    private boolean validarTamanio(int tamanio) {
        return tamanio > 0;
    }

    public int[][] getM() {
        return this.m;
    }

    public void setM(int [][]m) {
        if (m.length == this.m.length && m[0].length == this.m[0].length) {
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    this.m[i][j] = m[i][j];
                }
            }
        }
    }


    private boolean esCuadrada(){

        return this.m.length == this.m[m.length-1].length;
    }


    public static int solicitarTamanio(){
        int valor = 0;
        boolean sentinel = true;

        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de la matriz8"));

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
    }


    public void llenarMatrices(){
        for(int i = 0; i< m.length; i++){
            for( int j = 0; j< m[i].length; j++){

                m[i][j] = (int) (Math. random()*100);
            }
        }
    }

    public void sumaDiagonalSup() throws Exception{
        if (!esCuadrada())
            throw new Exception ("la matriz debe ser cuadrada");
        String resultado= "";
        int suma= 0;
            for (int i = 0; i<m.length; i++){
                for (int j=0; j<m[i].length; j++){
                    if (j> i){
                        suma += m[i][j];
                    }
                }
                resultado = "\n";
            }
        JOptionPane.showMessageDialog(null,"la suma de la diagonal superiror es: "+ suma);
    }


    public void sumaDiagonalInf() throws Exception{
        if (!esCuadrada())
            throw new Exception ("la matriz debe ser cuadrada");
        String resultado= "";
        int suma= 0;
        for (int i = 0; i<m.length; i++){
            for (int j=0; j<m[i].length; j++){
                if ( j< i){
                    suma += m[i][j];
                }
            }
            resultado = "\n";
        }
        JOptionPane.showMessageDialog(null, "la suma de la diagonal inferiror es: "+suma);
    }

    public void imprimir(){
        String salida = "";

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                salida+= m [i][j] + "  ";
            }
            salida+= "\n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
}
