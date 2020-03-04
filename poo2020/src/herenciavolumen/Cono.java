package herenciavolumen;

public class Cono extends Figura {
    private double radioCono;
    private double alturaCono;
    private double areaCono;

    public Cono(double radioCono, double alturaCono, String nombre){
        this.alturaCono = alturaCono;
        this.radioCono = radioCono;
        this.nombre = nombre;
    }
    public double getRadioCono() {
        return radioCono;
    }

    public double getAlturaCono() {
        return alturaCono;
    }

    public double calcularVolumenCono(double radioCono, double alturaCono){
        areaCono = ((1) * (Math.PI) * (Math.pow(radioCono, 2)) * (alturaCono)) / 3;
        return areaCono;
    }

}
