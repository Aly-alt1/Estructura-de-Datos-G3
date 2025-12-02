package mx.edu.uttt.matrices;

import javax.swing.*;

import static javax.swing.JOptionPane.showMessageDialog;

public class OperacionesMatrices {
private double [][]m;

public OperacionesMatrices(int filas, int columnas){
    if(validarTamanio(filas) && validarTamanio(columnas)){
        m= new double[filas][columnas];
    }else{
        m= new double[2][2];//tamaño por defecto
    }
}
//si el numero es negativo, regresa un false
private boolean validarTamanio(int tamanio){
    return tamanio > 0;
}

public double [][] getM(){
    return this.m;
}

public void setM(double[][]m) {

    if (m.length == this.m.length && m[m.length - 1].length == this.m[0].length){
        for(int i=0; i< m.length ;  i++){
            for(int j=0; j< m.length; j++){
                this.m[i][j] = m[i][j];
            }

        }

    }

   }


   public String imprimir(){
    String salida = "";
    for(double [] fila: this.m){
        for(double valor: fila){
            salida += valor + "  ";
        }
        salida += "\n";
    }
    return salida;
}
   public String imprimir2(){

    String salida = "";


       for (int i = 0; i < m.length; i++) {
           for (int j = 0; j < m[i].length; j++) {
            salida+= m [i][j] + "  ";
           }
           salida+= "\n";
       }
       return salida;
   }


   private boolean esCuadrada(){
    return this.m.length == this.m[m.length-1].length;
   }


    public double sumaDiagonal() throws Exception{

   if (!esCuadrada())
       throw new Exception ("la matriz debe ser cuadrada");
    double acum = 0.0;

        for (int i = 0; i < m.length; i++) {
            acum += m[i][i];
        }
    return acum;
    }


    //decremento de esto diagonal
    public double sumaDiagonal2() throws Exception{

        if (!esCuadrada())
            throw new Exception ("la matriz debe ser cuadrada");
        double acum = 0.0;
        int decre = m.length-1;

        /*
        incremento
        for(int=m.length-1; i>0; i++){
        suma+= m[i][j];
        j++

        //otra forma
        suma+= m[i][m.length-1 -i]

        }
         */

        for (int i = 0; i < m.length; i++) {
        acum= m[i][decre];
        acum --;
        }
        return acum;
    }

    public double [] sumaTotal() throws Exception{

    if (!esCuadrada())
        throw new Exception ("la matriz debe ser cuadrada");
    double suma[] = new double[this.m.length];
        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m.length; j++) {
                suma [i]+= m[i][j];
            }

        }
        return suma;
    }

    public double [] sumaColumnas() throws Exception {
    //guardare en un vector
    if(!esCuadrada())
        throw new Exception("La raiz debe ser cuadrada");

        double[] sumaColum = new double[this.m.length];

        for (int i = 0; i < m.length; i++) {
            sumaColum[i]= 0.0;
            for (int j = 0; j < m.length; j++) {
                sumaColum[i] += m[j][i];

            }
        }
    return sumaColum;
    }

    public double[] sumaFilas () throws Exception{
        if(!esCuadrada())
            throw new Exception("La raiz debe ser cuadrada");
    
        double[] sumaFila = new double[this.m.length];

        for (int i = 0; i < m.length; i++) {

            sumaFila[i]= 0.0;
            for (int j = 0; j < m.length; j++) {
                sumaFila[i] += m[i][j];
            }

        }
        return sumaFila;

    }

    public String imprimirSumaColumnasFilas() {
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

    public void sumaMatrices(double [][] m1, double[][]m2){

    if(! (m1.length == m2.length &&
            m1[0].length==m2[0].length &&
            m1.length == this.m.length &&
            m1[0].length == this.m[0].length)){//se puede usar cualquier m, la primera parte verifica que m1 y m2 son iguales, el segundo verifica que las filas son iguales en filas, la ultima si las columnas son iguales

        return;}

        int i= 0, j=0;

        //para saber si las matrices son del mismo tamaño de la variable de instancia
        while(i<this.m.length){

        }while(j<this.m[0].length){
    this.m[i][j]=m1[i][j] + m2[i][j];
            j++;
        }
        i++;
        j=0;
    }

    public void restarMatriz(double [][] m1, double[][] m2){
        if(! (m1.length == m2.length &&
                m1[0].length==m2[0].length &&
                m1.length == this.m.length &&
                m1[0].length == this.m[0].length)){//se puede usar cualquier m, la primera parte verifica que m1 y m2 son iguales, el segundo verifica que las filas son iguales en filas, la ultima si las columnas son iguales

            return;}

        int i= 0, j=0;

        //para saber si las matrices son del mismo tamaño de la variable de instancia
        while(i<this.m.length){

        }while(j<this.m[0].length){
            this.m[i][j]=m1[i][j] - m2[i][j];
            j++;
        }
        i++;
        j=0;
    }



    public void llenarMatriz (){
        for (int i = 0; i < m.length; i++) {
            for (int j =0; j< m.length; j++) {
                JOptionPane.showInputDialog("Ingrese el numero de la fila: " + i);
                JOptionPane.showInputDialog("Ingrese el numero de la columna " + j);
                m[i][j]= Double.parseDouble(JOptionPane.showInputDialog("La matriz es " + m));
            }

        }

    }




}

