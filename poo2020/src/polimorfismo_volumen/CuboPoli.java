package polimorfismo_volumen;

public class CuboPoli extends FiguraVPoli{
    private double arista;

    public CuboPoli (double arista, String nombre){
        this.arista = arista;
        this.nombre = nombre;
    }

    public double getArista() {
        return arista;
    }

    @Override
    public void calcularVolumen() {
        volumen = Math.pow(arista, 3);
    }
}
