package arreglosdeberpoo;

public class NumeroBinario {
    private int numero;
    private  int[] numeroDescompuesto = new int [6];
    private double decimal;

    // Constructor de objeto
    public NumeroBinario ( int numero, int numeroDescompuesto[]){
        this.numero = numero;
        this.numeroDescompuesto = numeroDescompuesto;
    }

    public void calcular_decimal (){
        for (int c = 0; c < 6; c ++ ){
            decimal = decimal + (numeroDescompuesto[c] * Math.pow(2, c));
        }
    }
    /**
     * Metodo vacio para presentar el resultado
     */
    public void presentar(){
            System.out.println(numero + " en binario y " + decimal + " en decimal.");
    }

    public int[] getNumeroDescompuesto() {
        return numeroDescompuesto;
    }

    public double getDecimal() {
        return decimal;
    }

}
