package book.ch08.p238;

public class Main {
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		Gladiator gladiator = new Gladiator(100, 50, 80);
		Wizard wizard = new Wizard();
		
		warrior.attack(gladiator);
		warrior.defence(wizard);
		
		gladiator.attack(wizard);
		gladiator.powerAttack(warrior);
		
		wizard.attack(warrior);
		wizard.healing(gladiator);
	}
}
