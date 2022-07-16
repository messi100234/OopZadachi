package zadacha5;

import java.util.ArrayList;
import java.util.List;

public class Main {
		public static final List<Animal> listOfAnimals = new ArrayList<Animal>();
		public static void main(String[] args) {
			listOfAnimals.add(new Cat(1,"Tom","Muj"));
			listOfAnimals.add(new Dog(2,"Riki","Muj"));
			listOfAnimals.add(new Frog(5,"Viktor","Muj"));
			listOfAnimals.add(new Kitten(3,"Tomi","Jena"));
			listOfAnimals.add(new Tomcat(5,"Mari","Muj"));
			
				for(Animal g : listOfAnimals) {
					System.out.println("Ime : " + g.name + "  "+ "Vuzrast: " + g.age + "  " + "zvuk: " + g.zvuk);
				}
		}
}
