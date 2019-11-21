package vehiculos;

public class Autobuses extends Vehiculos {
protected Personas[] pasajeros;
protected int cantidadPasajeros;
protected static int cantidadActualPasajeros;

	public Autobuses(int cantidadPasajeros) {
		super();
		this.cantidadPasajeros = cantidadPasajeros;
		cantidadActualPasajeros = 0;
		this.pasajeros = new Personas [this.cantidadPasajeros];
		// TODO Auto-generated constructor stub
	}
	
	
	
	

	public int getCantidadPasajeros() {
		return cantidadPasajeros;
	}





	public int getCantidadActualPasajeros() {
		return cantidadActualPasajeros;
	}





	public void setCantidadActualPasajeros(int cantidadActualPasajeros) {
		this.cantidadActualPasajeros = cantidadActualPasajeros;
	}





	public void setCantidadPasajeros(int cantidadPasajeros) {
		this.cantidadPasajeros = cantidadPasajeros;
	}

	public Boolean hayPasajeros() {
		return this.getCantidadActualPasajeros() > 0;
	}
	
	
	public Boolean cambiarChofer(Personas chofer) {
		
		if(this.hayPasajeros())return false;
		this.cambiarChofer(chofer);
		return true;
	}
	
	public Boolean hayCapacidad() {
		if(cantidadActualPasajeros<this.cantidadPasajeros)return true;
		else return false;
	}
	
	public Boolean setPasajeros(String nombre) {
		if(!this.hayCapacidad()) return false;
		this.pasajeros[cantidadActualPasajeros] = new Personas(nombre);
		this.setCantidadActualPasajeros(cantidadActualPasajeros+1);
		return true;
		
		
	}
	
	public String getNombrePasajero(int pasajero) {
		if(!this.hayPasajeros()) return "no hay pasajeros";
		return this.pasajeros[pasajero - 1].getNombre();
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
