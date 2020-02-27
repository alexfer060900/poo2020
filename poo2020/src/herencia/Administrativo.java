package herencia;

/**
 * Esta clase hereda de la clase Persona.
 */
public class Administrativo extends Persona {

    /**
     * Constructor de la clase Administrativo
     * @param dependencia
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     */
    public Administrativo(String dependencia, String nombre, String identificacion, String estado_civil, String fecha_nac){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.dependencia = dependencia;
        this.estado_civil = estado_civil;
        this.fecha_nac = fecha_nac;
    }

    //Atributos propios
    private String dependencia;

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public void gestionar_procesos() {
        System.out.println("Metodo para gestionar procesos.");
    }
}