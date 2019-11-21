import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FilaSupermercado {
	private Integer cantProductos;
	 int  CONTADOR = 0;
	private static Map<Integer, Integer> cola = new HashMap<Integer, Integer>();
    private static Map<Integer, Integer> colaB = new HashMap<Integer, Integer>();
    private static  Map<Integer, Integer> colaC = new HashMap<Integer, Integer>();
	

	public FilaSupermercado() {
		// TODO Auto-generated constructor stub
		
		
		
	}
	
	
	
	

	public Integer getCantProductos() {
		return cantProductos;
	}
	
	public void informarcionFila() {
		
		 cola.forEach((k,v) ->{
			
			System.out.println( "cantidad de productos: " + k + ": Posicion en fila: " + v);
		 });
		
		 
		 
		
	}




	public void setCantProductos(Integer cantProductos) {
		this.cantProductos = cantProductos;
	}

	
	public void agregoUnaProductos(Integer productos) {
		CONTADOR++;
		
		cola.put(productos,CONTADOR);
		
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		FilaSupermercado abrirFila = new FilaSupermercado();
		
		abrirFila.agregoUnaProductos(22);
		abrirFila.agregoUnaProductos(10);
		abrirFila.agregoUnaProductos(1);
		abrirFila.agregoUnaProductos(22);
		
		abrirFila.informarcionFila();
		
		
  
		 
		 
        
        
        Map<Integer, Integer> cola = new HashMap<Integer, Integer>();
        Map<Integer, Integer> colaB = new HashMap<Integer, Integer>();
        Map<Integer, Integer> colaC = new HashMap<Integer, Integer>();
        		

        cola.put(15, 1);
        cola.put(10, 2);
        cola.put(2, 3);
        cola.put(1, 4);
        
        
        colaB.putAll(cola);
        for (Iterator<Integer> keys = colaB.keySet().iterator(); keys.hasNext();) {
            Integer key = keys.next();
            Integer val = cola.get(key);
            if(key > 5) {
            	colaC.put(key, val);
            	cola.remove(key);
            	
            }
        }
        
        
        System.out.println(cola);   
        System.out.println(colaC);
        
        
       
        

        
     

    
	}

}
