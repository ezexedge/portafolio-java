package legislador;

import java.util.ArrayList;

public class NominaLegisladores {
	private ArrayList<Legislador> listaLegisladores;

	public NominaLegisladores() {
		listaLegisladores = new ArrayList <Legislador> ();
		// TODO Auto-generated constructor stub
	}
	
	public void agregarLegislador(Legislador nuevoLegislador) {
		listaLegisladores.add(nuevoLegislador);
	}
	public int getCantidad() {
		return this.listaLegisladores.size();
	}

	public void mostrar() {
		for(Legislador p : listaLegisladores) {
			System.out.println(p.toString());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
