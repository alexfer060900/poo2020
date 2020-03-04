package herenciaautomotriz;

public class EmpAdmvo extends Empleado{
    private double sueldomens;
    private double sqAdmvo;
    public EmpAdmvo(double sueldomens, String rfc, String nombre, String departamento, String puesto){
        this.sueldomens = sueldomens;
        this.departamento = departamento;
        this.nombre = nombre;
        this.puesto = puesto;
        this.rfc = rfc;
    }

    public double getSueldomens() {
        return sueldomens;
    }

    public double calcularSueldoQuincenal (double sueldomens){
        sqAdmvo = sueldomens / 2;
        return sqAdmvo;
    }

}
