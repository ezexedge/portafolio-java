package enumerado;

public enum Estado {

	POR_INICIAR("el proceso no inicio "),
	EN_PROGRESO("El proceso se encuentra en progreso"),
	FINALIZADO("el proceso finalizo corretamente"),
	ERROR("el proceso finalizo pero con errores");
	
	
	private String mensaje;
	private Estado(String mensaje) {
		this.mensaje = mensaje;
		
		// TODO Auto-generated constructor stub
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

}
