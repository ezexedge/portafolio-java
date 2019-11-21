package vehiculos;

public class Motocicleta extends Vehiculos{
protected Personas acompanante;

public Motocicleta() {
	super();
	// TODO Auto-generated constructor stub
}

	public String getAcompanante() {
	return acompanante.getNombre();
}
	
public void setAcompanante(Personas acompanante) {
	this.acompanante = acompanante;
}

	
public Boolean hayAcompanante() {
	return this.getAcompanante()!=null;
}

public Boolean cambiarChofer(Personas chofer) {
	if(this.hayAcompanante())return false;
	this.cambiarChofer(chofer);
	return true;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
