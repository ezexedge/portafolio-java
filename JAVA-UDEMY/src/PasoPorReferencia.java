
public class PasoPorReferencia {
String nombre;
	public PasoPorReferencia() {
		// TODO Auto-generated constructor stub
	}
	
	public void cambiarNombre(String nuevoNombre) {
		this.nombre = nuevoNombre;
	}
	
	public String obtenerNombre() {
		return this.nombre;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PasoPorReferencia p1 = new PasoPorReferencia();
		p1.cambiarNombre("juan");
		imprimirNombre(p1);
		modificarNombre(p1);
		imprimirNombre(p1);

	}
	
	public static void imprimirNombre(PasoPorReferencia p1) {
		System.out.println("valor recibido" + p1.obtenerNombre());
	}
	public static void modificarNombre(PasoPorReferencia arg) {
		
		arg.cambiarNombre("pepa");
		
		
	}
	

}
