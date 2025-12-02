package mx.edu.uttt.matrices.ejercicios;

import static mx.edu.uttt.matrices.ejercicios.metodoCalificaciones.*;

public class TestMetodoCalificaciones {
    public static void main( String [] args){
        iniciar();
    }

    public static void iniciar(){
       double [][] metodoCalificaciones = new double[solicitarTamanio()][solicitarTamanio()];
       llenarMatriz(metodoCalificaciones);
       mostrarMatriz(metodoCalificaciones);
       promedioMaterias(metodoCalificaciones);
        promedioAlumnos(metodoCalificaciones);
    }


}
