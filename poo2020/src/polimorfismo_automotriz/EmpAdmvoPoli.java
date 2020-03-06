package polimorfismo_automotriz;

public class EmpAdmvoPoli extends EmpleadoPoli{
    private double sueldomens;

    public EmpAdmvoPoli(double sueldomens, String rfc, String nombre, String departamento, String puesto){
        this.sueldomens = sueldomens;
        this.departamento = departamento;
        this.nombre = nombre;
        this.puesto = puesto;
        this.rfc = rfc;
    }

    public double getSueldomens() {
        return sueldomens;
    }

    @Override
    public void calcularSueldoQna() {
        sueldoQna = sueldomens / 2;
    }
}
