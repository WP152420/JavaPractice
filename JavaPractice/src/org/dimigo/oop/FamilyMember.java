/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_ FamilyMember
 *
 * 1. 개요 :
 * 2. 작성일 : 2017. 4. 18.
 * </pre>
 *
 * @author : yoojin
 * @version : 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;

	FamilyMember() {
		memberCnt++;
	}

	FamilyMember(String memberName) {
		this();
		this.memberName = memberName;
		
	}

	public String getMemberName() {
		return memberName;
	}

	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수 : " + memberCnt + "명");
	}
}
