package tp1;

public class Soldado extends Unidad implements Bebible {
       private Integer energia=100;
       private static Integer danio=10;
       
       public Soldado (Ubicacion ubicacion) {
    	   super(ubicacion);
    	   this.setSalud(200);
       }

	public Integer getEnergia() {
		return energia;
	}

	public void setEnergia(Integer energia) {
		this.energia = energia;
	}
	
       
	public Integer getDanio() {
		return danio;
	}

	public void recibeAgua() {
		this.setEnergia(100);
	}
	
	public void atacarA(Unidad atacado) {
		if(this.puedeAtacar(atacado)==true){	
			this.setEnergia(this.getEnergia()-10);
			atacado.setSalud(atacado.getSalud()-this.getDanio());			
		}
	}
	
	public Boolean puedeAtacar(Unidad atacado) {
		if(estaMuerto()==true) return false;
		else if(this.getEnergia()<10) return false;
		else if(atacado.estaMuerto()==true) return false;
		else if(calcularDistancia(atacado)<=1)return true;
		return false;
	}

	@Override
	public String toString() {
		return "Soldado [Salud=" + getSalud() + "]";
	}
	
       
}
