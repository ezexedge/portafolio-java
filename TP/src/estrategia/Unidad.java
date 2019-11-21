package estrategia;



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


public abstract void atacarA (Unidad atacado)throws  ExcepcionesAtaque;


public abstract Boolean puedeAtacar(Unidad atacado);

public double calcularDistancia(Unidad atacado) {
	return this.ubicacion.distanciaPuntos(atacado.ubicacion)	;
}


public boolean estaMuerto() {
	if(this.getSalud()==0)
		return true;
	return false;
}







@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Unidad other = (Unidad) obj;
	if (salud == null) {
		if (other.salud != null)
			return false;
	} else if (!salud.equals(other.salud))
		return false;
	if (ubicacion == null) {
		if (other.ubicacion != null)
			return false;
	} else if (!ubicacion.equals(other.ubicacion))
		return false;
	return true;
}







}



