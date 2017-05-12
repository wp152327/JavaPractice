/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 * 		|_ SmartPhoneTest
 * 
 * 1. Overview : 
 * 2. Date : 2017. 5. 12.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone[] sp = {
				new IPhone("iPhone7", "애플", 900000),
				new Galaxy("갤럭시 S8", "삼성", 800000)
		};
		
		for(SmartPhone phone : sp) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction(phone);
			phone.turnOff();
			System.out.println();
		}
	}

}
