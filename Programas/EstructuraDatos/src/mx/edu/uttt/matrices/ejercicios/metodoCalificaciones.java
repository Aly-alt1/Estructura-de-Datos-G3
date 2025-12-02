package mx.edu.uttt.matrices.ejercicios;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class metodoCalificaciones {

    private double[][] a;

    public metodoCalificaciones(int fila, int columnas) {
        if (validarTamanio(fila) && validarTamanio(columnas)) {

        }
    }

    private boolean validarTamanio(int tamanio) {
        return tamanio > 0;
    }

    public double[][] getA() {

        return this.a;
    }

    public void setA(double[][] a) {
        if (a.length == this.a.length && a[0].length == this.a[0].length) {
            for (int i = 0; i < a.length; i++) {
                // Asegurar que el bucle interno recorra las columnas, que es a[i].length o a[0].length
                for (int j = 0; j < a[i].length; j++) {
                    this.a[i][j] = a[i][j];
                }
            }
        } else {
            showMessageDialog(null, "Error: La nueva matriz no coincide con las dimensiones de la matriz actual.");

        }
    }

    //Math.round(Math.random() *10.0 *10.0)/10

    public static void llenarMatriz(double[][] a) {


        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {

                a[i][j] = Math.round(Math.random() * 10.0 * 10.0) / 10;

            }
        }
    }

    public static int solicitarTamanio() {
        int valor = 0;
        boolean sentinel = true;

        do {
            try {
                valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero la matriz"));

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

    private boolean cuadrada() {
        return this.a.length == this.a[a.length - 1].length;
    }


    public static void mostrarMatriz(double[][] a) {

        if (a == null || a.length == 0 || a[0] == null || a[0].length == 0) {
            JOptionPane.showMessageDialog(null, "La matriz está vacía ");
            return;
        }

        String resultado = "---------------- MATRIZ DE CALIFICACIONES ----------------\n\n";

        resultado += "Alumno/Materia |";
        for (int j = 0; j < a[0].length; j++) {

            resultado += " M" + (j + 1) + "\t|";
        }
        resultado += "\n";


        for (int i = 0; i < a.length; i++) {

            resultado += "A" + (i + 1) + "\t\t |";

            // Calificaciones
            for (int j = 0; j < a[i].length; j++) {

                double calificacion = a[i][j];
                resultado += calificacion + "\n";
            }
            resultado +=  "\n";
        }

        resultado += "\n------------------------------------------------------------";


        JOptionPane.showMessageDialog(null, resultado);


    }



    public static void promedioMaterias(double [][]a){

        double [] promedio = new double[a[0].length];
        double sumaColumna = 0.0;
        for( int i =0; i < a.length; i++){
            sumaColumna= 0.0;
            for( int j=0; j <a.length; j++){
                sumaColumna += a[j][i];
            }

            promedio [i]= sumaColumna / a.length;
        }

        showMessageDialog(null, promedio);
    }

    public static void promedioAlumnos(double [][]a){

        double [] promedio = new double[a[0].length];
        double sumaFila = 0.0;
        for( int i =0; i < a.length; i++){
            sumaFila= 0.0;
            for( int j=0; j <a[0].length; j++){
                sumaFila    += a[i][j];
            }
            promedio [i]= sumaFila / a.length;
        }

            showMessageDialog(null, promedio);
    }




}