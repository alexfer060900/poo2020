package polimorfismo_inversionistas;

public class PagaresPoli extends InversionPoli{
    public PagaresPoli(String nomCliente, int numCliente, int numCuenta, double capInvert, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    @Override
    public void calcularInteres() {
        inteAnual = 0.20;
        interesGanado = capInvert * (inteAnual * plazInver);
    }
}
