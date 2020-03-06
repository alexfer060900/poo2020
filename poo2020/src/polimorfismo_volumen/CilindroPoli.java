package polimorfismo_volumen;

public class CilindroPoli extends FiguraVPoli{
    private double radioCil;
    private double alturaCil;


    public CilindroPoli(double radioCil, double alturaCil, String nombre){
        this.alturaCil = alturaCil;
        this.radioCil = radioCil;
        this.nombre = nombre;
    }

    public double getRadioCil() {
        return radioCil;
    }

    public double getAlturaCil() {
        return alturaCil;
    }


    @Override
    public void calcularVolumen() {
        volumen = (Math.PI) * (Math.pow(radioCil, 2)) * (alturaCil);
    }
}
