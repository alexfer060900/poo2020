package matriz_poo;

public class Matriz {
    private int fil;
    private int col;
    private int[][] matrizA = new int[getFil()][getCol()];
    private int suma;

    // Constructor de objeto
    public Matriz(int fil, int col, int matrizA[][]) {
        this.matrizA = matrizA;
        this.fil = fil;
        this.col = col;
    }

    public int sumaMatrices() {
        suma = 0;
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                suma += matrizA[i][j];
            }
        }
        return suma;
    }

    public double promedioMatrices() {
        double promedio = suma/(fil*col);
        return promedio;
    }

    public void presentar() {

        System.out.println(" ____________________");
        System.out.println("matriz de tamaño, filas: "+fil+" columnas: "+col);
        System.out.println("valores de la matriz: ");
        for (int i = 0; i < fil; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("posicion "+ i+"."+j+" = "+matrizA[i][j]);
            }
        }
        System.out.println("suma de los valores de la matriz: "+sumaMatrices());
        System.out.println("promedio de la suma de los valores: "+promedioMatrices());
        System.out.println(" ____________________");

    }

    public int getFil() {
        return fil;
    }

    public void setFil(int fil) {
        this.fil = fil;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int[][] getMatrizA() {
        return matrizA;
    }

    public void setMatrizA(int[][] matrizA) {
        this.matrizA = matrizA;
    }

    public int getSuma() {
        return suma;
    }

    public void setSuma(int suma) {
        this.suma = suma;
    }
}
