package encapsulamiento;

public class PruebaPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("didi","pepa",true);
		//System.out.println(p1.nombre); no puede acceder por que la referencia es privada
		//aca entramos por quue nuestro metodo es publico
		System.out.println(p1.getNombre());
		p1.setBorrado(false);
		System.out.println(p1);

		
	}

}
