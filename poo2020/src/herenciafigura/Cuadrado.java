package herenciafigura;

public class Cuadrado extends Figura{

    private double ladoCuadrado;
    private double areaCuadrado;

    public Cuadrado(double ladoCuadrado, String nombre) {
        this.ladoCuadrado = ladoCuadrado;
        this.nombre = nombre;
    }

    public double getLadoCuadrado() {
        return ladoCuadrado;
    }

    public double calcularAreaCuadrado(double ladoCuadrado){
        areaCuadrado = Math.pow(ladoCuadrado, 2);
        return areaCuadrado;
    }
}
