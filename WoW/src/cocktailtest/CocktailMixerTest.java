package cocktailtest;

import static org.junit.Assert.*;

import org.junit.Test;

import cocktail_project.Banane;
import cocktail_project.Cocktail;
import cocktail_project.CocktailMixer;
import cocktail_project.Milch;
import cocktail_project.StandardCocktailMixer;

import cocktailtest.*;

public class CocktailMixerTest {

	private StandardCocktailMixer cocktailMixer = new StandardCocktailMixer();
	
	@Test
	public void testeCocktailMixer() {
		CocktailMixer cocktailMixer = new StandardCocktailMixer();
		Cocktail cocktail = cocktailMixer.mixen();
		assertNotNull(cocktail);
	}
	
	
	
	@Test
	public void testeAnzahlZutatenInCocktail() {
		Banane banane = new Banane();
		Milch milch = new Milch();
		cocktailMixer.hinzufuegen(banane);
		cocktailMixer.hinzufuegen(milch);
		assertEquals(2, this.cocktailMixer.getAnzahlZutaten());
		Cocktail cocktail = cocktailMixer.mixen();
		assertEquals(0, cocktailMixer.getAnzahlZutaten());
		assertEquals(2, cocktail.getAnzahlZutaten());
	}

}
