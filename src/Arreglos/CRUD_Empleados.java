
package Arreglos;

//@author NIOUX

import Utils.Leer;

/* 
Empleado:
- Nombre
- DNI
- Teléfono
- Cargo
- Salario
MENU PRINCIPAL
1. Agregar Empleado
2. Eliminar Empleado
3. Editar Empleado
4. Listar Empleado
5. Salir
 */

public class CRUD_Empleados {
    public static String[] nombre = new String[1000];
    public static String[] dni = new String[1000];
    public static String[] telefono = new String[9];
    public static String[] cargo = new String[1000];
    public static String[] salario = new String[30];
    public static int posicion = -1;

    public static void agregarEmpleado() {
        String continuar;
        do {            
                posicion++;
                System.out.println("  Registrar datos del Empleado  ");
                System.out.print("Nombre: ");
                nombre[posicion] = Leer.cadena();
                System.out.print("DNI: ");
                dni[posicion] = Leer.cadena();
                System.out.print("Teléfono: ");
                telefono[posicion] = Leer.cadena();
                System.out.print("Cargo: ");
                cargo[posicion] = Leer.cadena();
                System.out.print("Salario: ");
                salario[posicion] = Leer.cadena();
                System.out.println("¿Deseas registrar otro Empleado [S/N]?");
                continuar = Leer.cadena();
      } while (continuar.equalsIgnoreCase("S"));
    }
    public static void eliminarEmpleado() {
        String continuar;
        do {
                listarEmpleado();
                System.out.print("Ingrese el número del empleado a eliminar: ");
                int numero = Leer.entero();
                numero--;
                for (int i = numero; i < posicion; i++) {
                    nombre[i] = nombre[i + 1];
                    dni[i] = dni[i + 1];
                    telefono[i] = telefono[i + 1];
                    cargo[i] = cargo[i + 1];
                    salario[i] = salario[i + 1];
                }
                nombre[posicion] = "";
                dni[posicion] = "";  
                telefono[posicion] = "";
                cargo[posicion] = "";
                salario[posicion] = "";
                posicion--;
                System.out.println("¿Deseas registrar otro empleado [S/N]?");
                continuar = Leer.cadena();
      } while (continuar.equalsIgnoreCase("S"));
    }
    public static void editarEmpleado() {
          String continuar;
        do {
                listarEmpleado();
                System.out.println("Ingrese el número del empleado a editar: ");
                int numero = Leer.entero();
                numero--;
                System.out.println("Resultado: " + nombre[numero] + "( " + dni[numero] + " ) - " + telefono[numero] +"( " + cargo[numero] + "( " + salario[numero]);
                System.out.print("Nuevo Nombre: ");
                nombre[numero] = Leer.cadena();
                System.out.print("Nuevo DNI: ");
                dni[numero] = Leer.cadena();
                System.out.print("Nuevo Teléfono: ");
                telefono[posicion] = Leer.cadena();
                System.out.print("Nuevo Cargo: ");
                cargo[posicion] = Leer.cadena();
                System.out.print("Nuevo Salario: ");
                salario[posicion] = Leer.cadena();
                System.out.print("¿Deseas editar otro empleado [S/N]?");
                continuar = Leer.cadena();
      } while (continuar.equalsIgnoreCase("S"));
    }
    public static void listarEmpleado() {
        System.out.println("Listado");
        System.out.println("N°\tDNI \t\tNombre Completo  \t\tTeléfono \t\tCargo \t\tSalario ");
        for (int i = 0; i <= posicion; i++) {
            System.out.println((i + 1) + "\t" + dni[i] + "\t" + nombre[i] + "\t" + telefono[i] + "\t" + cargo[i] + "\t" + salario[i]);
        }
    }
    public static void salir() {
        System.out.println("Gracias por su visita");
    }
    public static void error() {
        System.out.println("Error, escoja una opción válida...");
    }
    public static void menuEmpleado() {
        System.out.println("*****MENU PRINCIPAL*****");
        System.out.println("1. Agregar Empleados");
        System.out.println("2. Eliminar Empleados");
        System.out.println("3. Editar Empleados");
        System.out.println("4. Listar Empleados");
        System.out.println("5. Salir del Menú");
        System.out.print("Escoja una opción [1-5]: ");
    }
    public static void inicio() {
        int opcion;
        do {
            menuEmpleado();
            opcion = Leer.entero();
            switch (opcion) {
                case 1:
                    agregarEmpleado();
                    break;
                case 2:
                    eliminarEmpleado();
                    break;
                case 3:
                    editarEmpleado();
                    break;
                case 4:
                    listarEmpleado();
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
