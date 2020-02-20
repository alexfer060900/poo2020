package arreglo_poo;

public class MediaDesviacion {
    private  int[] arreglo = new int [15];
    private Double media;
    private double[] desviacion = new double [15];

    // Constructor de objeto
    public MediaDesviacion ( int arreglo[]){
        this.arreglo = arreglo;
    }

    public double calcular_Media (){
        double sumatoriaProducto = 0;
        for(int i=0; i<15; i++){
            sumatoriaProducto = (arreglo[i] + sumatoriaProducto);
        }
        media = sumatoriaProducto/15;
        return media;
    }

    public double[] calcular_Desviacion (){

        for(int j=0; j<15; j++){
            desviacion[j] = (arreglo[j] - media);
        }
        return desviacion;
    }

    /**
     * Metodo vacio para presentar el resultado
     */
    public void presentar(){
        System.out.println(" ____________________");
        System.out.println("|Media:  "+ calcular_Media());
        System.out.println("|Desviación:  ");
        for(int i=0; i < 15 ;i++){
            System.out.println(arreglo[i]+ " desviación "+calcular_Desviacion()[i]);
        }
        System.out.println(" _____________________");
    }

    public int[] getArreglo() {
        return arreglo;
    }

    public void setArreglo(int[] arreglo) {
        this.arreglo = arreglo;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public double[] getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(double[] desviacion) {
        this.desviacion = desviacion;
    }


}
