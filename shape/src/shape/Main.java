package shape;

public class Main {

	public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Rectangle(5, 10);
        shapes[1] = new Triangle(7, 8);
        shapes[2] = new Circle(5);
            
        for(int i = 0; i < shapes.length; i++) {
        	System.out.println("La superficie de " + shapes[i].getShapeName() + " es: " + shapes[i].calculateSurface());
        }
	}
}


