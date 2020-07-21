
package Arreglos;

//@author NIOUX

import Utils.Leer;

/* 
persona
- Nombre
- DNI
 - Fecha de Nacimiento
MENU PRINCIPAL
1. Agregar Personas
2. Eliminar Personas
3. Editar Personas
4. Listar Personas
5. Salir
 */

public class CRUD {
    // Variables estáticas (Globales)

    public static String[] nombre = new String[1000];
    public static String[] dni = new String[1000];
    public static String[] fnacimiento = new String[1000];
    public static int posicion = -1;

    public static void agregarpersona() {
        String continuar;
        do {            
                posicion++;
                System.out.println("Agregar Persona");
                System.out.print("Nombre: ");
                nombre[posicion] = Leer.cadena();
                System.out.print("DNI: ");
                dni[posicion] = Leer.cadena();
                System.out.print("Fecha de Nacimiento: ");
                fnacimiento[posicion] = Leer.cadena();
                System.out.println("¿Deseas agregar otro [S/N]?");
                continuar = Leer.cadena();
      } while (continuar.equalsIgnoreCase("S"));
    }
    public static void eliminarpersona() {
        String continuar;
        do {
                listarpersona();
                System.out.print("Ingrese el numero de la persona a eliminar: ");
                int numero = Leer.entero();
                numero--;
                for (int i = numero; i < posicion; i++) {
                    nombre[i] = nombre[i + 1];
                    dni[i] = dni[i + 1];
                    fnacimiento[i] = fnacimiento[i + 1];
                }
                nombre[posicion] = "";
                dni[posicion] = "";
                fnacimiento[posicion] = "";
                posicion--;
                System.out.println("¿Deseas agregar otro [S/N]?");
                continuar = Leer.cadena();
      } while (continuar.equalsIgnoreCase("S"));
    }
    public static void editarpersona() {
          String continuar;
        do {
                listarpersona();
                System.out.println("Ingrese el numero de la persona a editar: ");
                int numero = Leer.entero();
                numero--;
                System.out.println("Resultado: " + nombre[numero] + "( " + dni[numero] + " ) - " + fnacimiento[numero]);
                System.out.print("Nuevo Nombre: ");
                nombre[numero] = Leer.cadena();
                System.out.print("Nuevo DNI: ");
                dni[numero] = Leer.cadena();
                System.out.print("Nueva Fecha de Nacimiento: ");
                fnacimiento[numero] = Leer.cadena();
                System.out.print("¿Deseas agregar otro [S/N]?");
                continuar = Leer.cadena();
      } while (continuar.equalsIgnoreCase("S"));
    }
    public static void listarpersona() {
        System.out.println("Listado");
        System.out.println("N°\tDNI\t\tF. Nac. \t\tNombre Completo");
        for (int i = 0; i <= posicion; i++) {
            System.out.println((i + 1) + "\t" + dni[i] + "\t" + fnacimiento[i] + "\t" + nombre[i]);
        }
    }
    public static void salir() {
        System.out.println("Gracias por su visita");
    }
    public static void error() {
        System.out.println("Error, Opcion incorrecta.....");
    }
    public static void menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. Agregar Personas");
        System.out.println("2. Eliminar Personas");
        System.out.println("3. Editar Personas");
        System.out.println("4. Listar Personas");
        System.out.println("5. Salir");
        System.out.print("Escoja una de las opciones: ");
    }
    public static void inicio() {
        int opcion;
        do {
            menu();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregarpersona();
                    break;
                case 2:
                    eliminarpersona();
                    break;
                case 3:
                    editarpersona();
                    break;
                case 4:
                    listarpersona();
                    break;
                case 5:
                    salir();
                    break;
                default:
                    error();
            }

        } while (opcion != 5);
    }
    public static void main(String[] args) {
        inicio();
    }
}
