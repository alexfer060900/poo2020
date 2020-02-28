package herenciafigura;

import java.util.Scanner;
public class EjecutaFigura {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        int opcion;
        double base, altura, lado, radio;

        do {
            System.out.println("MENU");
            System.out.println("1. Area Triangulo");
            System.out.println("2. Area Rectangulo");
            System.out.println("3. Area Cuadrado");
            System.out.println("4. Area Circulo");
            System.out.println("5. Salir");
            System.out.println("Elija el numero de la opcion a realizar.");
            opcion = sc.nextInt();
            sc.nextLine();
            System.out.println("Escriba el nombre de la figura:");
            nombre = sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("CREACION DE OBJETO TRIANGULO.");
                    System.out.println("Ingrese la base:");
                    base = sc.nextInt();
                    System.out.println("Ingrese la altura: ");
                    altura = sc.nextInt();

                    Triangulo tri = new Triangulo(base, altura, nombre);

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Area = " + tri.calcularAreaTrian(altura, base));
                    break;
                case 2:
                    System.out.println("CREACION DE OBJETO RECTANGULO.");
                    System.out.println("Ingrese la base:");
                    base = sc.nextInt();
                    System.out.println("Ingrese la altura: ");
                    altura = sc.nextInt();

                    Rectangulo recta = new Rectangulo(base, altura, nombre);

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Area = " + recta.calcularAreaRecta(altura, base));
                    break;
                case 3:
                    System.out.println("CREACION DE OBJETO CUADRADO.");
                    System.out.println("Ingrese el lado:");
                    lado = sc.nextInt();

                    Cuadrado cuad = new Cuadrado(lado, nombre);

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Area = " + cuad.calcularAreaCuadrado(lado));
                    break;
                case 4:
                    System.out.println("CREACION DE OBJETO CIRCULO.");
                    System.out.println("Ingrese el radio:");
                    radio = sc.nextInt();

                    Circulo circ = new Circulo(radio, nombre);

                    System.out.println("Nombre: " + nombre);
                    System.out.println("Area = " + circ.calcularAreaCirc(radio));
                    break;
            }

        }
        while (opcion != 5);

    }
}