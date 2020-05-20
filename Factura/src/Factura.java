public class Factura implements Ifactura{
	public int num;
	public float base;
        public float tipoIva;
        protected Estados estado;

	public static void main(String[] args) {

	}
	public void cambiarEstado(Estados estado){

	}

	public float getTotal(){
	return base;

	}

	public float getCantidadIva(){
	return tipoIva;

	}
}
