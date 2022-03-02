package qapersontask;

import java.util.Arrays;
import java.util.List;

public class PersonList {
	
	private Person person1 = new Person("John Smith", 45, "Painter");
	private Person person2 = new Person("Rita Skeeter", 30, "Journalist");
	private Person person3 = new Person("Mr Bean", 40, "Adventurer");
	
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
