package polimorfismo_volumen;

import java.util.Scanner;

public class EjecutaFiguraVPoli {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        int opcion;
        double arista, altura, radio;

        do {
            System.out.println("MENU");
            System.out.println("1. Volumen Cubo");
            System.out.println("2. Volumen Cilindro");
            System.out.println("3. Volumen Cono");
            System.out.println("4. Volumen Esfera");
            System.out.println("5. Salir");
            System.out.println("Elija el numero de la opcion a realizar.");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("Escriba el nombre de la figura:");
            nombre = sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("CREACION DE OBJETO CUBO.");
                    System.out.println("Ingrese la arista:");
                    arista = sc.nextInt();

                    CuboPoli cuboP = new CuboPoli(arista, nombre);
                    cuboP.calcularVolumen();

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Volumen = " + cuboP.getVolumen());
                    break;
                case 2:
                    System.out.println("CREACION DE OBJETO CILINDRO.");
                    System.out.println("Ingrese el radio:");
                    radio = sc.nextInt();
                    System.out.println("Ingrese la altura: ");
                    altura = sc.nextInt();

                    CilindroPoli cilP = new CilindroPoli(radio, altura, nombre);
                    cilP.calcularVolumen();

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Volumen = " + cilP.getVolumen());
                    break;
                case 3:
                    System.out.println("CREACION DE OBJETO CONO.");
                    System.out.println("Ingrese el radio:");
                    radio = sc.nextInt();
                    System.out.println("Ingrese la altura:");
                    altura = sc.nextInt();

                    ConoPoli conoP = new ConoPoli(radio, altura, nombre);
                    conoP.calcularVolumen();

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Volumen = " + conoP.getVolumen());
                    break;
                case 4:
                    System.out.println("CREACION DE OBJETO ESFERA.");
                    System.out.println("Ingrese el radio:");
                    radio = sc.nextInt();

                    EsferaPoli esfP = new EsferaPoli(radio, nombre);
                    esfP.calcularVolumen();

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Volumen = " + esfP.getVolumen());
                    break;
            }

        }
        while (opcion != 5);

    }
}
