package zadachi4;

public class Pravougulnik extends Shape{

	public Pravougulnik(int height, int width) {
		super(height, width);
		// TODO Auto-generated constructor stub
	}
		
	
	public int calculateSurface() {
		int surface = height*width/2;
		return surface;
	}
}
