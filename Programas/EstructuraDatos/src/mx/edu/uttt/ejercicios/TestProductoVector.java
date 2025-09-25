package ejercicios;

public class TestProductoVector {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.setNombre("Corona especial");
        p1.setExistencia(12);
        p1.setPrecio(12.0);

        Producto productos[] = new Producto[3];


        productos[0]=p1;
        productos[1]= new Producto("XX LAger",14,98.5);

        System.out.println(productos[0]);

    }
}
