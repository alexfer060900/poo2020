package polimorfismo_figura;

import java.util.Scanner;

public class EjecutaFiguraPoli {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

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
            String nombre = sc.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("CREACION DE OBJETO TRIANGULO.");
                    System.out.println("Ingrese la base:");
                    TrianguloPoli triPoli = new TrianguloPoli();
                    triPoli.setBaseTria(sc.nextInt());
                    System.out.println("Ingrese la altura: ");
                    triPoli.setAlturaTria(sc.nextInt());
                    triPoli.calcularArea();
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Area = " + triPoli.getArea());
                    break;
                case 2:
                    System.out.println("CREACION DE OBJETO RECTANGULO.");
                    System.out.println("Ingrese la base:");
                    RectanguloPoli rectPoli = new RectanguloPoli();
                    rectPoli.setBaseRecta(sc.nextInt());
                    System.out.println("Ingrese la altura: ");
                    rectPoli.setAlturaRecta(sc.nextInt());
                    rectPoli.calcularArea();
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Area = " + rectPoli.getArea());
                    break;
                case 3:
                    System.out.println("CREACION DE OBJETO CUADRADO.");
                    System.out.println("Ingrese el lado:");
                    CuadradoPoli cuadPoli = new CuadradoPoli();
                    cuadPoli.setLadoCuad(sc.nextInt());

                    cuadPoli.calcularArea();
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Area = " + cuadPoli.getArea());
                    break;
                case 4:
                    System.out.println("CREACION DE OBJETO CIRCULO.");
                    System.out.println("Ingrese el radio:");
                    CirculoPoli circPoli = new CirculoPoli();
                    circPoli.setRadioCirc(sc.nextInt());

                    circPoli.calcularArea();
                    System.out.println("Nombre: " + nombre);
                    System.out.println("Area = " + circPoli.getArea());
                    break;
            }

        }
        while (opcion != 5);

    }
}

