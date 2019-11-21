package herencia;
import java.util.*;


public class Cliente extends Persona {
private int idCliente;
private Date fechaRegistro;
private boolean vip;
private static int contadorCliente;


public Cliente(Date fechaRegistro, boolean vip) {
	super();
	this.idCliente = contadorCliente++;
	this.setFechaRegistro(fechaRegistro);
	this.setVip(vip);
	
}

public int getIdCliente() {
	return idCliente;
}

public void setIdCliente(int idCliente) {
	this.idCliente = idCliente;
}

public Date getFechaRegistro() {
	return fechaRegistro;
}

public void setFechaRegistro(Date fechaRegistro) {
	this.fechaRegistro = fechaRegistro;
}

public boolean isVip() {
	return vip;
}

public void setVip(boolean vip) {
	this.vip = vip;
}

public static int getContadorCliente() {
	return contadorCliente;
}

public static void setContadorCliente(int contadorCliente) {
	Cliente.contadorCliente = contadorCliente;
}

@Override
public String toString() {
	return  super.toString() + "Cliente [idCliente=" + idCliente + ", fechaRegistro=" + fechaRegistro + ", vip=" + vip + "]";
}




	
}
