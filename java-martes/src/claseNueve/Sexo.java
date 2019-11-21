package claseNueve;

public enum Sexo {

	F("mujer"),
	M("hombre");
	
	private String simbolo;
	
	private Sexo(String  s) {
		this.setSimbolo(s);
	}

	public String  getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}
	
	
}
