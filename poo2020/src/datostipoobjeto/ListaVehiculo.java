package datostipoobjeto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaVehiculo {
    public static void main(String[] args) {

        List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
        System.out.println("SISTEMA DE INGRESO DE VEHICULOS");
        boolean bandera = true;
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("Digite 1 para almacenar nuevo: ");
            System.out.println("Digite 2 para presentar vehiculos: ");
            System.out.println("Digite 3 para salir: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    Vehiculo vehiculo = new Vehiculo();
                    System.out.println("Ingrese la placa: ");
                    vehiculo.setPlaca(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese la marca: ");
                    vehiculo.setMarca(sc.nextLine());
                    System.out.println("Ingrese el modelo: ");
                    vehiculo.setModelo(sc.nextLine());
                    System.out.println("Ingrese el color: ");
                    vehiculo.setColor(sc.nextLine());
                    System.out.println("Ingrese el año: ");
                    vehiculo.setAño(sc.nextInt());
                    sc.nextLine();
                    System.out.println("Ingrese el cilindraje: ");
                    vehiculo.setCilindraje(sc.nextLine());

                    vehiculos.add(vehiculo);
                    break;
                case 2:
                    System.out.println("Placa\tMarca\tCilindraje");
                    for (Vehiculo v: vehiculos){
                        System.out.println(v.getPlaca() + "\t" + v.getMarca() + "\t" + v.getCilindraje());
                    }
                    break;
                case 3:
                    bandera = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta.");
            }
        }while (bandera);
    }
}
