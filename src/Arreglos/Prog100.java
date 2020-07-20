
package Arreglos;

//@author NIOUX

import Utils.Leer;


//utilizando metodos, diseñe un programa que permite el ingreso
//de valores a un arreglo y los muestre
//valores del arreglo 10,1,-5,60,1

public class Prog100 {
    public static int[] numeros = new int[1000];
    public static int cantidad;
    
    public static void escribirarreglo(){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numero[ " + i + " ]: ");
            numeros[i]=Leer.entero();         
        }   
    }
    public static void imprimirarreglo(){
        System.out.println("Valores del arreglo");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numero[ " +i + " ]: " + numeros[i]);                          
        }   
    }
    public static void inicio(){
        System.out.print("Cantidad de elementos: "); 
        cantidad = Leer.entero();
        escribirarreglo();
        imprimirarreglo();
    }
    public static void main(String[] args) {
        inicio();
    }
}
