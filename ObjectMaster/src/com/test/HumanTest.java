package com.test;
import com.human.*;
import com.wizard.*;
import com.ninja.*;
import com.samurai.*;

public class HumanTest {

	public static void main(String[] args) {
		Human kyle = new Human("Kyle");
		Human jen = new Human("Jen");
		Wizard hil = new Wizard("Hil");
//		hil.heal(jen);
//		hil.fireball(kyle);
		
		Ninja wren = new Ninja("Wren");
//		wren.steal(hil);
//		System.out.println(wren.runAway());
		
		Samurai bill = new Samurai("Bill");
//		Samurai ike = new Samurai("Ike");
//		bill.deathBlow(wren);
//		bill.deathBlow(hil);
//		bill.meditate();
//		bill.meditate();
		System.out.println(Samurai.howMany());
	}
	

}
