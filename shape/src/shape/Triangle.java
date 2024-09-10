package shape;

public class Triangle extends Shape {
	public Triangle(double alto, double ancho) {
		super(alto, ancho);
	}
		
	public String getShapeName() {
		return shapeName = "Triangulo";
	}

	@Override
	double calculateSurface() {
		return alto*ancho/2;
	}
}
