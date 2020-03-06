package polimorfismo_automotriz;

public class EmpVendedorPoli extends EmpleadoPoli{
    private double valorVenta;
    private double sueldomin;

    public EmpVendedorPoli(double valorVenta, double sueldomin, String rfc, String nombre, String departamento,
                       String puesto){
        this.sueldomin = sueldomin;
        this.valorVenta = valorVenta;
        this.rfc = rfc;
        this.departamento = departamento;
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public double getValorVenta() {
        return valorVenta;
    }

    public double getSueldomin() {
        return sueldomin;
    }

    @Override
    public void calcularSueldoQna() {
        sueldoQna = sueldomin + (valorVenta * 0.2);
    }
}
