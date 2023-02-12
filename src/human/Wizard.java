package human;

import bases.Human;
import util.Dice;

public class Wizard extends Human {
	
   public Wizard(String name, String weapon) {
		
		super(name,weapon);
		
		int hp = Dice.get(120, 180);
		
		super.setHp(hp);
		
		int offensive = Dice.get(12, 18);
		
		super.setOffensive(offensive);
		
		
	}

}
