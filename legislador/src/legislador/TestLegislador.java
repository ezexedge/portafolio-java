package legislador;

public class TestLegislador {

	public TestLegislador() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Legislador  p1 = new Diputado("pepito","mamani",22,false,"madrid",55);
		Legislador  p2 = new Diputado("pepa","mamani",42,true,"caba",55);
		
		NominaLegisladores listaCongreso = new NominaLegisladores();
		
		listaCongreso.agregarLegislador(p1);
		listaCongreso.agregarLegislador(p2);
		System.out.println(listaCongreso.getCantidad());
		
		
		listaCongreso.mostrar();

	}

}
