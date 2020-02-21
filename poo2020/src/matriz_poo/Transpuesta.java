package matriz_poo;

public class Transpuesta {
    private int filas ;
    private int columnas ;
    private int matrizA[][] ;

    /**
     * Metodo para sumar dos matrices en una tercera matriz
     */
    public int[][] calcularTranspuesta(){
        int matrizT[][] = new int[columnas][filas];
        for(int i = 0; i< filas; i++){
            for(int j = 0; j< columnas; j++){
                matrizT[j][i] =  matrizA[i][j];
            }
        }
        return matrizT;
    }
    /**
     * Metodo para imprimir la matrizA
     */
    public void presentarMatrizA (){
        for(int i = 0; i< filas; i++){
            for(int j = 0; j< columnas; j++){
                System.out.print(matrizA[i][j]);;
            }
            System.out.println();
        }
    }
    /**
     * Metodo para imprimir la matrizT
     */
    public void presentarMatrizT (){
        for(int i = 0; i< columnas; i++){
            for(int j = 0; j <  filas; j++){
                System.out.print(calcularTranspuesta()[i][j]);;
            }
            System.out.println();
        }
    }
    /**
     * Metodo para obtener el valor de matrizA
     * @return matrizA
     */
    public int[][] getMatrizA() {
        return matrizA;
    }
    /**
     * Metodo para actualizar la matriz matrizA
     * @param matrizA
     */
    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    /**
     * Metodo para actualizar la variable
     * @param filas
     */
    public void setFilas(int filas) {
        this.filas = filas;
    }
    /**
     * Metodo para actualizar la variable columnas
     * @param columnas
     */
    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }
}
