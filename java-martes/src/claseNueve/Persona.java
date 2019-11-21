package claseNueve;

import java.util.Date;

public class Persona {
private String nya;
private Date fnac;
private Sexo sexo;
	public Persona(String nya, Date fnac , Sexo sexo) {
		this.setFnac(fnac);
		this.setNya(nya);
		this.setSexo(sexo);
		// TODO Auto-generated constructor stub
	}

	//si yo lo inicio con nombre y apellido por defecto el sexo es masculino
	
public Persona(String nya) {
	this(nya , new Date() , Sexo.M);
}

	public String getNya() {
		return nya;
	}


	public void setNya(String nya) {
		this.nya = nya;
	}


	public Date getFnac() {
		return fnac;
	}


	public void setFnac(Date fnac) {
		this.fnac = fnac;
	}


	public Sexo getSexo() {
		return sexo;
	}


	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}


	
	@Override
	public String toString() {
		return "Persona [nya=" + nya + ", fnac=" + fnac + ", sexo=" + sexo + "]";
	}



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

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Persona p1 = new Persona("ezequiel");
			System.out.println(p1.getSexo().getSimbolo());
			
	}

}
