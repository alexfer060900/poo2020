package polimorfismo_poo;

public abstract class Empleado12 {
    protected String nombre;
    protected String depmto;
    protected String puesto;
    protected double sueldo;

    /**
     * Metodo abstracto que sera implementado dentro de las clases hijas
     */
    public abstract void calcularSueldoQna();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepmto() {
        return depmto;
    }

    public void setDepmto(String depmto) {
        this.depmto = depmto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
