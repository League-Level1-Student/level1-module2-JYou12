package _07_tea_party;

import javax.swing.JOptionPane;

public class TeaParty {

	String greeting;
	String name;
	boolean isWoman;
	boolean isKnighted;

	public TeaParty() {



	}

	public String welcome(String name, boolean isWoman, boolean isKnighted) {

		greeting = "";
		if (name.isEmpty() == true){
			greeting = "";	
		}else if (isKnighted == true && isWoman == true) {
			greeting += "Hello Lady " + name;
		} else if (isKnighted == true && isWoman == false) {
			greeting += "Hello Sir " + name;
		}else if (isWoman == true && isKnighted == false) {
			greeting += "Hello Ms. " + name;
		} else if (isKnighted == false && isWoman == false){
			greeting += "Hello Mr. " + name;
		}
		
		
		System.out.println(greeting);

		return greeting;
		
	}

}
