package Taller1;

public class Estudiante {
    private String nombre;
    private int edad;
    private int nro_cedula;
    private int promedio;
    private String grupo_sanguineo;
    private String nivel_academico;
    private String genero;


    /**
     * Metodo para obtener el valor de la variable nombre
     * @return this.nombre
     */
    public String obtener_nombre(){
        return this.nombre;
    }

    /**
     * Metodo para obtener el valor de la variable edad
     * @return edad
     */
    public int obtener_edad(){
        return edad;
    }

    /**
     * Metodo para obtener el valor de la variable nro de cedula
     * @return nro_cedula
     */
    public int obtener_nro_cedula(){
        return nro_cedula;
    }

    /**
     * Metodo para obtener el valor de la variable promedio
     * @return promedio
     */
    public int obtener_promedio(){
        return promedio;
    }

    /**
     * Metodo para obtener el valor de la variable grupo_sanguineo
     * @return grupo_sanguineo
     */
    public String obtener_grupo_sanguineo(){
        return grupo_sanguineo;
    }

    /**
     * Metodo para obtener el valor de la variable nivel academico
     * @return nivel_academico
     */
    public String obtener_nivel_academico(){
        return nivel_academico;
    }

    /**
     * Metodo para obtener el valor de la variable genero
     * @return genero
     */
    public String obtener_genero(){
        return genero;
    }

    /**
     * Metodo para actualizar la variable nombre
     * @param nombre
     */
    public void actualizar_nombre(String nombre){
        //con this. hacemos referencia a variables globales
        this.nombre = nombre;
    }

    /**
     * Metodo para actualizar la variable edad
     * @param edad
     */
    public void actualizar_edad(int minuto){
        this.edad = edad;
    }

    /**
     * Metodo para actualizar la variable nro_cedula
     * @param nro_cedula
     */
    public void actualizar_nro_cedula(int segundo){
        this.nro_cedula = nro_cedula;
    }

    /**
     * Metodo para actualizar la variable promedio
     * @param promedio
     */
    public void actualizar_promedio(int promedio){
        this.promedio = promedio;
    }

    /**
     * Metodo para actualizar la variable grupo sanguineo
     * @param grupo_sanguineo
     */
    public void actualizar_grupo_sanguineo (String grupo_sanguineo){
        this.grupo_sanguineo = grupo_sanguineo;
    }

    /**
     * Metodo para actualizar la variable nivel academico
     * @param nivel_academico
     */
    public void actualizar_nivel_academico(String nivel_academico){
        this.nivel_academico = nivel_academico;
    }

    /**
     * Metodo para actualizar la variable genero
     * @param genero
     */
    public void actualizar_genero(String genero){
        this.genero = genero;
    }

    /**
     * Verificar si el estudiante aprendio
     * @return aprendido
     */
    public String aprender(){
        String aprendido = "Si aprendio";
        return aprendido;
    }

    /**
     * Verificar si el estudiante aprobo
     * @return aprobado
     */
    public String aprobar(){
        String aprobado = "Aprobado";
        return aprobado;
    }

    /**
     * Verificar si el estudiante reprobo
     * @return reprobado
     */
    public String reprobado(){
        String reprobado = "Reprobo";
        return reprobado;
    }

    /**
     * Verificar si el estudiante razono
     * @return razonamiento
     */
    public String razonar(){
        String razonamiento = "Si razona";
        return razonamiento;
    }


}
