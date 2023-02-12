package bases;

import util.Dice;

public abstract class Human extends Living {
	
	// コンストラクタ
		public Human(String name, String weapon) {
			
			super(name,weapon);
		}

		// attackメソッドのオーバーライド
		@Override
		public void attack(Living target) {
			// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
			int num = Dice.get(1, 10);
			int Offensive = super.getOffensive();
			int Damage = Offensive * num;

			// 相手のHPをダメージ値だけ減らす
			int Targethp = target.getHp() - Damage;
			target.setHp(Targethp);

			// 自分の攻撃力を1だけ減らす
			int MyDamage = Offensive - 1;
			super.setOffensive(MyDamage);

			// コンソールにステータスを表示
			System.out.println(super.getName() + "が" + super.getWeapon() + "で攻撃!" + target.getName() + "に" + Damage + "のダメージを与えた");
			System.out.println("しかし自分の攻撃も1減少した。");

		}

}

