/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ IdolGroup
 * 
 * 1. Overview : 
 * 2. Date : 2017. 4. 7.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] groupName = {"빅뱅", "2NE1", "걸스데이"};
			String[][] memberName = {
					{"GD", "대성", "태양", "탑", "승리"},
					{"CL", "산다라박", "박봄", "민지"},
					{"유라", "혜리", "민아", "소진"}
			};
			
			for(int i=0; i<groupName.length; i++) {
				System.out.println("<<" + groupName[i] + ">>");
				for(int j=0; j<memberName[i].length; j++) {
					System.out.println(memberName[i][j]);
				}
				System.out.println();
			}
	}

}
