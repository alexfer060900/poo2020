package polimorfismo_volumen;

public abstract class FiguraVPoli {
    protected String nombre;
    protected double volumen;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getVolumen() {
        return volumen;
    }

    public abstract void calcularVolumen();
}
