
public class ClaseThis {
	Integer a;
	Integer b;
	public ClaseThis(Integer a , Integer b) {
		
		this.setA(a);
		this.setB(b);
		
	}
	
	public ClaseThis() {
		this.setA(0);
		this.setB(0);
	}
	
	public int sumar() {
		return a + b;
	}
	public int mult() {
		return a * b;
	}

	public Integer getA() {
		return a;
	}


	public void setA(Integer a) {
		this.a = a;
	}



	public Integer getB() {
		return b;
	}


	public void setB(Integer b) {
		this.b = b;
	}
	
	
	
	


	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		ClaseThis val1 = new ClaseThis(2,2);
		System.out.println(val1.sumar());
		
	}

}
