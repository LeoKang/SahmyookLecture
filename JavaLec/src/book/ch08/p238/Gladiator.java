package book.ch08.p238;

public class Gladiator extends Character {
	int shield;

	public Gladiator(int hp, int power, int shield) {
		super(hp, power);
		this.shield = shield;
	}
	
	public void powerAttack(Object target) {
		System.out.println("파워공격");
	}
}
