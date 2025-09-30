package ejercicios;

import javax.swing.*;



public class TestProductoVector {
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){

        int tamanio =  Integer.parseInt(JOptionPane.showInputDialog("Introduce el numeero de productos"));
        boolean sentinel = true;
        String opcion ="";

        ProductoVector pv = new ProductoVector(tamanio);
        do{
            opcion = JOptionPane.showInputDialog(obtenerMenu());

            switch (opcion){
                case "1":
                    //Insertar el producto
                    if (pv.estaLleno()){
                        JOptionPane.showMessageDialog(null,
                                "Ya no hay espacio para insertar un nuevo producto");
                    }else {
                        pv.agregarProducto(llenarProducto());
                    }
                    break;

                case "2":
                    //Eliminar producto
                    int eliminar= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el prodcuto que quiere eliminar"));
                    if (eliminar >= 0 && eliminar < pv.productos.length && pv.productos[eliminar] != null) {
                        pv.productos[eliminar] = null;
                        JOptionPane.showMessageDialog(null, "Producto eliminado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Posición inválida o vacía.");
                    }
                    break;

                case "3":
                    //Modificar producto()
                    int modificar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese que vector quiere cambiar"));
                    if (modificar >=0 && modificar < pv.productos.length && pv.productos[modificar]!= null){
                        pv.productos[modificar] = llenarProducto();
                        JOptionPane.showMessageDialog(null, "Se modifico el producto");
                    }else{
                        JOptionPane.showMessageDialog(null, "NO hay nad que cambiar");
                    }

                    break;

                case "4":
                    //buscar producto
                    String nombreBuscar = JOptionPane.showInputDialog("Introduce el nombre que hay que cambiar");
                    boolean Sentinel = true;
                    for (int i = 0; i < pv.productos.length; i++) {
                        Producto p = pv.productos[i];
                        if (p != null && p.getNombre().equalsIgnoreCase(nombreBuscar)) {
                            JOptionPane.showMessageDialog(null, "el producto está en la posición " + i +
                                    "\nNombre: " + p.getNombre() +
                                    "\nPrecio: " + p.getPrecio() +
                                    "\nExistencia: " + p.getExistencia());

                            break;
                        }
                    }
                    if (!Sentinel) {
                        JOptionPane.showMessageDialog(null, "Producto no encontrado.");
                    }
                    break;


                case "5":
                    //Imprimir producto
                    JOptionPane.showMessageDialog(null, pv.imprimir());
                    break;

                case "6":
                    //Salir
                    sentinel = false;
                    JOptionPane.showMessageDialog(null, "Hasta pronto");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while(sentinel);

    }

    public static String obtenerMenu(){
        return "------------------- MENU PRINCIPAL------------------------" +
                "\n1) Insertar producto: " +
                "\n2) Eliminar producto: " +
                "\n3) Modificar producto" +
                "\n4) Buscar producto: " +
                "\n5) Imprimir productos: " +
                "\n6) Salir" +
                "\nEliga una opcion";
    }

    public static Producto llenarProducto(){
        String nombre = JOptionPane.showInputDialog("Intorduc el nombre del producto");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio"));
        int existencia = Integer.parseInt(JOptionPane.showInputDialog("Introduce la existencia"));

        Producto p1 = new Producto();

        p1.setNombre(nombre);
        p1.setPrecio(precio);
        p1.setExistencia(existencia);

        return p1;
    }


}
