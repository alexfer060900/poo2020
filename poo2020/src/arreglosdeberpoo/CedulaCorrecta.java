package arreglosdeberpoo;

public class CedulaCorrecta {
    private int cedula;
    private int[] cedulaDescompuesta = new int[10];
    private int sumatoriaPar;
    private int sumatoriaImpar;
    private int auxImpar;
    private int sumatoriaTotal;
    private int auxDecSup;
    private int decSup;
    private int verificador;
    private boolean cedulaCorrecta;

    // Constructor de objeto
    public CedulaCorrecta(int cedula, int cedulaDescompuesta[]) {
        this.cedula = cedula;
        this.cedulaDescompuesta = cedulaDescompuesta;
    }

    public void calcular_cedula() {
        for (int c = 1; c < 10; c++) {
            if (c % 2 == 0) {
                sumatoriaPar = sumatoriaPar + (cedulaDescompuesta[c] * 1);
            } else {
                auxImpar = cedulaDescompuesta[c] * 2;
                if (auxImpar > 9) {
                    auxImpar = auxImpar - 9;
                }
                sumatoriaImpar = sumatoriaImpar + auxImpar;
            }
        }
        sumatoriaTotal = sumatoriaImpar + sumatoriaPar;
        auxDecSup = sumatoriaTotal / 10;
        decSup = (auxDecSup + 1) * 10;
        verificador = decSup - sumatoriaTotal;
        if (verificador == cedulaDescompuesta[0]) {
            cedulaCorrecta = true;
        } else {
            cedulaCorrecta = false;
        }
    }

    /**
     * Metodo vacio para presentar el resultado
     */
    public void presentar() {
        if (cedulaCorrecta == true) {
            System.out.println("Numero de Cedula: "+ cedula + "\nDigito verificador: "+ cedulaDescompuesta[0] +
                    "\nNumero de cedula correcto.");
        } else {
            System.out.println("Numero de cedula incorrecto.");
        }
    }

        public int[] getCedulaDescompuesta () {
            return cedulaDescompuesta;
        }

        public boolean getCedulaCorrecta () {
            return cedulaCorrecta;
        }
}
