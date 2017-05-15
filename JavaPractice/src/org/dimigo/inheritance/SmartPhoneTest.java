/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_ SmartPhoneTest
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 5. 12.
 * </pre>
 *
 * @author : yoojin
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SmartPhone[] phone = { new IPhone("iPhone 7", "애플", 900000), new Galaxy("갤럭시 S8", "삼성", 80000) };
		for (SmartPhone s : phone) {
			System.out.println(s);
			s.turnOn();
			s.pay();
			s.useSpecialFunction(s);
			s.turnOff();
		}
	}

}
