package clasecinco;

public class Monedero {
	private Integer dinero;

	public Monedero(Integer dinero) {
		
		this.setDinero(dinero);
		
	}

	public int getDinero() {
		return dinero;
	}

	public void setDinero(int dinero) {
		this.dinero = dinero;
	}
	
	public void agregarPlate(int masDinero) {
		int valor =  this.getDinero() + masDinero;
		this.setDinero(valor);
	}
	public void sacarDinero(int menosDinero) {
		Integer valor = this.getDinero();
		if(this.getDinero()> menosDinero) {
				
			valor = this.getDinero() - menosDinero;
			this.setDinero(valor);
			
		}else {
			System.out.println("no tenes mas plata");
		}
		
		
	}
	
	public void saldoDisponible() {
	
		if(this.getDinero()>0) {
			System.out.println(this.getDinero());
		}
		else {
			System.out.println("no hay mas plata");
		}
	
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Monedero d1 = new Monedero(1000);
		d1.saldoDisponible();
		d1.sacarDinero(500);
		d1.saldoDisponible();
		d1.agregarPlate(1500);
		d1.saldoDisponible();

	}

}
