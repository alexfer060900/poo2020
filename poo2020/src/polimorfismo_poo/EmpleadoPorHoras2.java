package polimorfismo_poo;

public class EmpleadoPorHoras2 extends Empleado12{

    private int horasTrab;
    private double cuota;


    public void setHorasTrab(int horasTrab) {
        this.horasTrab = horasTrab;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    @Override
    public void calcularSueldoQna() {
        sueldo = horasTrab * cuota;
    }
}
