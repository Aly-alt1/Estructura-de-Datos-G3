package matrices;

public class DeclaracionMatrices {
    public static void main(String [] args){
        //Declaracion de matrices
        int numeroAlumnos[][];
        double [] [] calificaciones;
        String [] [] nombresMujeres, nombresMen [][];

        //instanciar matices
        int i=0, j=0, fila =5, columna =4;
        numeroAlumnos = new int[3][3];
        calificaciones = new double [fila][columna];
        int numAlumnos = 15, numeroExamenes = 5;

        double[][] examenes = new double[numAlumnos][numeroExamenes];

       //asignar valores iniciales a la matriz

        int vector [] = {1,2,6,8,9};
        int [][] matriz= {
                {1,2,3,4},
                {3,4,5,6},
                {4,5,6,7},
                {6,7,10,12}
        };

        int valor = matriz [0][0];
        valor = matriz[0][j];
        valor= matriz [i][j];
        valor = matriz[matriz.length-1][j];//se obtiene la ultima fila y columna j, .length -1 coloca a la ultima fila
       //la ultima fila y la ultima columna
        valor = matriz [matriz.length-1][matriz[matriz.length-1].length-1];



        //char[][] grades;
        //grades = new char[4][];

        //grades[0] = new char[23];
        //grades[1] = new char[16],

        //tridimencional
        //double[][][] x = new double[2][3][3];

        //instanciar varios objetos de auto
        Auto sedan1 = new Auto("BMW",0,0.0);
        Auto sedan2 = new Auto("BMW",100,15.0);
        Auto sedan3 = new Auto("Toyota",0,0.0);
        Auto sportCars = new Auto("Ferrari",0,0.0);
        Auto rv1 = new Auto("Jeep",0,0.0);
        Auto rv2 = new Auto("Ford",0,30.0);

        //Declaracion e inicializacion de una matriz de autos
        Auto[][] cars= {
                {sedan1, sedan2, sedan3},
                {sportCars, new Auto("Bocho", 0, 1.2), sedan3},
                {rv1, rv2, new Auto("Tsuru", 0, 0.0)}
        };

        String Valor = cars [1][1].getModel();
        double gallon = cars[2][1].getGalonOfGas();

    }

}
