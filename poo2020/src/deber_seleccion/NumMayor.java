package deber_seleccion;

public class NumMayor {
    // Declaramos variables
    private Double num1;
    private Double num2;
    private Double num3;
    private Double num4;
    private Double numMayor;

    /**
     * Metodo para establecer el primer numero.
     * @param num1
     * @return num1
     */
    public Double establecerNum1(Double num1){
        this.num1 = num1;
        return num1;
    }

    /**
     * Metodo para establecer el segundo numero
     * @param num2
     * @return num2
     */
    public Double establecerNum2(Double num2){
        this.num2 = num2;
        return num2;
    }

    /**
     * Metodo para establecer el tercer numero
     * @param num3
     * @return num3
     */
    public Double establecerNum3(Double num3){
        this.num3 = num3;
        return num3;
    }

    /**
     * Metodo para establecer el cuarto numero
     * @param num4
     * @return num4
     */
    public Double establecerNum4(Double num4){
        this.num4 = num4;
        return num4;
    }

    /**
     * Metodo para calcular el valor del numero mayor
     * @return numMayor
     */
    public Double calcularNumMayor() {
        if ((num1 > num2) & (num1 > num3) & (num1 > num4)) {
            numMayor = num1;
        }else{
            if ((num2 > num3) & (num3 > num4)) {
                numMayor = num2;
            }else{
                if (num3 > num4) {
                    numMayor = num3;
                }else{
                    numMayor = num4;
                }
            }
        }
        return numMayor;
    }

    /**
     * Metodo para hacer el programa reutilizable, obtengo el valor del numero mayor por separado.
     * @return numMayor
     */
    public Double obtenerNumMayor(){
        return numMayor;
    }

}
