package herencia_empleado;

public class EmpleadoPorHoras extends Empleado{

    private int horas;
    private double valorHora;
    private double sueldo;

    public EmpleadoPorHoras(int horas, double valorHora, String nombre, String cargo, String dependencia){
        this.horas = horas;
        this.valorHora = valorHora;
        this.nombre = nombre;
        this.cargo = cargo;
        this.dependencia = dependencia;
    }

    public double calcular_Sueldo(int horas, double valorHora){
        sueldo = (horas * valorHora);
        return sueldo;
    }


    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getSueldo(){
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
