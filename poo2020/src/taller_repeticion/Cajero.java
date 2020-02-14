package taller_repeticion;

public class Cajero {
    private int saldo;
    /**
     * consultor para inicializar el saldo
     * @param saldo
     */
    public int cajero_automatico(int saldo){
        this.saldo=saldo;
        return saldo;
    }
    /**
     * metodo consultar saldo
     * @return
     */
    public int consultar_saldo() {
        return saldo;
    }
/**
 * metodo para realizar  un deposito
 * @param valor_deposito
 */
    /**
     * metodo para realizar un retiro
     * @param valor_deposito
     */
    public void depositar(int valor_deposito) {
        if (valor_deposito > 0) {

            saldo = saldo + valor_deposito;

        }else{
            System.out.println("el valor ingresado no es correcto");
        }

    }
    public void retirar(int valor_retiro){
        if (valor_retiro<=saldo) {
            saldo=saldo-valor_retiro;

        }else{
            System.out.println("el valor no es correcto");

        }


    }
}
