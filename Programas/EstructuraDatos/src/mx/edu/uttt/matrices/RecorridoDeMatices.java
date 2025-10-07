package matrices;

import javax.swing.*;

public class RecorridoDeMatices {
public static void main (String[] args){

    int[][] matrix={
            {1,3,4},
            {3,4,5},
            {7,6,10}

    };
}

public static void imprimir (int[][] m){

    //controla las filas
    String salida= "";
    for (int i = 0; i < m.length ; i++) {

        //controla las columnas
        for (int j = 0; j < m[i].length; j++) {
        salida += m[i][j] + "";
        }
        salida+= "\n";
    }
    JOptionPane.showMessageDialog(null, salida);
}


}
