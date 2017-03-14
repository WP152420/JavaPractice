/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_ PrimitiveDataType
 *
 * 1. 개요 : 아이유 프로필 출력하기
 * 2. 작성일 : 2017. 3. 9.
 *</pre>
 *
 * @author : yoojin
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name="아이유";
		boolean isMale=false;
		int age=25;
		double height=161.8;
		float weight=44.3f;
		char bloodType='A';
		System.out.printf("<<아이유 프로필>>\n이름 : %s\n성별 : ",name);
		System.out.println(isMale?"남자":"여자");
		System.out.println("나이 : "+age+"세");
		System.out.printf("키 : %.1fcm\n몸무게 : %.1fkg\n혈액형 : %c형\n", height,weight,bloodType);

	}

}