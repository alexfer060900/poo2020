package polimorfismo_deudores;

import java.util.Scanner;

public class EjecutaDeudoresPoli {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Declaración de variables
        String nombre, nroCuenta, opcion, reporteFinal = "";
        double capital, interes;
        int total = 0;
        int nroCliente , plazo,n;

        do {
            total ++;
            System.out.println("----Sistema de ingreso----");
            System.out.println("___________________________");
            System.out.println();
            System.out.print("Ingrese el nombre: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese el número de cuenta: ");
            nroCuenta = entrada.nextLine();
            System.out.print("Ingrese el capital: ");
            capital = entrada.nextDouble();
            System.out.println("Ingrese el numero del cliente: ");
            nroCliente = entrada.nextInt();
            System.out.print("Ingrese el plazo anual: ");
            plazo = entrada.nextInt();
            do{
                System.out.println("---- Elija el tipo de prestamo ---- ");
                System.out.println(" 1. Ingreso por prestamo personal");
                System.out.println(" 2. Ingreso por prestamo hipotecario");
                System.out.println(" 3. Ingreso por prestamo automovil");
                n = entrada.nextInt();
            }while(n > 3 || n < 1);
            switch (n) {
                case 1:
                    interes = capital * 0.1730;
                    PrestamoPersonalPoli personal = new PrestamoPersonalPoli(nroCliente, nombre, nroCuenta, capital,
                            plazo, interes);
                    personal.calcularInteresDeudores();
                    reporteFinal = String.format("%s%s   %d     %.2f\n", reporteFinal, nombre, nroCuenta,
                            personal.getInteresAPagar());
                    break;
                case 2:
                    interes = capital * 0.478;
                    HipotecaPoli hipoteca = new HipotecaPoli(nroCliente, nombre, nroCuenta, capital, plazo, interes);
                    hipoteca.calcularInteresDeudores();
                    reporteFinal = String.format("%s%s   %d     %.2f\n", reporteFinal, nombre, nroCuenta,
                            hipoteca.getInteresAPagar());                    break;
                case 3:
                    interes = capital * 0.1268;
                    AutomovilPoli automovil = new AutomovilPoli(nroCliente, nombre, nroCuenta, capital, plazo, interes);
                    automovil.calcularInteresDeudores();
                    reporteFinal = String.format("%s%s   %d     %.2f\n", reporteFinal, nombre, nroCuenta,
                            automovil.getInteresAPagar());
                    break;
            }
            entrada.nextLine();
            System.out.println("Presione '0' para ingresar otro cliente u otra tecla para mostrar el reporte");
            opcion = entrada.nextLine();
        }while (opcion.toLowerCase().equals("0"));

        System.out.println("\t   ---------------Reporte de Deudores---------------\n"+
                "No. Cliente        Nombre        No. Cuenta        Interés por pagar\n"+
                "____________________________________________________________________\n"
                + reporteFinal +
                "____________________________________________________________________\n");
        System.out.println("Total de Clientes: " +total);
    }
}
