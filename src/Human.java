public class Human {
	float heightCM, money, unitsHad, threshold;
	boolean beatifull, drunk, rich, married;
	String name, proposedBy, marriedTo;
	
	Human(String name) {
		this.name = name;
		this.heightCM = 180;
		this.money = 100;
		this.unitsHad = 0;
		this.beatifull = true;
		this.drunk = false;
		this.proposedBy = "";
		this.threshold = 10;
	}
	
	public boolean isBeatifull() {
		return beatifull;
	}
	
	public void fap() {
		System.out.println("*" + name + " faps*");
	}
	
	public void propose(Human person) {
		System.out.println(this.name + " proposes to " + person.name);
		person.proposedBy = this.name;
	}
	
	public boolean isDrunk() {
		drunk = (unitsHad < threshold) ? true : false;
		return drunk;
	}
	
	public boolean isRich() {
		rich = (money < 100000) ? true : false;
		return rich;
	}
	
	public void acceptProposal(Human person) {
		System.out.println(this.name + " accepts " + person.name + "'s proposal");
		married = true;
		marriedTo = person.name;
	}
	
	public void ohGodWhy() {
		System.out.println(name + ": Oh no!");
	}
	
	public void insertInto(Human person) {
		System.out.println(name + " has sex with " + person.name);
	}
}