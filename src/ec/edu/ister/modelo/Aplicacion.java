package ec.edu.ister.modelo;

import java.util.Scanner;

/**
 *
 * @author Andres
 */
public class Aplicacion {
    
    public static int leerEntero(String texto){//
        Scanner ingreso =new Scanner(System.in);
        System.out.println(texto);
        int dato=ingreso.nextInt();
        return dato;
    }
    public static int menu(){//creacion del menu de opciones
        System.out.println("---Menu---");
        System.out.println("1. Agregar Final");
        System.out.println("2. Recorrer lista");
        System.out.println("3. Borar un elemento");
        System.out.println("4. Salir");
        int dato=leerEntero("Seleccione una opcion: ");
        return dato;
    }
    
    public static void main(String[] args) {
        int opcion;
        Lista coleccion=new Lista();//llamado de la clase para el acceso a los metodos
        do{
            opcion=menu();
            switch (opcion) {
                case 1:
                coleccion.agregarNodoAlFinal(leerEntero("Ingrese un valor: "));//Insertar nodos al final
                break;
            case 2:
                System.out.println("Lista");//impresion de la lista
                coleccion.recorreLista();
                break;
            case 3:
                coleccion.eliminarNodos(leerEntero("Ingrese un valor: "));//Eliminar los nodos con un dato dado
                break;
            default:
                System.out.println("Fin del programa!");;
            }
        }while(opcion!=4);
    }
}
