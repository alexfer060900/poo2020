package polimorfismo_inversionistas;

public class AhorroPoli extends InversionPoli{
    public AhorroPoli(String nomCliente, int numCliente, int numCuenta, double capInvert, double plazInver, double inteAnual) {
        this.numCliente = numCliente;
        this.nomCliente = nomCliente;
        this.numCuenta = numCuenta;
        this.capInvert = capInvert;
        this.plazInver = plazInver;
        this.inteAnual = inteAnual;

    }

    @Override
    public void calcularInteres() {
        interesGanado = capInvert * (inteAnual * plazInver);
    }
}
