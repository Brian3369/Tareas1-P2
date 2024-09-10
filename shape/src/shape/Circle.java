package shape;

public class Circle extends Shape {
	public Circle(double radio) {
        super(radio, radio);
	}
	
	public String getShapeName() {
		return shapeName = "Circulo";
	}

	@Override
    double calculateSurface() {
        double radio = ancho;
        return Math.PI * Math.pow(radio, 2);
	}	
}
