package testpackage;

import static org.junit.Assert.*;

import org.junit.Test;

import wow.Held;

public class HeldTest {

	Held Held1 = new Held("Paladin",100);
	Held Held2 = new Held("Zauberer",-500000000);
	
	public HeldTest(){
	}
	
	@Test
	public void testattack() {
		assertTrue(Held2.attack(Held1)==20);
	}
	
	@Test
	public void testattack2() {
		assertTrue(Held1.attack(Held2)==10);
	}
}
