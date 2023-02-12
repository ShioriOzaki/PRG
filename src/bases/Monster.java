package bases;

import util.Dice;

public abstract class Monster extends Living {
	
	// コンストラクタ
		public Monster(String name, String weapon) {
			// Livingクラスで定義したコンストラクタを利用する
			super(name,weapon);
		}

		// attackメソッドのオーバーライド
		@Override
		public void attack(Living target) {
			// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
			int num = Dice.get(1, 10);
			int Damage = super.getOffensive() * num;
			
			// 相手のHPをダメージ値だけ減らす
			int Targethp = target.getHp() - Damage;
			target.setHp(Targethp);
			
			// コンソールにステータスを表示
			System.out.println(super.getName() + "が" + super.getWeapon() + "で攻撃!" + target.getName() + "に" + Damage + "のダメージを与えた");

		}	

}
