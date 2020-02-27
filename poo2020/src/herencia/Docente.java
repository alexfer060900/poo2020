package herencia;

/**
 * Esta clase hereda de la clase Persona
 */
public class Docente extends Persona{

    /**
     * Constructor de la clase Docente
     * @param area
     * @param nombre
     * @param identificacion
     * @param estado_civil
     * @param fecha_nac
     */
    public Docente(String area, String nombre, String identificacion, String estado_civil, String fecha_nac){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.area = area;
        this.estado_civil = estado_civil;
        this.fecha_nac = fecha_nac;
    }
    //Atributos propios

    private String area;

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void enseñar(){
        System.out.println("Metodo para enseñar.");
    }
    public void calificar(){
        System.out.println("Metodo para calificar.");
    }
}
