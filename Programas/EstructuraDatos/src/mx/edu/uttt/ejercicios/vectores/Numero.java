package ejercicios.vectores;

public class Numero {
    private int valor;

    public Numero() {
    }

    public Numero(int numero) {
        this.valor = numero;
    }

    public int getNumero() {
        return valor;
    }

    public void setNumero(int numero) {
        if(numero >= 0){
        this.valor = numero;
        }
    }

    @Override
    public String toString() {
        return "Valor{" +
                "valor=" + valor +
                '}';
    }
}
