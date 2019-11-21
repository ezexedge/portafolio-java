package vehiculos;

public class Vehiculos {
	protected int km;
	protected Personas chofer;

	@Override
	public String toString() {
		return "Vehiculos [km=" + km + "]";
	}

	public int getKm() {
		return km;
	}

	public void setKm(int km) {
		this.km = km;
	}

	
	public String getChofer() {
		return chofer.getNombre();
	}
	
	public Boolean cambiarChofer(Personas chofer) {
		this.setChofer(chofer);
		return true;
	}

	public void setChofer(Personas chofer) {
		this.chofer = chofer;
	}

	
	public Vehiculos() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
