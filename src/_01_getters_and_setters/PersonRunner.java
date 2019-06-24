package _01_getters_and_setters;

public class PersonRunner {

	public static void main(String[] args) {
		
		Person person1 = new Person(null, null);
		Person person2 = new Person(null, null);
		Person person3 = new Person(null, null);
		
		person1.setName("Jon");
		person1.setSuperpower("flight");
		
		person2.setName("Bob");
		person2.setSuperpower("sleeping");
		
		person3.setName("Jack");
		person3.setSuperpower("running");
		
		System.out.println(person1.getName() + " has mad " + person1.getSuperpower() + " skills");
		System.out.println(person2.getName() + " has mad " + person2.getSuperpower() + " skills");
		System.out.println(person3.getName() + " has mad " + person3.getSuperpower() + " skills");
	}
	
}
