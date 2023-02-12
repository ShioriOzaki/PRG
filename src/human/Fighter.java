package human;

import bases.Human;
import util.Dice;

public class Fighter extends Human {
   public Fighter(String name, String weapon) {
		
		super(name,weapon);
		
		int hp = Dice.get(240, 300);
		
		super.setHp(hp);
		
		int offensive = Dice.get(17, 23);
		
		super.setOffensive(offensive);
		
		
	}

}
