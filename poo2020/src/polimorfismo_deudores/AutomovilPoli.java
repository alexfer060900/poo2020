package polimorfismo_deudores;

public class AutomovilPoli extends DeudoresPoli{


    public AutomovilPoli(int nroCliente, String nombre, String nroCuenta,double capital, int plazo, double interes){
        this.nroCliente = nroCliente;
        this.nombre = nombre;
        this.nroCuenta = nroCuenta;
        this.capital = capital;
        this.plazo = plazo;
        this.interes = interes;
    }

    @Override
    public void calcularInteresDeudores() {
        interesAPagar = capital + (getInteres() * plazo);
    }
}
