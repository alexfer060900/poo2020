package polimorfismo_figura;

public class CirculoPoli extends FiguraPoli{
    private double radioCirc;

    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }

    @Override
    public void calcularArea() {
        area = (Math.PI) * (Math.pow(radioCirc, 2));
    }
}
