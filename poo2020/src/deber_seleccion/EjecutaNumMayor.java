package deber_seleccion;
import java.util.Scanner;
public class EjecutaNumMayor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
// Solicito el ingreso de los datos requeridos para la solucion del problema
        System.out.println("Ingrese el primer numero.");
        Double num1 = teclado.nextDouble();
        System.out.println("Ingrese el segundo numero.");
        Double num2 = teclado.nextDouble();
        System.out.println("Ingrese el tercer numero.");
        Double num3 = teclado.nextDouble();
        System.out.println("Ingrese el cuarto numero");
        Double num4 = teclado.nextDouble();

        // Llamo a cada uno de los metodos para la solucion del problema
        NumMayor objNumMayor = new NumMayor();
        objNumMayor.establecerNum1(num1);
        objNumMayor.establecerNum2(num2);
        objNumMayor.establecerNum3(num3);
        objNumMayor.establecerNum4(num4);
        objNumMayor.calcularNumMayor();
// Imprimo la salida final.
        System.out.println("El numero mayor de los 4 es: " + objNumMayor.obtenerNumMayor());
    }
}
