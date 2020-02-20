package arreglo_poo;

public class TercerArreglo {
    private  int[] vectorA = new int [10];
    private  int[] vectorB = new int [10];
    private int[] vectorS = new int [10];

    // Constructor de objeto
    public TercerArreglo ( int vectorA[], int vectorB[]){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    /**
     * Metodo para calcular el valor de la variable sumatoria
     * @return sumatoria
     */
    public void sumar_arreglos (){
        for(int i=0; i<10; i++){
            vectorS[i] = (vectorA[i] + vectorB[i]);
        }
    }

    /**
     * Metodo vacio para presentar el resultado
     */
    public void presentar(){
        System.out.println("Arreglo1 + Arreglo2 = Arreglo3");
        System.out.println("---------------------------------");
        for (int c = 0;c < 10; c++){
        System.out.println(vectorA[c]+ " "+ vectorB[c]+ " " + vectorS[c]);
        }
    }

    public int[] getVectorA() {
        return vectorA;
    }

    public void setVectorA(int[] vectorA) {
        this.vectorA = vectorA;
    }

    public int[] getVectorB() {
        return vectorB;
    }

    public void setVectorB(int[] vectorB) {
        this.vectorB = vectorB;
    }

    public int[] getVectorS() {
        return vectorS;
    }

    public void setVectorS(int[] vectorS) {
        this.vectorS = vectorS;
    }
}
