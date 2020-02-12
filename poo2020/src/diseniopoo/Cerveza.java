package diseniopoo;

public class Cerveza {
        private double precio;
        private int inid_vendidas;
        private String nombre;
        private String tipo;

        public Cerveza(double precio, int inid_vendidas, String nombre, String tipo){
            this.precio=precio;
            this.inid_vendidas=inid_vendidas;
            this.nombre=nombre;
            this.tipo=tipo;
        }
        public double calcular_ventas(double precio, int inid_vendidas){
            double Total=inid_vendidas * precio;
            return Total;
        }
        public String getCerveza(){
            String cerveza= "NOMBRE: "+nombre+" TIPO: "+tipo+" PRECIO: "+precio+" UNIDADES VENDIDAS: "+ inid_vendidas;
            return cerveza;
        }


        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public int getInid_vendidas() {
            return inid_vendidas;
        }

        public void setInid_vendidas(int inid_vendidas) {
            this.inid_vendidas = inid_vendidas;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }


