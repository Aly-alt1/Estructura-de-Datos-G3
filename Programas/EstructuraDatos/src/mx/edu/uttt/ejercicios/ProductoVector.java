package ejercicios;

import javax.swing.*;

public class ProductoVector {

//variable de instancia
    public Producto[] productos;
    private final int TAMANIO=3;

    public ProductoVector(){
        productos = new Producto[TAMANIO];
    }

    public  ProductoVector(int tamanio){
        if(tamanio >0){
            productos = new Producto[tamanio];
        }else{
            productos = new Producto[TAMANIO];
            JOptionPane.showMessageDialog(null,
                    "Se agrego esta lleno, no se puede agregar el producto");
        }
    }

    public void agregarProducto(Producto producto){
        if(estaLleno()){
            JOptionPane.showMessageDialog(null,"El arrelo esta lleno, no se pueden agregar mas productos");
        }else{
            this.productos[obtenerPosicion()]= producto;
        }
    }



    public boolean estaLleno (){
        boolean sentinel = true;

        for(Producto producto: this.productos){
            if(producto==null){
                sentinel= false;
                break;
            }
        }
        return sentinel;
    }

    public int obtenerPosicion(){

        int posicion=0;
        for(int i=0; i<this.productos.length; i++){
            if(this.productos[i]==null) {
                posicion = i;
                break;
            }
        }
        return posicion;

    }

    public String imprimir(){
        String salida= "lista de productos";

        if(productos[0] != null) {


            for (int i = 0; i < productos.length; i++) {
                if (productos[i] != null) {

                    salida += "NOmbre: " + productos[i].getNombre() +
                            "\nPrecio: " + productos[i].getPrecio() +
                            "\nExistencia: " + productos[i].getExistencia() +
                            "\n Importe Inventario: " +
                            productos[i].getPrecio() * productos[i].getExistencia();


                }
            }
        }
        return salida;
    }


}
