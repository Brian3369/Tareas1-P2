package shape;

public class Rectangle extends Shape {
	
	public Rectangle(double alto, double ancho) {
		super(alto,ancho);
	}
	
	public String getShapeName() {
		return shapeName = "Rectangulo";
	}
	
	@Override
	double calculateSurface() {
		return alto*ancho;
	}
}
