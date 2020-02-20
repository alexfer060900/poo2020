package arreglo_poo;

public class Array {
    private  int[] vectorA = new int [10];
    private  int[] vectorB = new int [10];
    private int sumatoria;

    // Constructor de objeto
    public Array ( int vectorA[], int vectorB[]){
        this.vectorA = vectorA;
        this.vectorB = vectorB;
    }

    /**
     * Metodo para calcular el valor de la variable sumatoria
     * @return sumatoria
     */
    public int calcular_sumatoria (){
        sumatoria = 0;
        for(int i=0; i<10; i++){
            sumatoria = (vectorA[i]*vectorB[i]) + sumatoria;
        }
        return sumatoria;
    }

    /**
     * Metodo vacio para presentar el resultado
     */
    public void presentar(){
        System.out.println("RESULTADO:  "+ calcular_sumatoria());
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

    public int getSumatoria() {
        return sumatoria;
    }

    public void setSumatoriaProducto(int sumatoria) {
        this.sumatoria = sumatoria;
    }
}
