package cocktail_project;

import java.util.ArrayList;

public class Cocktail {

	private ArrayList<Zutat> inhalt = new ArrayList<>();
	
	public void uebertragen(ArrayList<Zutat> inhalt)
	{
		this.inhalt.addAll(inhalt);
	}
	
	
	public int getAnzahlZutaten()
	{
		return inhalt.size();
	}
	
	
}