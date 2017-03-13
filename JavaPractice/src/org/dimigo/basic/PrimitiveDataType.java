/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 * 		|_ PrimitiveDataType
 * 
 * 1. Overview : Print Out IU Profile
 * 2. Date : 2017. 3. 9.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		
		System.out.printf("<< 아이유 프로필 >>\n");
		System.out.printf("이름 : %s\n", name);
		System.out.printf("성별 : %s\n", isMale?"남자":"여자");
		System.out.printf("나이 : %d세\n", age);
		System.out.printf("키 : %.1fcm\n", height);
		System.out.printf("몸무게 : %.1f\n", weight);
		System.out.printf("혈액형 : %c형\n", bloodType);
	}
}
