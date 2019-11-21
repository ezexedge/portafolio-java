package estrategia;


public class Arquero extends Unidad {
      private Integer cantFlechas=20;
      private static Integer danio=5;
      
      public Arquero(Ubicacion ubicacion) {
    	  super(ubicacion);
    	  this.setSalud(50);
      }


	public Integer getCantFlechas() {
		return cantFlechas;
	}

	public void setCantFlechas(Integer cantFlechas) {
		this.cantFlechas = cantFlechas;
		
	}
	
	public Integer getDanio() {
		return danio;
	}
      
	public void recargarFlechas() {
			this.setCantFlechas(this.getCantFlechas()+6);
	}
	
	public void atacarA(Unidad atacado) throws ExcepcionesAtaque {
		if(!this.puedeAtacar(atacado))throw new ExcepcionesAtaque("no puede atacar");
		if(this.puedeAtacar(atacado)==true) {
			this.setCantFlechas(this.getCantFlechas()-1);
			atacado.setSalud(atacado.getSalud()-this.getDanio());			
		}
	}
	
	public Boolean puedeAtacar(Unidad atacado) {
		if(this.estaMuerto()==true) return false;
		else if(this.getCantFlechas()==0) return false;
		else if(atacado.estaMuerto()==true) return false;
		else if((calcularDistancia(atacado)>=2) && (calcularDistancia(atacado)<=5)) return true;
		return false;
	}
	
	public String toString() {
		return "Arquero [Salud=" + getSalud() + "]";
	}
	
	
	
}
