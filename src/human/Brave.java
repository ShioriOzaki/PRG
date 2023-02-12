package human;

import bases.Human;
import util.Dice;

public class Brave extends Human {
	public Brave(String name, String weapon) {
		
		super(name,weapon);
		
		int hp = Dice.get(170, 230);
		
		super.setHp(hp);
		
		int offensive = Dice.get(7, 13);
		
		super.setOffensive(offensive);
		
		
	}

}
