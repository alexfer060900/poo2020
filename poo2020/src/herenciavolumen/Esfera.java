package herenciavolumen;

public class Esfera extends Figura{
    private double radioEsf;
    private double areaEsf;

    public Esfera(double radioEsf, String nombre){
        this.radioEsf = radioEsf;
        this.nombre = nombre;
    }
    public double getRadioEsf() {
        return radioEsf;
    }

    public double calcularVolEsf(double radioCono){
        areaEsf = ((4) * (Math.PI) * (Math.pow(radioCono, 3))) / 3;
        return areaEsf;
    }
}
