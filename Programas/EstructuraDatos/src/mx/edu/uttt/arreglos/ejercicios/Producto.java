package ejercicios;
//el paquete debe de estar en una aparte de la mx.edu.uttt.ejercicios


//resolver el siguiente problema empleando vectores
//mostrar n productos en salida (guardar en un vector productos con nombre, precio, existencia)
//con un objeto arreglo tipo producto, mostrar el costo del inventario ( precio x exitencia
//constructor que recibe y no recibe
public class Producto {

    private String nombre;
    private double precio;
    private int existencia;

    //constructor vacio
    public Producto (){
        this.nombre ="Sin nombre";
    }
    public Producto (String nombre, int existencia,double precio){
    this.setNombre(nombre);
    this.setPrecio(precio);
    this.setExistencia(existencia);
    }

    //metodo accesor de nombre (get)
    public String getNombre(){
        return this.nombre;
    }

    //metodo mutador de nombre( set)
    public void  setNombre(String nombre) {
        this.nombre = nombre.toUpperCase();
    }

    public int getExistencia(){
        return this.existencia;
    }

    public void setExistencia(int existencia){
        if(existencia>=0){
            this.existencia = existencia;
        }
    }

    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio (double precio){
        if(precio >=0.0){
            this.precio=precio;
        }
    }

    @Override
    public String toString(){
        return "Nombre: "+ this.nombre+
                "\nPrecio"+this.getPrecio()+
                "\nExistencia: "+this.existencia;
    }


}

