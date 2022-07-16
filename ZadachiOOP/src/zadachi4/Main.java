package zadachi4;

import java.util.ArrayList;
import java.util.List;

public class Main {
		public static final List<Shape> listOfShapes = new ArrayList<Shape>();
	
		public static void main(String[] args) {
			listOfShapes.add(new Triangle(12,13));
			listOfShapes.add(new Kryg(10,10));
			listOfShapes.add(new Pravougulnik(13,23));
			
			for(Shape g : listOfShapes) {
				System.out.println("Radius : " + g.calculateSurface());
			}
		}
}
