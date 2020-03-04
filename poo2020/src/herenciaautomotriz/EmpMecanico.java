package herenciaautomotriz;

public class EmpMecanico extends Empleado{
    private double sqMec;
    private double ventaTotal;

    public EmpMecanico(double ventaTotal, String rfc, String nombre, String departamento, String puesto){
        this.ventaTotal = ventaTotal;
        this.departamento = departamento;
        this.nombre = nombre;
        this.puesto = puesto;
        this.rfc = rfc;
    }

    public double getSqMec() {
        return sqMec;
    }


    public double getVentaTotal() {
        return ventaTotal;
    }

    public double calcularSqMecanico (double ventaTotal){
        sqMec = ventaTotal * 0.4;
        return sqMec;
    }

}
