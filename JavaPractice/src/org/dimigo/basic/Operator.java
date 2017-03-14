/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ Operator
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 3. 14.
 * </pre>
 *
 * @author : yoojin
 * @version : 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int money = 1700000, employee = 3, store = 1500;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 :" + String.format("%, d", money) + "원");
		System.out.println("점포 내 직원 수 :" + employee + "명");
		System.out.println("점포 수 :" + String.format("%, d", store) + "개");
		System.out.println("\n\n연간 인건비 :" + String.format("%, d", (long) 12 * employee * store * money) + "원");

	}

}
