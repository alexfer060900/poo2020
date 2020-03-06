package polimorfismo_volumen;

public class EsferaPoli extends FiguraVPoli{
    private double radioEsf;

    public EsferaPoli(double radioEsf, String nombre){
        this.radioEsf = radioEsf;
        this.nombre = nombre;
    }
    public double getRadioEsf() {
        return radioEsf;
    }

    @Override
    public void calcularVolumen() {
        volumen = ((4) * (Math.PI) * (Math.pow(radioEsf, 3))) / 3;
    }
}
