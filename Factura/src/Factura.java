public class Factura implements Ifactura{
	private int num;
	private float base;
        private float tipoIva;
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
