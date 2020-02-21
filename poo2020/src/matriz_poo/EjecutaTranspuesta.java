package matriz_poo;
import java.util.Scanner;

public class EjecutaTranspuesta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: " );
        int filas = entrada.nextInt();
        System.out.print("Ingrese el numero de columnas: " );
        int columnas = entrada.nextInt();

        int matrizA[][] = new int[filas][columnas];
        int matrizT[][] = new int[columnas][filas];

        // Se declara, crea e inicia el objeto de la clase Vectores
        Transpuesta transpuesta = new Transpuesta();

        System.out.println("_ INGRESO DE VALORES A LA MATRIZ A   __");

        for(int i=0; i< filas;i++){
            for(int j= 0; j < columnas; j++){
                System.out.print("Ingrese los valores del  Vector para la posicion: [" + i + "][" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }

        // Establecer
        transpuesta.setMatrizA(matrizA);
        transpuesta.setFilas(filas);
        transpuesta.setColumnas(columnas);
        for(int i = 0; i< filas; i++){
            for(int j = 0; j< columnas; j++){
                matrizT[j][i] =  matrizA[i][j];
            }
        }
        for(int i = 0; i< columnas; i++){
            for(int j = 0; j <  filas; j++){
                System.out.print(matrizT[i][j]);;
            }
            System.out.println();
        }
        // Calcular
        transpuesta.calcularTranspuesta();

        // Imprimir

        System.out.println("--------- Salida ----------");
        System.out.println("Matriz A");
        transpuesta.presentarMatrizA();
        System.out.println("Matriz B");
        transpuesta.presentarMatrizT( );


    }
}
