package ejercicios.promedio;

import ejercicios.Producto;

import javax.swing.*;

public class TestVectorValor {

    public static void main(String[] args) {



        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Cuantos promedios son"));
        VectorValor vv = new VectorValor(tamanio);

        boolean sentinel = true;
        String opcion ="";


        for (int i = 0; i < tamanio; i++) {
            double cantidad = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor " + (i + 1)));

            vv.agregarValor(new Valor(cantidad));
        }


        JOptionPane.showMessageDialog(null, vv.imprimir());

    }




}
