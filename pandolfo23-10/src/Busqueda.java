import java.security.InvalidParameterException;
import java.util.Collection;

public class Busqueda<E> {

	public Busqueda() {
		// TODO Auto-generated constructor stub
	}
	
	
	public static Boolean search(Collection<E>collection , E elemento ) throws InvalidParameterException{
		
		if(collection == null || elemento == null) throw new InvalidParameterException();
		for(E elementoIterador : collection) {
			if(elementoIterador.equals(elemento))
					return true;

		return false;
		
		}
	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		

	}

}
///generic esta clase vamos a ver todos lo que son genericos
//inplementar la clase ustiladdeas y la clase search y hacer un test con junit
//usar la versio junit la version 3
//hacerlo con busqueda binaria