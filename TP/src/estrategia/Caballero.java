package estrategia;



public class Caballero extends Unidad implements Bebible {
   private Integer cantAtaques=0;
   private static Integer danio=50;
   
   
   public Caballero(Ubicacion ubicacion) {
	   super(ubicacion);
	   this.setSalud(200);
   }


 public Integer getCantAtaques() {
	return cantAtaques;
}


 public void setCantAtaques(Integer cantAtaques) {
	this.cantAtaques = cantAtaques;
}
 
 public Integer getDanio() {
		return danio;
	}
   
 public void atacarA(Unidad atacado) throws ExcepcionesAtaque {
	 if(!this.puedeAtacar(atacado))throw new ExcepcionesAtaque("no puede atacar");
	 if(this.puedeAtacar(atacado)==true) {
		atacado.setSalud(atacado.getSalud()- this.getDanio());
		this.setCantAtaques(this.getCantAtaques()+1);
	}
}
 
 public Boolean puedeAtacar(Unidad atacado) {
	 if(this.estaMuerto()==true) return false;
		else if(atacado.estaMuerto()==true) return false;
		else if(this.caballoRebelado()==true)return false;
		else if((calcularDistancia(atacado)>=1) && (calcularDistancia(atacado)<=2)) return true;
		return false;
	}

public Boolean caballoRebelado() {
	if (this.getCantAtaques()<=3)
		return false;
	return true;
		
}

public void recibeAgua() {
	this.setCantAtaques(0);
}

public String toString() {
	return "Caballero [Salud=" + getSalud() + "]";
}

}
