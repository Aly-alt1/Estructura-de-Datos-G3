package mx.edu.uttt.matrices.ejercicios;



import javax.swing.*;

import static mx.edu.uttt.matrices.ejercicios.Ejercicio1.SolicitarTamanioC;
import static mx.edu.uttt.matrices.ejercicios.Ejercicio1.SolicitarTamanioF;
import static mx.edu.uttt.matrices.ejercicios.Ejercicio2.solicitarTamanio;

public class TestEjercicio1 {
    public static void main(String[] args) throws Exception {
        iniciar();

    }

    public static void iniciar() throws Exception {

        String opcion = "";
        boolean sentinel = true;

        do {
            opcion = JOptionPane.showInputDialog(obtenerMenuPrincipal());


            switch (opcion) {
                case "1":
                    Ejerciio1();
                    break;
                case "2":
                   Ejerciio2();
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Se acabó");
                    sentinel = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        } while (sentinel);

    }


    public static void Ejerciio1() {
        String opcion = "";
        boolean sentinel = true;

        do {

            Ejercicio1 ejercicio1= new Ejercicio1(SolicitarTamanioF(), SolicitarTamanioC());

            ejercicio1.LlenarMatriz();
            ejercicio1.llenarMarco();
            ejercicio1.Imprimir();

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres repetir el ehercicio 1?");

            if (respuesta != 0) {
                sentinel = false;
            }
        } while (sentinel);
    }

    public static void Ejerciio2() throws Exception {
        String opcion = "";
        boolean sentinel = true;

        do {

            Ejercicio2 ejercicio2= new Ejercicio2(solicitarTamanio(), solicitarTamanio());
            ejercicio2.llenarMatrices();
            ejercicio2.imprimir();
            ejercicio2.sumaDiagonalSup();
            ejercicio2.sumaDiagonalInf();

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Quieres repetir el ejercicio 2?");

            if (respuesta != 0) {
                sentinel = false;
            }
        } while (sentinel);
    }

    public static String obtenerMenuPrincipal() {
        String menu = "===== Menu Principal =====" +
                "\n 1)Ejercicio 1" +
                "\n 2)Ejercicio 2" +
                "\n 3) Salir" +
                "\n Elegir Opcion: ";

        return menu;
    }
}
