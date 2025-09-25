package ejercicios;

import javax.swing.*;

public class ProductoVector {

//variable de instancia
    private Producto[] productos;
    private final int TAMANIO=3;

    public ProductoVector(){
        productos = new Producto[TAMANIO];
    }

    private ProductoVector(int tamanio){
        if(tamanio>=0){
            productos= new Producto[tamanio];
        }else{
            productos= new Producto[TAMANIO];
        }
    }

    public void agregarProducto(Producto producto){
        if(estaLleno()){
            JOptionPane.showMessageDialog(null,"El arrelo esta lleno, no se pueden agregar mas productos");
        }else{
            this.productos[obtenerPosicion()]= producto;
        }
    }




    private boolean estaLleno (){
        boolean sentinel = true;

        for(Producto producto: this.productos){
            if(producto==null){
                sentinel= false;
                break;
            }
        }
        return sentinel;
    }

    private int obtenerPosicion(){

        int posicion=0;
        for(int i=0; i<this.productos.length; i++){
            if(this.productos[i]==null) {
                posicion = i;
                break;
            }
        }
        return posicion;
    }








}
