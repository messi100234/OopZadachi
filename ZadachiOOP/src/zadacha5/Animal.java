package zadacha5;

public class Animal {
		public int age;
		public String name;
		public String gender;
		public String zvuk;
		
	public Animal(int age,String name,String gender) {
		this.age = age;
		this.name = name;
		this.gender=gender;
	}
	
	public final String zvuk() {
		return zvuk.toString();
	}
}
