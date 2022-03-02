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
        System.out.println(System.lineSeparator());

        System.out.println("La cantidad de trabajadores que han faltado esta semana es de: "
                + devolverTotAusentes(ausentes)+ System.lineSeparator()+ " la media de bajas semanal es: "+
                hallarMediaSemanal(totalAusentes));
        devolverMedDep();

    }


    // Declaro los atributos estaticos, para poder usarlos en el main, ya que no he creado una clase aparte.




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

    /**
     *  Genera un numero de bajas de forma aleatoria de 0 a 5 y las imprime por pantalla junto con el numero del departamento
     */


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
     * Metodo para generar las bajas semanales por departamentos, es decir dandole el valor de la columna que se quiere
     * sumar por parametro junto con el array generado aleatoriamente
     * @param ausentes
     * @param col
     * @return devuelve el valor de la suma de las bajas por departamento
     */
    public static int bajasSemanalesDep(int[][] ausentes, int col) {


        int bajasPorDep=0;
        for (int i = 0; i < 5; i++) {
            bajasPorDep += ausentes[i][col];
        }
        return bajasPorDep;
    }

    /**
     * Metodo para sumar las bajas semanales indicando por paramentros el numero de la fila que se quiere sumar junto con el array
     * generado aleatoriamente
     * @param ausentes
     * @param fila
     * @return devuelve el valor de la suma solicitada,
     * dentro del metodo he inicializado una variable local, ya que si la hacia global y estatica, lo que hacia era sumar todas las filas
     * por lo que daba valores erroneos, asi solo devuelve lo pedido
     */
    public static int bajasDiaria(int[][] ausentes, int fila) {

        int bajasDiarias=0;
        for (int j = 0; j < 5; j++) {
            bajasDiarias += ausentes[fila][j];
        }
        return bajasDiarias;
    }

    /**
     * Metodo para hallar la media de las bajas semanales en la empresa
     * @param totalAusentes
     * @return devuelve la dicision del total de bajas entre 5 que son el total de dias trabajados
     */
    public static int hallarMediaSemanal(int totalAusentes) {

        return totalAusentes / 5;
    }

    /**
     * Metodo para devolver la media de bajas semanales por departamento aproximados ya que trabajamos con enteros
     */
    public static void devolverMedDep(){
        System.out.println("La media de bajas semanales por departamentos es: " +System.lineSeparator() +
                "Dpto 1= " + bajasDep1/5 +System.lineSeparator() +"Dpto 2= " + bajasDep2/5 + System.lineSeparator() +
                "Dpto 3= " + bajasDep3/5 + System.lineSeparator() +"Dpto 4= " + bajasDep4/5 +System.lineSeparator() +
                "Dpto 5= " + bajasDep5/5);
    }

    /**
     * a traves de los contadores creados para contabilizar la cantidad de ausencias diarias, se hace una suma total que
     * usaremos para conocer la cantidad total de personas que faltan a la semana
     * @param ausentes
     * @return
     */
    public static int devolverTotAusentes(int[][] ausentes) {
        totalAusentes = totalAusentes + ausentesDiarios;
        return totalAusentes;
    }

    /**
     * Metodo para sacar por consola los datos almacenados por departamentos
     */
    public static void devolverDatosDep(){
        System.out.println("Las bajas semanales por departamentos son:" +System.lineSeparator() +
                "Dpto 1= " + bajasDep1 +System.lineSeparator() +"Dpto 2= " + bajasDep2 + System.lineSeparator() +
                "Dpto 3= " + bajasDep3 + System.lineSeparator() +"Dpto 4= " + bajasDep4 +System.lineSeparator() +
                "Dpto 5= " + bajasDep5);

    }

    /**
     * Metodo para imprimir por consola los datos almacenados de las bajas diarias
     */
    public static void devolverDatosSem(){
        System.out.println("El total de ausentes diarios son:" +System.lineSeparator() +
                "Lunes: " + bajasL + System.lineSeparator() +"Martes: " + bajasM +System.lineSeparator() +
                "Miercoles: " + bajasX +System.lineSeparator() + "Jueves: " + bajasJ + System.lineSeparator() +"Viernes: " + bajasV);

    }

    /**
     * Metodo que deberia pintar mediante un diagrama de barras el porcentaje de bajas
     * @param ausentes
     */
    public static void pintarDiagrama(int[][] ausentes){

    }

}
