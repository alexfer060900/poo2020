package disenio_seleccion;
import java.util.Scanner;
public class EjecutaDia {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // Pido los datos requeridos
        System.out.println("Ingrese el numero del dia.");
        int numeroDia = teclado.nextInt();

        // Creo el objeto de la clase
        Dia objDia = new Dia();
        // Llamada a los metodos respectivos.
        objDia.establecerNumDia(numeroDia);
        objDia.calcNombDia();

        System.out.println(objDia.obtenerNombreDia());

    }
}
