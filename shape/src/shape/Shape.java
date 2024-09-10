package shape;

public abstract class Shape {
	protected String shapeName;
	protected double alto;
	protected double ancho;
	
	public Shape(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}
	
	public String getShapeName() {
		return shapeName;
	}
	
	public void setShapeName(String shapeName) {
		this.shapeName = shapeName;
	}
	
	public double getAlto() {
		return alto;
	}
	
	public void setAlto(double alto) {
		this.alto = alto;
	}
	
	public double getAncho() {
		return ancho;
	}
	
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	abstract double calculateSurface();
}
