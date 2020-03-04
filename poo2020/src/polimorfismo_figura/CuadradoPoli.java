package polimorfismo_figura;

public class CuadradoPoli extends FiguraPoli{
    private double ladoCuad;

    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }

    @Override
    public void calcularArea() {
        area = Math.pow(ladoCuad, 2);
    }
}
