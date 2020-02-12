package diseniopoo;
import java.util.Scanner;
public class EjecutarCerveza {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Nombre de la cerveza");
        String nombre= teclado.nextLine();

        System.out.println("Tipo de cerveza");
        String tipo = teclado.nextLine();

        System.out.println("unidades vendidas");
        int inid_vendidas = teclado.nextInt();

        System.out.println("Precio");
        double precio=teclado.nextDouble();



        System.out.println("______________________");
        Cerveza cerveza = new Cerveza(precio, inid_vendidas, nombre, tipo);
        System.out.println(cerveza.getCerveza());
        System.out.println("Total ingresos: "+cerveza.calcular_ventas(precio, inid_vendidas));
        System.out.println("______________________");









    }
}
