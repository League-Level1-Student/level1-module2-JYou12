package _04_tea_maker;

import _04_tea_maker.Kettle.Water;

public class TeaMakerRunner {
public static void main(String[] args) {
	
	TeaBag teaBag = new TeaBag("mint");
	Cup cup = new Cup();
	Kettle kettle = new Kettle();	
	
	
	cup.makeTea(teaBag, water);
	
}
}
