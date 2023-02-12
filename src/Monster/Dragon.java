package Monster;

import bases.Monster;
import util.Dice;

public class Dragon extends Monster {
	
	   public Dragon(String name, String weapon) {
			
			super(name,weapon);
			
			int hp = Dice.get(270, 330);
			
			super.setHp(hp);
			
			int offensive = Dice.get(12, 18);
			
			super.setOffensive(offensive);
			
			
		}


}
