package herenciavolumen;

public class Cilindro extends Figura{
    private double radioCil;
    private double alturaCil;
    private double volCil;


    public Cilindro(double radioCil, double alturaCil, String nombre){
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

    public double calcularVolumenCilindro(double radioCil, double alturaCil){
        volCil = (Math.PI) * (Math.pow(radioCil, 2)) * (alturaCil);
        return volCil;
    }

}
