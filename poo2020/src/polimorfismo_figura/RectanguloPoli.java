package polimorfismo_figura;

public class RectanguloPoli extends FiguraPoli{
    private double baseRecta;
    private double alturaRecta;


    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }

    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }

    @Override
    public void calcularArea() {
        area = baseRecta * alturaRecta;
    }
}
