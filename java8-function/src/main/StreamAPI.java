package main;

import java.util.Arrays;
import java.util.List;

/**
 * Stream API
 * @author ryosei
 *
 */
public class StreamAPI {

	public static void main(String[] args) {

		/**
		 * イテレーションの拡張API
		 */

		/**
		 * 1~10まで格納されたリストの偶数のみを表示
		 * 下記のように繋げて記載することを推奨
		 *
		 * 中間操作は filter を使用
		 *
		 * 引数には T -> boolean となるラムダ式を渡す
		 * 式がTrueのものだけ集める
		 */
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		integerList.stream() // streamの取得
		        .filter(i -> i % 2 == 0) // 中間操作
		        .forEach(i -> System.out.println(i)); // 終端操作

		/**
		 * map
		 * 
		 * 引数には T -> U となるラムダ式を渡す
		 * 要素の変換を行う
		 * 複数繋げて書くこともできる
		 */
		List<Integer> integerList2 = Arrays.asList(1, 2, 3, 4, 5);
		integerList2.stream() // streamの取得
		        .map(i -> i * 2) // 中間操作
		        .forEach(i -> System.out.println(i)); // 終端操作
	}

}
