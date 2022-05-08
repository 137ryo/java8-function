package main;

/**
 * Lambdaクラスから呼び出されるクラス
 * @author ryosei
 *
 */
public class LambdaSub {

	/**
	 * 大小比較を行う
	 * @param num1
	 * @param num2
	 * @return
	 */
	public Integer compare(Integer num1, Integer num2) {
		return num1.compareTo(num2);
	}
}
