package mx.edu.uttt.POO;

public class Alumno{

    //variables de instancia
    private String nombre;
    private int edad;
    private char sexo;
    private boolean activo;
    private double promedio;

    //constructor vacio
    public Alumno(){
    this.nombre = "Sin nombre";
    this.edad= 17;
    this.sexo ='x';
    this.activo =false;
    this.promedio =0.0;
    }

    //constructor que recibe parametros

    public Alumno(String nombre, int edad, char sexo, boolean activo, double promedio){
        this.nombre = nombre;
        this.edad = edad>=17 && edad<=50?edad:17;
        this.sexo=sexo=='h' || sexo =='H'? sexo:'h';
        this.activo=activo;
        this.promedio= promedio>= 0.0 && promedio<=10.0?promedio:0.0;
    }

    //metodo mutador (set)

    public void setNombre (String nombre){
        this.nombre=nombre;
    }
    //metodo accesor (get)
    public String getNombre(){
        return this.nombre;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean getActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", activo=" + activo +
                ", promedio=" + promedio +
                '}';
    }
}


