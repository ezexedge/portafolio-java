package tp1;

public class Ubicacion {
	private Integer x;
    private Integer y;
    
    public Ubicacion(Integer x, Integer y) {
		this.setX(x);
		this.setY(y);
	}
      
      public Ubicacion () {
    	  this(0,0);
      }
      
      public Ubicacion (Integer xy) {
    	  this(xy,xy);
      }
    
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}
	
	public double calcularDistancia(Ubicacion ubicacion) {
		return Math.sqrt(Math.pow(this.getX() - ubicacion.getX(), 2) + (Math.pow(this.getY() - ubicacion.getY(), 2)));		
	}
	
	
    
    
}
