package claseOcho;


public enum Cuadrante {
	I(1),
	II(2),
	III(3),
	IV(4),
	ORIGEN(0);
	private int cuadrante;
	
	private Cuadrante(int cuad) {
		this.setCuadrante(cuad);
	}

	public int getCuadrante() {
		return cuadrante;
	}

	public void setCuadrante(int cuadrante) {
		this.cuadrante = cuadrante;
	}
	
	
}
