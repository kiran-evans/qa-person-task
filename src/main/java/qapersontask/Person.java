package qapersontask;

public class Person {
	private String name;
	private int age;
	private String jobTitle;
	private Pet pet;
	
	public Person() {}
	
	public Person(String name, int age, String jobTitle, Pet pet) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
		this.pet = pet;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getJobTitle() {
		return jobTitle;
	}
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "\nName: " + this.name + ", Age: " + this.age + ", Job Title: " + this.jobTitle + "\nPet: " + this.pet.toString();
	}
}
