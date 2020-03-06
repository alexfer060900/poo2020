package datostipoobjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaNombres {
    public static void main(String[] args) {
        int opcion;
        List<String> nombres = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("MENU");
            System.out.println("1. Agregar nuevo nombre.");
            System.out.println("2. Presentar lista de nombres.");
            System.out.println("3. Salir.");
            System.out.println("Ingrese la opcion a realizar por favor.");
            opcion = sc.nextInt();
            sc.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre: ");
                    String nombre = sc.nextLine();
                    nombres.add(nombre);
                    break;
                case 2:
                    System.out.println("Valores de la lista: ");
                    for (String nomb: nombres) {
                        System.out.println(nombres);
                        break;
                    }
            }
        }while (opcion != 3);
    }
}
