package polimorfismo_automotriz;

public class EmpMecanicoPoli extends EmpleadoPoli{
    private double ventaTotal;

    public EmpMecanicoPoli(double ventaTotal, String rfc, String nombre, String departamento, String puesto){
        this.ventaTotal = ventaTotal;
        this.departamento = departamento;
        this.nombre = nombre;
        this.puesto = puesto;
        this.rfc = rfc;
    }

    public double getVentaTotal() {
        return ventaTotal;
    }

    @Override
    public void calcularSueldoQna() {
        sueldoQna = ventaTotal * 0.4;
    }
}
