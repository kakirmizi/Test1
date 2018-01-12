package cocktail_project;

import java.util.ArrayList;

public class StandardCocktailMixer extends CocktailMixer {
	
	private ArrayList<Zutat> zutaten = new ArrayList<>();
	
	public Cocktail mixen()
	{
		Cocktail c1 = new Cocktail();
		c1.uebertragen(zutaten);
		
		zutaten.removeAll(zutaten);
		
		return c1;
	}
	
	public void hinzufuegen(Zutat zutat)
	{
		zutaten.add(zutat);
	}
	
	public int getAnzahlZutaten()
	{
		return zutaten.size();
	}
}
