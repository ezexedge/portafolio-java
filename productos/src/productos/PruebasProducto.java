package productos;

public class PruebasProducto {

	public PruebasProducto() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto productos[];
		productos = new Producto[3];
		productos[0] = new Producto("jabon",22);
		productos[1] = new Perecedero("leche",50,2);
		productos[2] = new NoPerecedero("pelota",100,"juguete");
		
		for(int i = 0 ; i  < productos.length ; i++) {
			System.out.println(productos[i].calcular(1));
		}
		
		
	}

}
