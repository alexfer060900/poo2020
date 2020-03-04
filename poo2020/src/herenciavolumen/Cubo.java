package herenciavolumen;

public class Cubo extends Figura{
    private double arista;
    private double volCubo;


    public Cubo(double arista, String nombre){
        this.arista = arista;
        this.nombre = nombre;
    }

    public double getArista() {
        return arista;
    }

    public double calcularVolumenCubo (double arista){
        volCubo = Math.pow(arista, 3);
        return volCubo;
    }


}
