
package Arreglos;

//@author NIOUX

import Utils.Leer;


/*Desarrolle un programa que permita el ingreso de valores a un arreglo y muestre los valores ingresados indicando si el número es PAR/IMPAR y POSITIVO/NEGATIVO/NEUTRO
Dato de Entrada:
Cantidad: 5
numeros[0]: 10
numeros[1]: -3
numeros[2]: 4
numeros[3]: -7
numeros[4]: 0
Dato de Salida:
10 es Par y Positivo
-3 es Impar y Negativo
4 es Par y Positivo
-7 es Impar y Negativo
0 es Par y Neutro*/

public class Prog103 {
    public static int[] numeros = new int[100];
    public static int cantidad;

    public static void escribirarreglo(){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros[ " + i + " ]: ");
            numeros[i] = Leer.entero();
        }        
    }
    public static String parimpar(int numero){
        String resultado;
        if (numero%2==0) {
            if(numero==0){
                resultado="Neutro";
            }else{
                resultado ="Par";
            }
        }else{ 
            resultado = "Impar";
        }
        return resultado;
    }
    public static String positivonegativo(int numero){
        String resultado;
        if (numero>0) {
            resultado = "Positivo";
        }else if (numero<0){
            resultado = "negativo";
        } else{
            resultado = "Neutro";
        }
        return resultado;
    }
    public static void imprimir(){
        System.out.println("Resultado: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i] + ": " + positivonegativo(numeros[i]) + " - " + parimpar(numeros[i]));
        }
    }
    public static void inicio(){
        System.out.print("cantidad: ");
        cantidad = Leer.entero();
        escribirarreglo();
        imprimir();
    }
    public static void main(String[] args) {
        inicio();
    }
}
