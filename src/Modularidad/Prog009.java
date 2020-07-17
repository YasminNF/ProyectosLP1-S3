
package Modularidad;

//@author NIOUX
//Métodos que devuelven valores

public class Prog009 {
    public static String miuniversidad(){
        String universidad = "Universidad Nacional Tecnológica de Lima Sur";
        return universidad;
    }
    public static void main(String[] args) {
        System.out.println(miuniversidad());
        System.out.println(miuniversidad().toUpperCase());
    }
}
