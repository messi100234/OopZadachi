package zadachi4;

public class Shape {
		public int height;
		public int width;
		
	public Shape(int height,int width) {
		this.height=height;
		this.width=width;
	}
	
	public int calculateSurface(){
		int surfeis = height*width;
		return surfeis;
	}
	
	
}
