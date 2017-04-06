/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ SnackTest
 * 
 * 1. Overview : 
 * 2. Date : 2017. 4. 5.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class SnackTest {

	public static void main(String[] args) {
		int sum = 0;
		
		SnackTest st = new SnackTest();
			
		Snack[] snacks = {new Snack("새우깡", "농심", 1100, 2), new Snack("콘칲", "크라운", 1200, 1), new Snack("허니버터칩", "해태", 1500, 4)};
		for(Snack snack : snacks) {
			st.printProduct(snack);
			sum+=snack.calcPrice();
		}
		
		System.out.printf("총 구매 금액 : %,d원\n", sum);
	}
	
	public void printProduct(Snack snack) {
		System.out.println("이름 : " + snack.getName());
		System.out.println("제조사 : " + snack.getCompany());
		System.out.printf("가격 : %,d원\n", snack.getPrice());
		System.out.println("개수 : " + snack.getNumber() + "개");
		System.out.println();
	}

}
