/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 		|_ CarTest
 * 
 * 1. Overview : 
 * 2. Date : 2017. 3. 23.
 * </pre>
 * 
 * @author : cordelia273
 * @version : 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("<< 자동차 목록 >>");
		
		Car3 car1 = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);

		printCar3(car1);

		Car3 Car3 = new Car3("기아자동차", "K7", "흰색", 246);

		printCar3(Car3);

		Car3 car3 = new Car3("삼성자동차", "SM7", "회색");

		printCar3(car3);
	}
	
	public static void printCar3(Car3 car) {
		System.out.println("제조사명 : " + car.getCompany());
		System.out.println("모델명 : " + car.getModel());
		System.out.println("색상 : " + car.getColor());
		System.out.println("최대속도 : " + car.getMaxSpeed() + "km");
		System.out.printf("가격 : %,d원\n", car.getPrice());
		System.out.println();
	}

}
