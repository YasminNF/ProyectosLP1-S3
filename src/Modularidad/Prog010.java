
package Modularidad;

//@author NIOUX
//Métodos que reciben parámetros y devuelven valores
public class Prog010 {
    public static int factorial(int numero){
        int fact = 1;
        for (int i = 1; i <= numero; i++) {
            fact*=i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println("El factorial es: ");
        System.out.println(factorial(7));
    }
}
