
public class Referencia {
//paso por valor es esto y no por referencia
	public Referencia() {
		// TODO Auto-generated constructor stub
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		imprimir(x);
		cambiarValor(x);
		imprimir(x);
		
		//los valores primitivos no se pueden cambiar desde diferente metodos sino desde el mismo metodo
		
		//ej
		x=15;
		imprimir(x);
		
		//los valores que funcionan de manera distintas y cambian desde diferentes metodos son los objetos

	}
	
	public static void imprimir(int arg) {
	System.out.println("el valor es : " + arg);
	}
	public static void  cambiarValor(int i) {
		i = 200;
	}
	
}
