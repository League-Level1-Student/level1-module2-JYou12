package _02_sea_creature;

public class SeaCreatureRunner {

	static SeaCreature spongebob = new SeaCreature("Sponge Bob");
	static SeaCreature patrick = new SeaCreature("Patrick");
	static SeaCreature squidward = new SeaCreature("Squidward");
	
	public static void main(String[] args) {
		
		spongebob.eat();
		spongebob.laugh();
		
		System.out.println(patrick.getName());
		System.out.println(squidward.getName());
		
		patrick.eat();
		patrick.laugh();
		
		squidward.eat();
		squidward.laugh();
		
	}
}
