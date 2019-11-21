
public class Perro extends Animal{
	
	private String altura;

	public Perro(String altura,String raza) {
		super(raza);
		// TODO Auto-generated constructor stub
		this.setAltura(altura);
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}
	
	

}
