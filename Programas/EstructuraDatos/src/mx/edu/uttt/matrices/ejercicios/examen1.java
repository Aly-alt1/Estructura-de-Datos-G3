package mx.edu.uttt.matrices.ejercicios;

import javax.swing.*;

public class examen1 {

   public static void main(String[]args){
       int [][]m;
       m= new int[solicitarFila()][3];

       iniciar(m);
       imprimir(m);
       promedios(m);

   }


   public static void iniciar(int [][]m){
       for (int i = 0; i < m.length; i++) {
           JOptionPane.showMessageDialog(null, "Datos de la persona " + (i + 1));

           m[i][0] = solicitarGenero();

           m[i][1] = solicitarTrabajo();


           if (m[i][1] == 1) {
               m[i][2] = generarSueldo();
           } else {
               m[i][2] = 0;
           }
       }


   }

    public static int solicitarFila(){

    int valor = 0;
    boolean sentinel = true;

    do {
        try {
            valor = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de empleados"));

            if (valor > 0)
                sentinel = false;
            else
                JOptionPane.showMessageDialog(null, "El numero debe de ser mayor a 0");

        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "El numero debe de ser un numero valido");
        }


    } while (sentinel);

        return valor;

}



public static int solicitarGenero(){
       int genero=0;

       boolean sentinel = true;

       do{
           try{
               genero = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el genero (1= hombre, 2= mujer)"));
               if (genero>0 && genero<3)
                   sentinel= false;
               else
                   JOptionPane.showMessageDialog(null, "El genero debe de estar entre 1 y 2");
           } catch (NumberFormatException ex) {
        System.out.println(ex.getMessage());
         JOptionPane.showMessageDialog(null, "El genero debe de ser un numero valido");
    }
       }while(sentinel);

       return genero;
}

public static int solicitarTrabajo(){
    int chamba=0;

    boolean sentinel = true;

    do{
        try{
            chamba = Integer.parseInt(JOptionPane.showInputDialog("Ingrese si tiene trabajo (1= si, 2= no)"));
            if (chamba>0 && chamba<3)
                sentinel= false;
            else
                JOptionPane.showMessageDialog(null, "El numero debe de estar entre 1 y 2");
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
            JOptionPane.showMessageDialog(null, "El numero debe de ser un numero valido");
        }
    }while(sentinel);

    return chamba;
}

public static int generarSueldo() {
        return (int) (Math.random() * 1401) + 600;
   }


public static void promedios(int [][]m) {
    int totalH = 0;
    int totalM = 0;
    int hChamba = 0;
    int mChamba = 0;
    int totalSueldoH = 0;
    int totalSueldoM = 0;


    for (int i = 0; i < m.length; i++) {
        int genero = m[i][0];
        int trabajo = m[i][1];
        int sueldo = m[i][2];

        if (genero == 1) { // Hombre
            totalH++;
            if (trabajo == 1) {
                hChamba++;
                totalSueldoH += sueldo;
            }
        } else { // Mujer
            totalM++;
            if (trabajo == 1) {
                mChamba++;
                totalSueldoM += sueldo;
            }
        }

    }

    //promedio y porcentaje
    double porcentajeH = (totalH * 100.0) / m.length;
    double porcentajeM = (totalM * 100.0) / m.length;

    double HombresChamba;
    if (totalH > 0) {
        HombresChamba = (hChamba * 100.0) / totalH;
    } else {
        HombresChamba = 0;
    }

    double MujeresChamba;
    if (totalM > 0) {
        MujeresChamba = (mChamba * 100.0) / totalM;
    } else {
        MujeresChamba = 0;
    }

    //sueldo

    double sueldoPHombres;
    if (hChamba > 0) {
        sueldoPHombres = (double) totalSueldoH / hChamba;
    } else {
        sueldoPHombres = 0;
    }

    double sueldoPMujeres;
    if (mChamba > 0) {
        sueldoPMujeres = (double) totalSueldoM / mChamba;
    } else {
        sueldoPMujeres = 0;
    }

    //resultados
    String resultados = "RESULTADOS DE LA ENCUESTA:\n\n" +
            "Porcentaje de hombres: " + porcentajeH + "%\n" +
            "Porcentaje de mujeres: " + porcentajeM + "%\n" +
            "Porcentaje de hombres que trabajan: " + HombresChamba + "%\n" +
            "Porcentaje de mujeres que trabajan: " + MujeresChamba + "%\n" +
            "Sueldo promedio de hombres que trabajan: $" + sueldoPHombres + "\n" +
            "Sueldo promedio de mujeres que trabajan: $" + sueldoPMujeres;

    JOptionPane.showMessageDialog(null, resultados);


}


    public static void imprimir(int[][] m) {
        StringBuilder sb = new StringBuilder("MATRIZ:\n\n");


        sb.append("Persona  Genero  Trabaja  Sueldo\n");
        sb.append("--------------------------------\n");


            for (int i = 0; i < m.length; i++) {
                sb.append(i + 1).append("        ")
                        .append(m[i][0]).append("       ")
                        .append(m[i][1]).append("        ")
                        .append(m[i][2]).append("\n");
            }


        JOptionPane.showMessageDialog(null, sb.toString());
    }

}
