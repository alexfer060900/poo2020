package arreglosdeberpoo;

public class DatosEstudiantes {
    private  String[] nombres = new String [5];
    private  int[] edad = new int [5];
    private String[] iniciales = new String [5];

    // Constructor de objeto
    public DatosEstudiantes (String nombres[], int edad[], String iniciales[]){
        this.nombres = nombres;
        this.edad = edad;
        this.iniciales = iniciales;
    }

    /**
     * Metodo vacio para presentar el resultado
     */
    public void presentar(){
        for (int c = 0;c < 5; c++){
        System.out.println("Nombre: " + nombres[c]);
        System.out.println("Edad: " + edad[c]);
        System.out.println("Iniciales Institucion: " + iniciales[c]);
        System.out.println("");
        }
    }

    public String[] getNombres() {
        return nombres;
    }

    public int[] getEdad() {
        return edad;
    }

    public String[] getIniciales() {
        return iniciales;
    }

}
