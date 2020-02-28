package herenciafigura;

public class Circulo extends Figura{
    private double radio;
    private double areaCirc;

    public Circulo(double radio, String nombre) {
        this.radio = radio;
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularAreaCirc(double radio){
        areaCirc = Math.PI * (Math.pow(radio, 2));
        return areaCirc;

    }
}
