package ejercicios.vectores;

import javax.swing.*;

public class TestOperacionesVector {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar() {
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de los vectores"));
        double[] vectorA = new double[tamanio];
        double[] vectorB = new double[tamanio];
        double[] vectorC = new double[tamanio];

        boolean activo = true;
        String opcion;

        do {
            opcion = JOptionPane.showInputDialog(obtenerMenu());

            switch (opcion) {
                case "1":
                    // Insertar valores en A y B
                    for (int i = 0; i < tamanio; i++) {
                        vectorA[i] = Double.parseDouble(JOptionPane.showInputDialog("Vector A - Valor " + i));
                        vectorB[i] = Double.parseDouble(JOptionPane.showInputDialog("Vector B - Valor " + i));
                    }
                    JOptionPane.showMessageDialog(null, "Vectores A y B llenados correctamente.");
                    break;

                case "2":
                    // Suma
                    for (int i = 0; i < tamanio; i++) {
                        vectorC[i] = vectorA[i] + vectorB[i];
                    }
                    JOptionPane.showMessageDialog(null, imprimirVector("Suma", vectorC));
                    break;

                case "3":
                    // Resta
                    for (int i = 0; i < tamanio; i++) {
                        vectorC[i] = vectorA[i] - vectorB[i];
                    }
                    JOptionPane.showMessageDialog(null, imprimirVector("Resta", vectorC));
                    break;

                case "4":
                    // Multiplicación
                    for (int i = 0; i < tamanio; i++) {
                        vectorC[i] = vectorA[i] * vectorB[i];
                    }
                    JOptionPane.showMessageDialog(null, imprimirVector("Multiplicación", vectorC));
                    break;

                case "5":
                    // División
                    for (int i = 0; i < tamanio; i++) {
                        vectorC[i] = vectorB[i] != 0 ? vectorA[i] / vectorB[i] : 0;
                    }
                    JOptionPane.showMessageDialog(null, imprimirVector("División", vectorC));
                    break;

                case "6":
                    // Potencia
                    double sumaPotencias = 0;
                    for (int i = 0; i < tamanio; i++) {
                        vectorC[i] = Math.pow(vectorA[i], vectorB[i]);
                        sumaPotencias += vectorC[i];
                    }
                    JOptionPane.showMessageDialog(null, imprimirVector("Potencias", vectorC) +
                            "\nSuma de potencias: " + sumaPotencias);
                    break;

                case "7":
                    // Salir
                    activo = false;
                    JOptionPane.showMessageDialog(null, "Hasta pronto");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (activo);
    }

    public static String obtenerMenu() {
        return "------------------- MENU DE OPERACIONES ------------------------" +
                "\n1) Insertar valores en A y B" +
                "\n2) Sumar vectores" +
                "\n3) Restar vectores" +
                "\n4) Multiplicar vectores" +
                "\n5) Dividir vectores" +
                "\n6) Potencia y suma de potencias" +
                "\n7) Salir" +
                "\nElige una opción";
    }

    public static String imprimirVector(String titulo, double[] vector) {
        String salida = titulo + ": [ ";
        for (double v : vector) {
            salida += v + " ";
        }
        salida += "]";
        return salida;
    }
}

