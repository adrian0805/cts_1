package eu.ase.ro;

public class Human implements Runner {

	private int age;
	public Human() {
		
	}
	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		if(age<50) {
			return 10;
		}
		else {
			return 7;
		}
	}
	@Override
	public String toString() {
		return "Human [age=" + age + "]";
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
