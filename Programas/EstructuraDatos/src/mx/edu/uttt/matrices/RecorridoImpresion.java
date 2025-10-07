package matrices;

import javax.swing.*;

public class RecorridoImpresion {
    public static void main (String[] args){
    iniciar();
    //int fila = solicitarTamanio();
    //int columna = solicitarTamanio();
    //double [][] matrix = new double[fila][columna];

        double [][] matrix = new double[solicitarTamanio()][solicitarTamanio()];
        llenar(matrix);
        JOptionPane.showMessageDialog(null,imprimir(matrix));


    }
public static void iniciar(){

}



public static int solicitarTamanio(){
    //obligar a que no salga negativo
    int valor =0;
    boolean sentinel = true;

    do {
        //validar que el usuario solo pueda introducir enteros
        try {
            //si sale bien se va aqui
            valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numeros"));


            if (valor > 0)
                sentinel = false;
            else
                JOptionPane.showMessageDialog(null, "El numero debe de ser mayor a 0");

        }catch (NumberFormatException ex) {
            //si sale mal se va para aca
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "El numero debe de ser un numero valido");

        }
    }while (sentinel);

    return valor;
}

public static double solicitarValor(){
        double valor =0;
        boolean sentinel = true;

        do{

        try {
            valor = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor"));
            sentinel=false;
        }catch (NumberFormatException ex){

            JOptionPane.showMessageDialog(null, "El valor debe de ser un numero");

        }
}while(sentinel);

return valor;
    }

public static void llenar (double[][] m){

        //
        int i=0;
        int j=0;

        while(i< m.length){

            while(j< m[i].length){
                m[i][j] = solicitarValor();
                j ++;
            }
            i++;
            j =0;

        }


}

public static String imprimir(double [][] m){
        String salida = "";
        int i = 0;
        int j = 0;
        do{
            do {
                salida += m[i][j] + "";
                j++;
            }while(j< m.length);
            salida+= "\n";
            j= 0;
            i ++;
        }while(i< m.length);
        return salida;
}





}
