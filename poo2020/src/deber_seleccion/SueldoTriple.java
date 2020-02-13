package deber_seleccion;

public class SueldoTriple {
    private String nomb;
    private int horas;
    private Double cuota;
    private Double sueldo;

    /**
     * Metodo para establecer el nombre del empleado
     * @param nomb
     * @return nomb
     */
    public String establecerNombre(String nomb) {
        this.nomb = nomb;
        return nomb;
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
            if (horas <= 50){
            sueldo = (40 * cuota) + ((horas - 40) * (cuota * 2));
            }else{
            sueldo = (40 * cuota) + (10 * cuota * 2) + ((horas - 50) * (cuota * 3));
            }
        }
        return sueldo;
    }

    /**
     * Metodo para que sea reutilizable, obtengo el nombre del empleado de manera individual
     * @return nomb
     */
    public String obtenerNombre(){
        return nomb;
    }

    /**
     * Metodo para que sea reutilizable, obtengo el sueldo de manera individual.
     * @return sueldo
     */
    public double obtenerSueldo(){
        return sueldo;
    }
}


