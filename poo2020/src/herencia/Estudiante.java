package herencia;

/**
 * Clase que hereda de la clase Persona, contendra todos los atibutos y metodos definidos en persona.
 */
public class Estudiante extends Persona {
    /**
     * Constructor de la clase Estudiante
     * @param carrera
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     */
    public Estudiante(String carrera, String nombre, String identificacion, String estado_civil, String fecha_nac){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.carrera = carrera;
        this.estado_civil = estado_civil;
        this.fecha_nac = fecha_nac;
    }

    //Atributos propios de esta clase
    private String carrera;

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void matricular(){
        System.out.println("Metodo para matricular.");
    }

    public void aprender(){
        System.out.println("Metodo para aprender.");
    }
}
