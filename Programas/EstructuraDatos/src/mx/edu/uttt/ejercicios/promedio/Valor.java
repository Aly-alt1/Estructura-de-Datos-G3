package ejercicios.promedio;

public class Valor {
    private double cantidad;

    public Valor() {
        this.cantidad = 0.0;
    }

    public Valor(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        if(cantidad >= 0){
        this.cantidad = cantidad;
        }
    }

    @Override
    public String toString() {
        return "Valor{" +
                "cantidad=" + cantidad +
                '}';
    }
}
