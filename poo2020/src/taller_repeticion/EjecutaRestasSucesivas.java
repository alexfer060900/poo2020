package taller_repeticion;
import java.util.Scanner;
public class EjecutaRestasSucesivas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el primer numero a restar.");
        double num1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero a restar.");
        double num2 = teclado.nextDouble();

        RestasSucesivas objResta = new RestasSucesivas();
        objResta.establecerNum1(num1);
        objResta.establecerNum2(num2);
        objResta.calcularDivision();
        System.out.println("El resultado de la division es: " + objResta.obtenerDivision());
    }
}
