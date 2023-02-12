package Monster;

import bases.Monster;
import util.Dice;

public class Slime extends Monster {
	
   public Slime(String name, String weapon) {
		
	   super(name,weapon);
		
	   int hp = Dice.get(70, 130);
		
	   super.setHp(hp);
		
	   int offensive = Dice.get(5, 11);
		
	   super.setOffensive(offensive);
		
	}

}
