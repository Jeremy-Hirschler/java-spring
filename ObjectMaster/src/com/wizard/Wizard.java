package com.wizard;
import com.human.*;

public class Wizard extends Human {
	public Wizard(String name) {
		super(3, 3, 8, 50);
		this.name = name;
		
	}
	
	public void heal(Human a) {
		a.health += this.intelligence;
		System.out.println(String.format("%s is healed %d points by %s.", a.name, this.intelligence, this.name));
	}
	
	public void fireball(Human a) {
		int damage = this.intelligence * 3;
		a.health -= damage;
		System.out.println(String.format("%s takes %d damage from %s's fireball!", a.name, damage, this.name));
	}
}
