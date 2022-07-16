package zadacha1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
		public static final List<Student> listOfStudents = new ArrayList<Student>();	
		public static final List<Worker> listOfWorkers = new ArrayList<Worker>();
		@SuppressWarnings("unchecked")
		public static void main(String[] args) {
				listOfStudents.add(new Student("Vencislav","Hadjiev",5));
				listOfStudents.add(new Student("Mariq","Pancheva",6));
				listOfStudents.add(new Student("Martin","Stoqnov",4.78));
				listOfStudents.add(new Student("Blagovest","Stoqnov",3.30));
				listOfStudents.add(new Student("Marina","Deneva",2.30));
				listOfStudents.add(new Student("Martin","Rosenov",4.43));
				listOfStudents.add(new Student("Nikola","Petkov",5.45));
				listOfStudents.add(new Student("Ivana","Pancheva",5.20));
				listOfStudents.add(new Student("Ivan","Asenov",2.40));
				listOfStudents.add(new Student("Iliqna","Djodjova",4.23));
					for(Student g : listOfStudents) {
						System.out.println("================");
						System.out.println(" Ime : " + g.name + " familiq " + g.lastName + "ocenka " + g.grade);
					}
					Collections.sort(listOfStudents);
					for(Student sort : listOfStudents) {
						System.out.println("--------------" + " ime : " + sort.name + "familiq : " + sort.lastName + "Ocenka: " +sort.grade);
					}
				//Workers 	
				listOfWorkers.add(new Worker("Nikola", " Petkov",70,243));
				listOfWorkers.add(new Worker("Nikol", " Pancheva",100,240));
				listOfWorkers.add(new Worker("Venci", "Asenov",150,323));
				listOfWorkers.add(new Worker("Vasko", " Petkov",40,500));
				listOfWorkers.add(new Worker("Marin", " Petkov",35,434));
				listOfWorkers.add(new Worker("Borislav", " Petkov",100,352));
				listOfWorkers.add(new Worker("SOfiq", " Petkov",23,743));
				listOfWorkers.add(new Worker("Raq", " Petkov",56,353));
						Collections.sort(listOfWorkers);
						for(Worker sort : listOfWorkers) {
								System.out.println(" Ime : " + sort.name + " : " + sort.lastName + " = = = " + " Zaplata na rabotnik: " + sort.getZaplata());
						}
		
		
		}
}
