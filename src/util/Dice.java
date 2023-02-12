package util;

import java.util.Random;

public class Dice {
	private static Random r = new Random();

	// minからmaxまでの間で整数値のサイコロを振り、その値を戻り値とするメソッド
	public static int get(int min, int max) {
		return r.nextInt(max - min + 1) + min;
	}

}
