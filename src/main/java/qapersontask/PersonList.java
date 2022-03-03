package qapersontask;

import java.util.Arrays;
import java.util.List;

public class PersonList {
	
	private Person person1 = new Person("John Smith", 45, "Painter", new Pet("Fluffy", "Dog", 3));
	private Person person2 = new Person("Rita Skeeter", 30, "Journalist", new Pet("Slimy", "Slug", 1));
	private Person person3 = new Person("Mr Bean", 40, "Adventurer", new Pet("Gobble", "Turkey", 2));
	
	private List<Person> people = Arrays.asList(person1, person2, person3);
	
	public Person getByName(String name) {
		return
			people.stream()
				.filter(person -> person.getName().equals(name))
				.findAny()
				.get();
	}
	
	public void printAll() {
		people.stream()
			.forEach(person -> System.out.println(person.toString()));
		
	}

}
