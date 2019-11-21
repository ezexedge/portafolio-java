package abstractas;
import java.lang.*;
public class PrubaFigura {

	public PrubaFigura() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FiguraGeometrica f1 = new Rectangulo("rectangulo");
		f1.dibujar();
		
		String cadena = "nunusito";
		char c;
		for(int i = 1 ; i < cadena.length() ; i++) {
			c = cadena.charAt(i);
			System.out.println(c);
			if(c == 'u') {
				System.out.println("existe u");
			}
		}

	}

}
