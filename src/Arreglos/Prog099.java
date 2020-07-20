
package Arreglos;

//@author NIOUX

import java.util.ArrayList;
import java.util.Scanner;

// Diseñar un algoritmo que permita el ingreso de 7 
// valores a una arreglo y mostrarlos

public class Prog099 {
   public static ArrayList<Integer> listaEnteros = new ArrayList<>();
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
       System.out.println("LLENE EL ARREGLO DE ENTEROS");
       int ultimoV=-1;
       while(ultimoV!=0){
          System.out.println("DIGITE UN NÚMERO, 0 PARA SALIR DEL LLENADO : ");
          ultimoV=scan.nextInt();
          listaEnteros.add(ultimoV); 
       }
       System.out.println("DIGITE UN NUMERO A BUSCAR :");
       ultimoV=scan.nextInt();
       int cant=0;
       for(int i=0;i<listaEnteros.size();i++){
           if(ultimoV==listaEnteros.get(i)){
               cant++;
           }
       }
       
       System.out.println("EL NÚMERO A BUSCAR FUE : "+ultimoV);
       System.out.println("SE ENCONTRARON : "+cant+" VECES");
    }
}
