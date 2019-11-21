
public class FizzBuzzPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FizzBuzz valor = new FizzBuzz();

		for(int i = 1;i<100;i++) {
			
			if(valor.isDiv3(i)) {
				System.out.println(i + " fizz");
			}
			if(valor.isDiv5(i)) {
				System.out.println(i + " buzz");
			}
			if(valor.isDiv3(i) && valor.isDiv5(i)) {
				System.out.println(i + " fizzbuzz");
			}
		}
		//podria hacerlo usando solamento un getTipo()
		//y pasandole un valor  dentro del for creo un fizzbuzz y le paso el i que recorra y
		//luego getTipo me devuelva los valores
		
		
	
	}

}
