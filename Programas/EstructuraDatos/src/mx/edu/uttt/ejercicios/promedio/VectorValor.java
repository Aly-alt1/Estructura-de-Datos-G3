package ejercicios.promedio;

import javax.swing.*;
import java.util.Arrays;

public class VectorValor {
    public Valor[] valores;

    public VectorValor(int tamaño) {
        if (tamaño > 0) {
            valores = new Valor[tamaño];
        } else {
            valores = new Valor[3];
            JOptionPane.showMessageDialog(null, "Tamaño inválido, se usa el tres xD");
        }
    }

    public void agregarValor(Valor valor) {
        for (int i = 0; i < valores.length; i++) {
            if (valores[i] == null) {
                valores[i] = valor;
                break;
            }
        }
    }

    public double calcularPromedio() {
        double suma = 0;
        for (Valor v : valores) {
            if (v != null) suma += v.getCantidad();
        }
        return suma / valores.length;
    }

    public int contarMayores(double promedio) {
        int contador = 0;
        for (Valor v : valores) {
            if (v != null && v.getCantidad() > promedio) contador++;
        }
        return contador;
    }

    public int contarMenores(double promedio) {
        int contador = 0;
        for (Valor v : valores) {
            if (v != null && v.getCantidad() < promedio) contador++;
        }
        return contador;
    }

    public double[] obtenerMayores(double promedio) {
        int cantidad = contarMayores(promedio);
        double[] mayores = new double[cantidad];
        int index = 0;

        for (Valor v : valores) {
            if (v != null && v.getCantidad() > promedio) {
                mayores[index] = v.getCantidad();
                index++;
            }
        }
        return mayores;
    }

    public String imprimir() {
        String salida = "Promedio";
        if (valores[0] != null) {
            for (int i = 0; i < valores.length; i++) {
                if (valores[i] != null) {

                    double promedio = calcularPromedio();
                    int mayores = contarMayores(promedio);
                    int menores = contarMenores(promedio);


                    salida = "Promedio: " + promedio +
                    "\nMayores al promedio: " + mayores +
                    "\nMenores al promedio: " + menores +
                    "\nLista de mayores: " + Arrays.toString(obtenerMayores(promedio));


                }
            }
        }

        return salida;
    }



}