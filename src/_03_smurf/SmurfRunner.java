package _03_smurf;

public class SmurfRunner {

	public static void main(String[] args) {
		
		Smurf handy = new Smurf("Handy");
		Smurf smerfette = new Smurf("Smerfette");
		Smurf papa = new Smurf("Papa");
		
		handy.eat();
		System.out.println(handy.getName());
		
		System.out.println(smerfette.getName());
		System.out.println(smerfette.getHatColor());
		System.out.println(smerfette.isGirlOrBoy());	
		
		System.out.println(papa.getName());
		System.out.println(papa.getHatColor());
		System.out.println(papa.isGirlOrBoy());
		
		
	}
	
}
