package polimorfismo_poo;

public class EmpleadoAsalariado2 extends Empleado12{
    private double sueldo_mensual;

    public void setSueldo_mensual(double sueldo_mensual) {
        this.sueldo_mensual = sueldo_mensual;
    }

    @Override
    public void calcularSueldoQna() {
        sueldo = getSueldo_mensual() / 2;
    }

    public double getSueldo_mensual() {
        return sueldo_mensual;
    }
}
