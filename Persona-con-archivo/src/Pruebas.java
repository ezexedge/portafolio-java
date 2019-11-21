import java.awt.List;
import java.util.ArrayList;

public class Pruebas {
    static ArrayList<Prueba> valores = new ArrayList<Prueba>(); 
    

	public Pruebas() {
		// TODO Auto-generated constructor stub
	}
	
	public static float precioTotal() {
		float acum = 0;
		for(Prueba p : valores) {
			
			if(p.getCantidad() > 1 ) {
				acum+=p.getPrecio()*p.getCantidad();
			}else {
				acum+=p.getPrecio();

			}
			
			
		}
		
		
		return acum;
		
		
	}
	
	public static void agregar(Prueba a){
		valores.add(a);
		
	}
	
	public static int tamanio() {
		return valores.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Prueba p2 = new Prueba(2,500);
	     Pruebas.agregar(p2);
	     System.out.println(Pruebas.tamanio());
	     
	     
	     System.out.println(Pruebas.precioTotal());

	}

}
