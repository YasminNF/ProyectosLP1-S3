
package Estructuras;

//@author NIOUX

import java.util.Scanner;


public class Prog005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,temp;
        System.out.print("Valor de a = ");
        a=Integer.valueOf(teclado.nextLine());
        System.out.print("Valor de b = ");
        b=Integer.valueOf(teclado.nextLine());
        teclado.close();
        System.out.println("[" + a + "," + b + "]");
        if (a>b) {
            temp = a;
            a = b;
            b = temp;
        }
        do {            
            System.out.println(a);
            a++;
        } while (a<=b);
    }
    
}
