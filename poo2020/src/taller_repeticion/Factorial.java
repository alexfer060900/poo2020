package taller_repeticion;

public class Factorial {
    private int numero;
    private int acumulador ;

    public Factorial(int numero,int acumulador ){
        this.numero=numero;
        this.acumulador=acumulador;
    }


    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAcumulador() {
        return acumulador;
    }

    public void setAcumulador(int acumulador) {
        this.acumulador = acumulador;
    }

    public int calcular_factorial(int numero,int acumulador){
        for (int cont = numero; cont >= 1; cont--) {
            acumulador=acumulador*cont;
        }
        return acumulador;
    }
    public String getinfo(){
        String info= "NUMERO: "+numero+ " SU FACTORIAL ES: ";
        System.out.println(calcular_factorial(numero,acumulador));

        return info;
    }
}
