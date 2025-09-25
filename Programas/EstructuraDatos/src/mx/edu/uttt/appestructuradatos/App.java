package mx.edu.uttt.appestructuradatos;
import javax.swing.JOptionPane;
public class App {
    public static void main (String[] args){
        iniciar();
    }

    public static void iniciar(){

        String opcion ="";
        boolean sentinel = true;

        do {
            opcion = JOptionPane.showInputDialog(Menus.obtenerMenuPrincipal());


            switch (opcion){
                case "1":
                   arreglos();
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Opcion 2");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null, "Opcion 3");
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "Opcion 4");
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Opcion 5");
                    break;
                case "6":
                    JOptionPane.showMessageDialog(null, "Se acabó");
                    sentinel = false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida");
            }
        }while(sentinel);

        }


    public static void arreglos(){
        String opcion = "";
        boolean sentinel= true;

        do {
            opcion = JOptionPane.showInputDialog(Menus.obtenerMenuArreglos());

            switch (opcion){
                case "1":
                    JOptionPane.showMessageDialog(null,"Vectores");
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null,"Matrices");
                    break;
                case "3":
                    JOptionPane.showMessageDialog(null,"Gracias por Utilizar los arreglos");
                    sentinel=false;
                    break;

                default:
                    JOptionPane.showMessageDialog(null,"Opcion no valida");
            }
        }while (sentinel);
    }
}
