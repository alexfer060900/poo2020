package polimorfismo_figura;

public class TrianguloPoli extends FiguraPoli{

    private double baseTria;
    private double alturaTria;


    @Override
    public void calcularArea() {
        area = (baseTria * alturaTria) / 2;
    }

    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }

    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }
}
