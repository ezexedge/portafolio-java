package datos;

public class FizzBuzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 0 ; i < 100;i++) {
			if(i%3==0) {
				
				System.out.println( "numero: " + i + " fizz" );
			}
			if(i%5==0) {
				System.out.println("numero: " + i + " buzz");
			}
		 if(i%5==0 && i%3==0) {
				System.out.println("numero: " + i +  " fizzBuzz");
			}
			
		}
		
	}

}
