package herenciaautomotriz;

public class EmpVendedor extends Empleado {

    private double valorVenta;
    private double sueldomin;
    private double sqVendedor;

    public EmpVendedor(double valorVenta, double sueldomin, String rfc, String nombre, String departamento,
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


    public double getSqVendedor() {
        return sqVendedor;
    }

    public double calcularsqVendedor(double valorVenta, double sueldomin){
        sqVendedor = sueldomin + (valorVenta * 0.2);
        return sqVendedor;
    }

}
