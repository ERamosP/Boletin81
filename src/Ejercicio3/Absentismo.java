package Ejercicio3;

import java.util.Scanner;

public class Absentismo {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {


        generarBajas(ausentes);
        System.out.println(System.lineSeparator());
        bajasDep1 = bajasSemanalesDep(ausentes, 0);
        bajasDep2 = bajasSemanalesDep(ausentes, 1);
        bajasDep3 = bajasSemanalesDep(ausentes, 2);
        bajasDep4 = bajasSemanalesDep(ausentes, 3);
        bajasDep5 = bajasSemanalesDep(ausentes, 4);
        devolverDatosDep();
        System.out.println(System.lineSeparator());
        bajasL = bajasDiaria(ausentes, 0);
        bajasM = bajasDiaria(ausentes, 1);
        bajasX = bajasDiaria(ausentes, 2);
        bajasJ = bajasDiaria(ausentes, 3);
        bajasV = bajasDiaria(ausentes, 4);
        devolverDatosSem();
        System.out.println("La cantidad de trabajadores que han faltado esta semana es de: " + devolverTotAusentes(ausentes));

    }

    //el primer hueco pertenece a los dias de la semana [7] y el segundo a los departamentos existentes [5]

    static int[][] ausentes = new int[5][5];
    static int bajasDep1;
    static int bajasDep2;
    static int bajasDep3;
    static int bajasDep4;
    static int bajasDep5;
    static int bajasL;
    static int bajasM;
    static int bajasX;
    static int bajasJ;
    static int bajasV;
    static int totalAusentes = 0;
    static int ausentesDiarios = 0;

    public static void generarBajas(int[][] ausentes) {
        int k = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println();

            for (int j = 0; j < 5; j++) {
                ausentes[i][j] = (int) Math.round(Math.random() * 5);
                System.out.print(" Dpto " + (j + 1) + ": " + ausentes[i][j] + " ");
                ausentesDiarios += ausentes[i][j];
            }

        }
        System.out.println();
    }

    /**
     * Metodo para conocer las bajas semanales por departamento, contabilizando que como maximo hay 5 empleados por dep.
     *
     * @param ausentes
     * @return el total de las personas que estan de baja esa semana
     */
    public static int bajasSemanalesDep(int[][] ausentes, int col) {


        int bajasPorDep=0;
        for (int i = 0; i < 5; i++) {
            bajasPorDep += ausentes[i][col];
        }
        return bajasPorDep;
    }

    public static int bajasDiaria(int[][] ausentes, int fila) {

        int bajasDiarias=0;
        for (int j = 0; j < 5; j++) {
            bajasDiarias += ausentes[fila][j];
        }
        return bajasDiarias;
    }

    public static int devolverTotAusentes(int[][] ausentes) {
        totalAusentes = totalAusentes + ausentesDiarios;
        return totalAusentes;
    }

    public static void devolverDatosDep(){
        System.out.println("Las bajas semanales por departamentos son:" +System.lineSeparator() +
                "Dpto 1= " + bajasDep1 +System.lineSeparator() +"Dpto 2= " + bajasDep2 + System.lineSeparator() +
                "Dpto 3= " + bajasDep3 + System.lineSeparator() +"Dpto 4= " + bajasDep4 +System.lineSeparator() +
                "Dpto 5= " + bajasDep5);

    }
    public static void devolverDatosSem(){
        System.out.println("El total de ausentes diarios son:" +System.lineSeparator() +
                "Lunes: " + bajasL + System.lineSeparator() +"Martes: " + bajasM +System.lineSeparator() +
                "Miercoles: " + bajasX +System.lineSeparator() + "Jueves: " + bajasJ + System.lineSeparator() +"Viernes: " + bajasV);

    }


}
