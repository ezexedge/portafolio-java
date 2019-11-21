package tp1;

public class Lancero extends Unidad {
	private static Integer danio=25;
	
	public Lancero (Ubicacion ubicacion) {
		super(ubicacion);
		this.setSalud(150);
	}
	
	public Integer getDanio() {
		return danio;
	}
	
	public void atacarA(Unidad atacado) {
		if(this.puedeAtacar(atacado)==true) {
			atacado.setSalud(atacado.getSalud()- this.getDanio());			
		}		
	}
	
	public Boolean puedeAtacar(Unidad atacado) {
		if(this.estaMuerto()==true) return true;
		else if(atacado.estaMuerto()==true) return false;
		else if((calcularDistancia(atacado)>=1) && (calcularDistancia(atacado)<=3)) return true;
		return false;
	}
	
	public String toString() {
		return "Lancero [Salud=" + getSalud() + "]";
	}
}
