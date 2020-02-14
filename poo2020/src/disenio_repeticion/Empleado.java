package disenio_repeticion;

public class Empleado {
    private String nombre;
    private int horas;
    private Double cuota;
    private Double sueldo;

    /**
     * Metodo para establecer el nombre del empleado
     * @param nombre
     * @return nombre
     */
    public String establecerNombre(String nombre) {
        this.nombre = nombre;
        return nombre;
    }

    /**
     * Metodo para establecer el numero de horas
     * @param horas
     * @return horas
     */
    public int establecerHoras(int horas) {
        this.horas = horas;
        return horas;
    }

    /**
     * Metodo para establecer el valor de la hora
     * @param cuota
     * @return cuota
     */
    public double establecerCuota(double cuota) {
        this.cuota = cuota;
        return cuota;
    }

    /**
     * Metodo para calcular el sueldo del empleado.
     * @return sueldo
     */
    public double calcularSueldo() {
        if (horas <= 40) {
            sueldo = (horas * cuota);
        } else {
            sueldo = (40 * cuota) + ((horas - 40) * (cuota * 2));
        }
        return sueldo;
    }

    /**
     * Metodo para que sea reutilizable, obtengo el nombre del empleado de manera individual
     * @return nombre
     */
    public String obtenerNombre(){
        return nombre;
    }

    /**
     * Metodo para que sea reutilizable, obtengo el sueldo de manera individual.
     * @return sueldo
     */
    public double obtenerSueldo(){
        return sueldo;
    }
}
