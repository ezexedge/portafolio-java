package abstractas;

public abstract class FiguraGeometrica {
	protected String tipoFigura;

	public FiguraGeometrica(String tipoFigura) {
		this.tipoFigura = tipoFigura;
		// TODO Auto-generated constructor stub
	}

	public String getTipoFigura() {
		return tipoFigura;
	}

	public void setTipoFigura(String tipoFigura) {
		this.tipoFigura = tipoFigura;
	}
	public abstract void dibujar();

	@Override
	public String toString() {
		return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
