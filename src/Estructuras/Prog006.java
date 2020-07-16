
package Estructuras;

//@author NIOUX

import java.util.Scanner;
//_Hallar la sumatoria de s=1+2+3+...+n
//Donde "n" es ingresado por el teclado 

public class Prog006 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int s=0, n;
        System.out.print("n: ");
        n=Integer.valueOf(teclado.nextLine());
        for(int a=1 ; a<=n ; a++){
            s=s+a;
        }
        System.out.print("s = " +s);
        teclado.close();
    }
}
