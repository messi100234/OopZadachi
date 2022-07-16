package zadachi4;

public class Triangle extends Shape{

	public Triangle(int height, int width) {
		super(height, width);
		// TODO Auto-generated constructor stub
	}
	
	public int calculateSurface() {
		int triangle = height*width;
		return triangle;
	}
	
}
