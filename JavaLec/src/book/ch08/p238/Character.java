package book.ch08.p238;

public class Character {
	int hp;
	int power;
	
	public Character() {
		
	}
	
	public Character(int hp, int power) {
		this.hp = hp;
		this.power = power;
	}
	
	public void attack(Object target) {
		System.out.println("공격");
	}
}
