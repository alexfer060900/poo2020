package taller_repeticion;

public class RestasSucesivas {
    private double num1;
    private double num2;
    private int contador;
    public double establecerNum1(double num1) {
        this.num1 = num1;
        return num1;
    }
    public double establecerNum2(double num2){
        this.num2 = num2;
        return num2;
    }
    public double establecerContador(){
        contador = 0;
        return contador;
    }
    public double calcularDivision(){
        while(num1 > num2){
            num1 = num1 - num2;
            contador = contador + 1;
        }
        return contador;
    }

    public double obtenerDivision(){
        return contador;
    }

}
