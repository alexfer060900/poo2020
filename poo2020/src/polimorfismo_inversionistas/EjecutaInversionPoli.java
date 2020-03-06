package polimorfismo_inversionistas;

import java.util.Scanner;

public class EjecutaInversionPoli {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nomCliente;
        int numCliente, numCuenta, opcion;
        double capInvert, plazInver, inteAnual = 0;

        String cadena2 = "" ;
        System.out.println("CALCULO DE SUELDO DE EMPLEADOS");
        String cadena = "REPORTE DE INVERSIONES\nNo.Cliente\t\t\tNOMBRE\t\t\t\tNo.Cuenta\t\t\t\tInterés GANADO\n";
        cadena += "-----------------------------------------------------------------------------------------";
        boolean salir = true;
        while(salir){
            System.out.println("1. Para calcular el interes de la Cuenta de Ahorro");
            System.out.println("2. Para calcular el interes de la Cuenta de Pagaré");
            System.out.println("3. Para calcular el interes de la Cuenta  Maestra");
            opcion = teclado.nextInt();
            switch (opcion){
                case 1:
                    System.out.print("Numero  del Cliente: ");
                    teclado.nextLine();
                    numCliente = teclado.nextInt();
                    System.out.print("Nombre del Cliente: ");
                    teclado.nextLine();
                    nomCliente = teclado.nextLine();
                    System.out.print("Numero de Cuenta: ");
                    numCuenta = teclado.nextInt();
                    System.out.print("Capital invertido: ");
                    capInvert = teclado.nextDouble();
                    System.out.print("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();
                    inteAnual = 0.15;
                    AhorroPoli ahorroP = new AhorroPoli(nomCliente, numCliente, numCuenta, capInvert, plazInver,
                            inteAnual);
                    ahorroP.calcularInteres();

                    cadena2 += "\t\t"+ahorroP.getNumCliente()+"\t\t\t"+ahorroP.getNomCliente()+"\t\t\t"
                            +ahorroP.getNumCuenta()+"\t\t\t"+ahorroP.getInteresGanado()+"\n";
                    break;
                case 2:
                    System.out.print("Numero  del Cliente: ");
                    teclado.nextLine();
                    numCliente = teclado.nextInt();
                    System.out.print("Nombre del Cliente: ");
                    teclado.nextLine();
                    nomCliente = teclado.nextLine();
                    System.out.print("Numero de Cuenta: ");
                    numCuenta = teclado.nextInt();
                    System.out.print("Capital invertido: ");
                    capInvert = teclado.nextDouble();
                    System.out.print("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();
                    inteAnual = 0.20;
                    PagaresPoli pagareP = new PagaresPoli(nomCliente, numCliente, numCuenta, capInvert, plazInver,
                            inteAnual);
                    pagareP.calcularInteres();

                    cadena2 += "\t\t"+pagareP.getNumCliente()+"\t\t\t  "+pagareP.getNomCliente()
                            +"\t\t\t"+pagareP.getNumCuenta()+"\t\t\t"+ pagareP.getInteresGanado() +"\n";
                    break;

                case 3:
                    System.out.print("Numero  del Cliente: ");
                    teclado.nextLine();
                    numCliente = teclado.nextInt();
                    System.out.print("Nombre del Cliente: ");
                    teclado.nextLine();
                    nomCliente = teclado.nextLine();
                    System.out.print("Numero de Cuenta: ");
                    numCuenta = teclado.nextInt();
                    System.out.print("Capital invertido: ");
                    capInvert = teclado.nextDouble();
                    System.out.print("Plazo de inversión: ");
                    teclado.nextLine();
                    plazInver = teclado.nextDouble();
                    inteAnual = 0.15;
                    MaestraPoli master = new MaestraPoli(nomCliente, numCliente, numCuenta, capInvert, plazInver,
                            inteAnual);
                    master.calcularInteres();

                    cadena2 += "\t\t"+master.getNumCliente()+"\t\t\t  "+master.getNomCliente()
                            +"\t\t\t"+master.getNumCuenta()+"\t\t\t "+master.getInteresGanado()+"\n";
                    break;


            }
            teclado.nextLine();
            System.out.println("Presione 1 si desea seguir registrando empleados o 2 si desea imprimir el reporte.");
            opcion = teclado.nextInt();
            if (opcion == 2){
                salir = false;
            }

        }
        System.out.println(cadena+"\n" + cadena2 );
    }
}
