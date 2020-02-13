package deber_seleccion;

public class DatosAlumno {
    // Declarar variables
    private String nombAlumno;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;
    private Double prom;
    private String observ;

    /**
     * Metodo para establecer el nombre del alumno
     * @param nombAlumno
     * @return nombAlumno
     */
    public String establecerNombAlumno(String nombAlumno){
        this.nombAlumno = nombAlumno;
        return nombAlumno;
    }

    /**
     * Metodo para establecer la primera calificacion.
     * @param nota1
     * @return nota1
     */
    public Double establecerNota1(Double nota1){
        this.nota1 = nota1;
        return nota1;
    }
    /**
     * Metodo para establecer la segunda calificacion.
     * @param nota2
     * @return nota2
     */
    public Double establecerNota2(Double nota2){
        this.nota2 = nota2;
        return nota2;
    }
    /**
     * Metodo para establecer la tercera calificacion.
     * @param nota3
     * @return nota3
     */
    public Double establecerNota3(Double nota3){
        this.nota3 = nota3;
        return nota3;
    }
    /**
     * Metodo para establecer la cuarta calificacion.
     * @param nota4
     * @return nota4
     */
    public Double establecerNota4(Double nota4){
        this.nota4 = nota4;
        return nota4;
    }

    /**
     * Metodo para calcular el promedio a partir de las 4 calificaciones.
     * @return prom
     * */
    public Double calcularPromedio(){
        prom = (nota1 + nota2 + nota3 + nota4) / 4;
        return prom;
    }

    /**
     * Metodo para calcular la observacion a partir del promedio calculado
     * @return observ
     */
    public String calcularObservacion(){
        if (prom >= 60){
            observ = "Aprobado";
        }else{
            observ = "Reprobado";
        }
        return observ;
    }

    /**
     * Metodo para que sea reutilizable, obtengo el nombre del alumno de manera individual
     * @return nombAlumno
     */
    public String obtenerNombreAlum(){
        return nombAlumno;
    }
    /**
     * Metodo para que sea reutilizable, obtengo el promedio del estudiante de manera individual
     * @return prom
     */
    public Double obtenerPromedio(){
        return prom;
    }
    /**
     * Metodo para que sea reutilizable, obtengo la observacion de manera individual
     * @return observ
     */
    public String obtenerObservacion(){
        return observ;
    }
}
