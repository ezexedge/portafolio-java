
public class FizzBuzz {
	Integer valor;
	

	
	public boolean isDiv3(Integer valor){
		 boolean resultado = (valor%3==0)? true:false;
		return resultado;
	
	}
	public boolean isDiv5(Integer valor){
		 boolean resultado = (valor%5==0)? true:false;
			return resultado;
	}
	public boolean isDiv3y5(Integer valor){
		 boolean resultado = (valor%5==0 && valor%3==0)? true:false;
			return resultado;
	}
	

	

}
