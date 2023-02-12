package Monster;

import bases.Monster;
import util.Dice;

public class Oak extends Monster {
	
	   public Oak(String name, String weapon) {
			
			super(name,weapon);
			
			int hp = Dice.get(170, 230);
			
			super.setHp(hp);
			
			int offensive = Dice.get(9, 15);
			
			super.setOffensive(offensive);
			
			
		}

}
