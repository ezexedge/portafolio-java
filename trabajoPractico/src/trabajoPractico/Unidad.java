package tp1;

public abstract class Unidad {
   private Ubicacion ubicacion;
   private Integer salud;
   
   public Unidad(Ubicacion ubicacion) {
	   this.setUbicacion(ubicacion);
   }



public Ubicacion getUbicacion() {
	return ubicacion;
}


public void setUbicacion(Ubicacion ubicacion) {
	this.ubicacion = ubicacion;
}



public Integer getSalud() {
	return salud;
}

public void setSalud(Integer salud) {
	this.salud = salud;
}


public abstract void atacarA(Unidad atacado);
public abstract Boolean puedeAtacar(Unidad atacado);

public double calcularDistancia(Unidad atacado) {
	return this.ubicacion.calcularDistancia(atacado.ubicacion)	;
}


public boolean estaMuerto() {
	if(this.getSalud()==0)
		return true;
	return false;
}

 /*public Boolean sePuedeAtacar(Unidad atacado) {
	 if(estaMuerto()==true) return false;
		else if(atacado.estaMuerto()==true) return false;
	 return true;
 }
*/
}



