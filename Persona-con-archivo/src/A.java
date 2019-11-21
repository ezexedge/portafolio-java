
public class A {
private int n;

public void setN(int n) { 
this.n = n; 
}
public int getN() { 
return this.n; 
}

public A(int n) { 
setN(n); 
}
public A() { 
this(0); 
}





	@Override
public String toString() {
	return "A [n=" + n + "]";
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A(3);
		System.out.println(a1);
		
		A a2 = new A();
		System.out.println(a2);
	}

}
