package polimorfismo_volumen;

public class ConoPoli extends FiguraVPoli{
    private double radioCono;
    private double alturaCono;

    public ConoPoli(double radioCono, double alturaCono, String nombre){
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

    @Override
    public void calcularVolumen() {
        volumen = ((1) * (Math.PI) * (Math.pow(radioCono, 2)) * (alturaCono)) / 3;
    }
}
