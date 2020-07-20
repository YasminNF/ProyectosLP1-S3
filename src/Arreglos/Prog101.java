
package Arreglos;

//@author NIOUX

import Utils.Leer;


// Desarrollar un programa que permita el ingreso de valores
// a un arreglo y muestre la sumatoria de sus elementos. 
//Utilizando métodos.

public class Prog101 {
    public static int[] numeros = new int[1000];
    public static int cantidad;
    public static void escribirarreglo(){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros[ " + i + " ]: ");
            numeros[i] = Leer.entero();
        }
    }
    public static void sumatoria(){
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma+=numeros[i];     
        }
        System.out.println("Resultado(Sumatoria):" + suma );
    }
    public static void inicio(){
        System.out.print("cantidad: ");
        cantidad = Leer.entero();
        escribirarreglo();
        sumatoria();
    }

    public static void main(String[] args) {
        inicio();
    }
}
