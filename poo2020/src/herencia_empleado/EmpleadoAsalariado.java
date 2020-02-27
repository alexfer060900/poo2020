package herencia_empleado;

public class EmpleadoAsalariado extends Empleado{

    private double valor_mensual;

    public EmpleadoAsalariado (double valor_mensual, String nombre, String cargo, String dependencia){
        this.valor_mensual = valor_mensual;
        this.cargo = cargo;
        this.nombre = nombre;
        this.dependencia = dependencia;
    }


    public double getValor_mensual() {
        return valor_mensual;
    }

    public void setValor_mensual(double valor_mensual) {
        this.valor_mensual = valor_mensual;
    }
}
