package polimorfismo_figura;

public abstract class FiguraPoli {
    protected String nombre;
    protected double area;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getArea() {
        return area;
    }

    public abstract void calcularArea();
}
