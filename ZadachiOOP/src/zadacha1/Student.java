package zadacha1;

public class Student extends Human implements Comparable{
	public double grade;
	public Student(String name, String lastName,double grade) {
		super(name, lastName);
		this.grade=grade;
		// TODO Auto-generated constructor stub
	}
	
	public double getGrade() {
		return grade;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return lastName;
	}

	@Override
	public int compareTo(Object o) {
		if(this.getGrade()> ((Student) o).getGrade()) {
			return 1;
		}else if(this.getGrade() < ((Student) o).getGrade()) {
			return -1;
		}else
			
		// TODO Auto-generated method stub
		return 0;
	}
	

}