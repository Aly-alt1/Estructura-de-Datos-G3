package ejercicios.vectores;

import javax.swing.*;

public class VectorNumero {
    public double[] numeros;

    public VectorNumero(int tamaño) {
        if (tamaño > 0) {
            numeros = new double[tamaño];
        } else {
            numeros = new double[3];
            JOptionPane.showMessageDialog(null, "Tamaño inválido, se te puso el 3 XD");
        }
    }

    public void agregarNumero(double numero) {
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == 0.0) {
                numeros[i] = numero;
                break;
            }
        }
    }

    public String imprimir(String nombre) {
        String salida = nombre + ": [ ";
        for (double n : numeros) {
            salida += n + " ";
        }
        salida += "]";
        return salida;
    }

}
