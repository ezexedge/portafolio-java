package coleccion;

public class ManejoGenericos<T> {
T objeto;
	public ManejoGenericos(T objeto) {
		
		this.objeto  = objeto;
		// TODO Auto-generated constructor stub
	}
	public void obtenerTipo() {
		System.out.println("el tipo t es" + this.objeto.getClass().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManejoGenericos<Integer>  objetoEntero= new ManejoGenericos<>(12);
		ManejoGenericos<String> objetoCadena = new ManejoGenericos<>("pep");
		
		objetoEntero.obtenerTipo();
		
		objetoCadena.obtenerTipo();
		
	}

}
