package Ejercicio3;

import java.util.Scanner;

public class Absentismo {

    static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {


         int[][]ausentes=new int[7][5];
         generarBajas(ausentes);
        System.out.println("Las bajas semanales del departamento solicitado es: "+bajasSemanalesDep(ausentes));
        System.out.println("El total de ausentes del dia especificado es: "+bajasDiaria(ausentes));
        System.out.println("La cantidad de trabajadores que han faltado esta semana es de: "+devolverTotAusentes(ausentes));

    }

        //el primer hueco pertenece a los dias de la semana [7] y el segundo a los departamentos existentes [5]

        static int bajasSemanalesDep=0;
        static int bajasDiarias =0;
        static int totalAusentes=0;
        static int ausentesDiarios=0;


        public static void pedirFila(){
            System.out.println("¿De que dia de la semana desea conocer el absentsimo, indiquela en numeros?");

        }

        public static void pedirCol(){
            System.out.println("¿De que departamento desea conocer el absentsimo?");

        }

        public static int leerDato(){
            return sc.nextInt();
        }




        public static void generarBajas(int [] [] ausentes) {
            for (int i = 0; i < 7; i++) {
                System.out.println();
                for (int j=0;j<5;j++){
                ausentes[i][j] = (int) Math.round(Math.random() * 5);
                    System.out.print(ausentes[i][j]+" ");
                    ausentesDiarios+=ausentes[i][j];
                }
            }System.out.println();
        }

    /**
     * Metodo para conocer las bajas semanales por departamento, contabilizando que como maximo hay 5 empleados por dep.
     * @param ausentes
     * @return el total de las personas que estan de baja esa semana
     */
        public static int bajasSemanalesDep(int[][] ausentes){

            int col;
           do {

              pedirCol();
              col=leerDato()-1;
            }while (col>4);
                for (int i = 0; i < 7; i++) {
                    bajasSemanalesDep += ausentes[i][col];
                }

            return bajasSemanalesDep;
        }

    public static int bajasDiaria(int[][] ausentes){

        int fila;
        do {
            pedirFila();
            fila=leerDato()-1;
        }while (fila>6);
        for (int j=0; j<5;j++){
            bajasDiarias +=ausentes[fila][j];
        }


        return bajasDiarias;
    }
    public static int devolverTotAusentes(int[][] ausentes) {
            totalAusentes = totalAusentes + ausentesDiarios;
            return totalAusentes;
        }

    /**
     *  Metodo para conocer las bajas diarias de los empleados
     * @param ausentes
     * @returnel total de las bajas de ese dia
     */


        //Imprime por pantalla el array con el numero de Dpto. al que pertenecen

         /*   for (int j=0;j<5;j++){

                System.out.println(" Dpto " + (j+1) + " y los ausentes diarios son: "+totalAusentes);

            }*/



}
