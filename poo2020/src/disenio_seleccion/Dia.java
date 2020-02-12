package disenio_seleccion;

public class Dia {
    // Declaro variables
    private int numDia;
    private String nombre;

    /**
     * Metodo para establecer el numero del dia
     * @param numDia
     * @return numDia
     */
    public int establecerNumDia(int numDia) {
        this.numDia = numDia;
        return numDia;
    }

    /**
     * Metodo para calcular el nombre del dia, usando el switch para cada uno de los casos.
     * @return nombre
     */
    public String calcNombDia(){
        switch (numDia) {
            case 1:
                nombre = "Domingo";
                break;
            case 2:
                nombre = "Lunes";
                break;
            case 3:
                nombre = "Martes";
                break;
            case 4:
                nombre = "Miercoles";
                break;
            case 5:
                nombre = "Jueves";
                break;
            case 6:
                nombre = "Viernes";
                break;
            case 7:
                nombre = "Sabado";
                break;
            default:
                nombre = "Opcion Incorrecta";
        }
        return nombre;
        }

    /**
     * Metodo para que sea reutilizable, obtengo el nombre del dia de manera individual
     * @return nombre
     */
    public String obtenerNombreDia(){
        return nombre;
    }
}

