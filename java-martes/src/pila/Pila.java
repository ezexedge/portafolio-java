package pila;

public class Pila {
	private Nodo tope;
	
	
	
	public class Nodo{
		private String dato;
		private Nodo sig;
		
		public Nodo(String dato, Nodo sig) {
			this.setDato(dato);
			this.setSig(sig);
		}
		public Nodo(String dato) {
			this.setDato(dato);
		}
		public String getDato() {
			return dato;
		}
		public void setDato(String dato) {
			this.dato = dato;
		}
		public Nodo getSig() {
			return sig;
		}
		public void setSig(Nodo sig) {
			this.sig = sig;
		}
	}
	
	public Pila(){
		this.setTope(null);
	}
	public Boolean isVacia() {
		return this.getTope()==null;
	}
	public void poner(String dato) {
		this.setTope(new Nodo(dato, this.getTope()));
	}
	public String ver() {
		return this.getTope().getDato();
	}
	public Nodo getTope() {
		return tope;
	}
	public void setTope(Nodo tope) {
		this.tope = tope;
	}
	public void sacar() {
		this.setTope(this.getTope().getSig());
	}
	public String toString(){
		Pila pilaAux = new Pila();
		String representacion = "";
		while(!this.isVacia()) {
			String elemento = this.ver();
			pilaAux.poner(elemento);
			this.sacar();
			representacion += elemento + ",";
		}
		while(!pilaAux.isVacia()) {
			this.poner(pilaAux.ver());
			pilaAux.sacar();
		}
		return representacion;
	}
	public static void main(String[] args) {
		Pila pila = new Pila();
		pila.poner("pepe");
		System.out.println(pila.ver());
		pila.poner("pepa");
		System.out.println(pila.ver());
		System.out.println(pila.toString());
		pila.sacar();
		System.out.println(pila.getTope());
		pila.poner("tony");
		System.out.println(pila.getTope());
		
		
	}
}