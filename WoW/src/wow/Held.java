package wow;

public class Held {

	String name;
	int HP;
	
	
	public Held(String name, int HP) {
		super();
		this.name = name;
		this.HP = HP;
	}



	public int attack(Held gegener){
		if(gegener.getHP()<10){
			return 10;
		}
		else{
			return 20;
		}
	}
	
	
	
	
	
	public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getHP() {
	return HP;
}


public void setHP(int hP) {
	HP = hP;
}

}
