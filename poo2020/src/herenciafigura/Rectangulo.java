package herenciafigura;

public class Rectangulo extends Figura{
    private double baseRecta;
    private double alturaRecta;
    private double areaRecta;

    public Rectangulo(double baseRecta, double alturaRecta, String nombre) {
        this.baseRecta = baseRecta;
        this.alturaRecta = alturaRecta;
        this.nombre = nombre;
    }

    public double getBaseRecta() {
        return baseRecta;
    }

    public double getAlturaRecta() {
        return alturaRecta;
    }

    public double calcularAreaRecta(double alturaRecta, double baseRecta){
        areaRecta = alturaRecta * baseRecta;
        return areaRecta;
    }
}
