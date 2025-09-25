package mx.edu.uttt.POO;

import javax.swing.*;

public class TestAlumno {

    public static void main(String[] args) {
        //crear una isntancia de la clase alumno
        char sexo= '\0';
        boolean activo =false;



        Alumno a1 = new Alumno();

        a1.setNombre(JOptionPane.showInputDialog("Introduce tu nombre"));

        a1.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Introduce la Edad"))); ;

        sexo = JOptionPane.showInputDialog("Introduce tu sexo").charAt(0);
        a1.setSexo(sexo);

        String valor = JOptionPane.showInputDialog("Estas Activo SI/NO");
        activo = valor.equalsIgnoreCase("Si")? true:false;

        a1.setActivo(activo);

        a1.setPromedio(Double.parseDouble(JOptionPane.showInputDialog("Introduce tu promedio")));



        String salida =" Resulados  \n"+
                        "\n Nombre: "+a1.getNombre() +
                        "\n Edad: "+a1.getEdad() +
                        "\n Sexo: "+a1.getSexo() +
                        "\n Activo: "+a1.getActivo() +
                        "\n Promedio: "+a1.getPromedio();

        //System.out.println( salida);

        System.out.println(a1);



    }



}
