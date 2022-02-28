package Ejercicio4;


import java.util.Scanner;

public class CuadradoMagico {

    /*
    Precondiciones, ejercicio para crear tablas con numero impares, si se le introduce un numero par, no funciona
     */
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca el numero de filas y columnas, seleccione un numero impar");
        int n=sc.nextInt();
        int[][] cuadradoMagico=new int[n][n];
        int fila=0;
        int col=n/2;
        int numero=1;
        int f;
        int c;


        while(numero<=n*n){
            cuadradoMagico[fila][col]=numero;
            numero++;
            f=fila;
            c=col;
            fila-=1;
            col+=1;
            if (fila==-1){
                fila=n-1;
            }
            if(col==n){
                col=0;
            }
            if (cuadradoMagico[fila][col]!=0){
                fila=f+1;
                col=c;
            }
        }
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print(cuadradoMagico[i][j]+" ");

            }
            System.out.println();
        }

    }
}
