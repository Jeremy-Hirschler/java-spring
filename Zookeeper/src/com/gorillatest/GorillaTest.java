package com.gorillatest;
import com.gorilla.*;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla harambe = new Gorilla(100);
		harambe.displayEnergy();
		
		harambe.throwSomething();
		harambe.throwSomething();
		harambe.throwSomething();
		harambe.displayEnergy();
		
		harambe.eatBananas();
		harambe.eatBananas();
		harambe.displayEnergy();
		
		harambe.climb();
		harambe.displayEnergy();
	}

}
