package herenciafigura;

public class Triangulo extends Figura {
    private double baseTrian;
    private double alturaTrian;
    private double areaTrian;

    public Triangulo(double baseTrian, double alturaTrian, String nombre) {
        this.baseTrian = baseTrian;
        this.alturaTrian = alturaTrian;
        this.nombre = nombre;
    }

    public double getBaseTrian() {
        return baseTrian;
    }

    public double getAlturaTrian() {
        return alturaTrian;
    }

    public double calcularAreaTrian(double alturaTrian, double baseTrian){
        areaTrian = (alturaTrian * baseTrian) / 2;
        return areaTrian;

    }

}
